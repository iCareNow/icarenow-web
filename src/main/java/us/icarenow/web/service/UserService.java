package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.model.entity.Role;
import us.icarenow.web.model.entity.Roles;
import us.icarenow.web.model.entity.User;
import us.icarenow.web.repository.UserRepository;

import java.util.Arrays;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createPatientUser(SignUpPatientForm patientForm) {
        User user = new User(patientForm.getEmail(), patientForm.getPassword());
        user.setRoles(Arrays.asList(new Role(Roles.PATIENT.toString())));
        // TODO send email (optional)
        return userRepository.save(user);
    }
}
