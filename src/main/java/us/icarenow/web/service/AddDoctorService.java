package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import us.icarenow.web.controller.form.AdDoctorForm;
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.model.entity.User;
import us.icarenow.web.repository.DoctorRepository;
import us.icarenow.web.repository.PatientRepository;

import javax.transaction.Transactional;

@Service
public class AddDoctorService {

    @Autowired
    private UserService userService;

    @Autowired
    private DoctorService doctorService;


    public void addDoctor(AdDoctorForm doctorForm) {
        User user = userService.createDoctorUser(doctorForm);
        doctorService.addDoctor(doctorForm, user.getId());
    }


}
