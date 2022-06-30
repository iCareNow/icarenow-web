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

    public void createPatient(SignUpPatientForm patientForm, Long userId) {

        String insuredPatient = restTemplate.getForObject("http://localhost:8081/insurances/" + patientForm.getCnp(), String.class);

        byte insured = isInsuredPatient.insuredResponse(insuredPatient.toString());
        patientRepository.save(new Patient(userId, patientForm.getCnp(), patientForm.getFirstName(), patientForm.getLastName(), insured));
    }
}
