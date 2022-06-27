package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import us.icarenow.web.controller.form.AdDoctorForm;
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.repository.DoctorRepository;
import us.icarenow.web.repository.PatientRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;


    public void addDoctor(AdDoctorForm doctorForm, Long userId) {

        // TODO Call CNSAS - use RestTemplate
       //TODO InsurredPatient insurredPatient = restTemplate.getForObject("http://cnass/12732131232", InsurredPatient.class);
       //TODO patientRepository.save(new Patient(userId, patientForm.getCnp(), patientForm.getFirstName(), patientForm.getLastName(), insurredPatient.isInssured()));
    }
}
