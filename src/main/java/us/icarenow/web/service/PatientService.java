package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.model.entity.Patient;
import us.icarenow.web.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public void createPatient(SignUpPatientForm patientForm, int userId) {
        // 1. Call CNSAS - use RestTemplate
        boolean insured = true;
        // 2. Store patient in db
        patientRepository.save(new Patient(userId, patientForm.getCnp(), patientForm.getFirstName(), patientForm.getLastName(), insured));
    }
}
