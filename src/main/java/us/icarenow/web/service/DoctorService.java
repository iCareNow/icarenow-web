package us.icarenow.web.service;

import com.sun.xml.bind.v2.TODO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.icarenow.web.controller.form.DoctorForm;
import us.icarenow.web.model.entity.Doctor;
import us.icarenow.web.model.entity.Role;
import us.icarenow.web.model.entity.Roles;
import us.icarenow.web.model.entity.Specialty;
import us.icarenow.web.repository.DoctorRepository;
import us.icarenow.web.repository.SpecialtyRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private SpecialtyRepository specialtyRepository;

    @Autowired
    ModelMapper modelMapper;

    public void addDoctor(DoctorForm doctorForm, long userId) {

       Doctor doctor = new Doctor(userId, doctorForm.getFirstName(), doctorForm.getLastName());
       Specialty specialty = specialtyRepository.findByName(doctorForm.getSpecialty());
       doctor.setSpecialty(Collections.singletonList(specialty));
       doctorRepository.save(doctor);

    }
    public List<Doctor> getAllUsers() {
        return doctorRepository.findAll()
                .stream()
                .map(doctor -> modelMapper.map(doctor, Doctor.class))
                .collect(Collectors.toList());
    }
}
