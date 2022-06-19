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

    public void createPatient(SignUpPatientForm patientForm, int userId) {
        // TODO Call CNSAS - use RestTemplate
       //TODO InsurredPatient insurredPatient = restTemplate.getForObject("http://cnass/12732131232", InsurredPatient.class);
       //TODO patientRepository.save(new Patient(userId, patientForm.getCnp(), patientForm.getFirstName(), patientForm.getLastName(), insurredPatient.isInssured()));
    }
}