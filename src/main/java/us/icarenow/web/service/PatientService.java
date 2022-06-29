package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.model.entity.Patient;
import us.icarenow.web.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private InsuredPatient isInsuredPatient;
//    InsuredPatient isInsuredPatient = new InsuredPatient();

    public void createPatient(SignUpPatientForm patientForm, Long userId) {

        // TODO Call CNSAS - use RestTemplate
       //TODO InsurredPatient insurredPatient = restTemplate.getForObject("http://cnass/12732131232", InsurredPatient.class);
        String insuredPatient = restTemplate.getForObject("http://localhost:8081/insurances/"+patientForm.getCnp(), String.class);
//       String insuredPatient = restTemplate.getForObject("http://localhost:8081/insurances/1870511125802", String.class);

//       System.out.println(insuredPatient);
       isInsuredPatient.insuredResponse(insuredPatient.toString());
//       patientRepository.save(new Patient(userId, patientForm.getCnp(), patientForm.getFirstName(), patientForm.getLastName(), insurredPatient));
    }
}
