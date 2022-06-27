package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.icarenow.web.controller.form.DoctorForm;
import us.icarenow.web.model.entity.User;

@Service
public class AdminService {

    @Autowired
    private UserService userService;

    @Autowired
    private DoctorService doctorService;


    public void addDoctor(DoctorForm doctorForm) {
        User user = userService.createDoctorUser(doctorForm);
        doctorService.addDoctor(doctorForm, user.getId());
    }


}
