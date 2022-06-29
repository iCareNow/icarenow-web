package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.icarenow.web.controller.form.DoctorForm;
import us.icarenow.web.model.entity.Doctor;
import us.icarenow.web.repository.DoctorRepository;


@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public void addDoctor(DoctorForm doctorForm, long userId) {

       Doctor doctor = new Doctor(userId, doctorForm.getFirstName(), doctorForm.getLastName());

       doctorRepository.save(doctor);

    }
}
