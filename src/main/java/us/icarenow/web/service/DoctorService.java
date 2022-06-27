package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.icarenow.web.controller.form.DoctorForm;
import us.icarenow.web.repository.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;


    public void addDoctor(DoctorForm doctorForm, Long userId) {


       // TODO take info from doctorForm and Create doctor in DB
       //TODO doctorRepository.save(new doctor(userId, patientForm.getCnp(), patientForm.getFirstName(), patientForm.getLastName(), insurredPatient.isInssured()));
    }
}
