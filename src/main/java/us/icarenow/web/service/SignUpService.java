package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.model.entity.User;

import javax.transaction.Transactional;

@Service
public class SignUpService {

    @Autowired
    private UserService userService;

    @Autowired
    private PatientService patientService;

    @Transactional
    public void signUp(SignUpPatientForm patientForm) {
        User user = userService.createPatientUser(patientForm);
        patientService.createPatient(patientForm, user.getId());
    }
}
