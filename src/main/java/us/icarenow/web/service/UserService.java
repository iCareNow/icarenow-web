package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.repository.UserRepository;
import us.icarenow.web.model.entity.Role;
import us.icarenow.web.model.entity.Roles;
import us.icarenow.web.model.entity.User;

import java.util.Arrays;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserRepository userRepository;

    public User createPatientUser(SignUpPatientForm patientForm) {
        User user = new User(patientForm.getEmail(), patientForm.getPassword());
//    TODO    user.setRoles(Arrays.asList(new Role(Roles.PATIENT.toString())));
        // TODO  send email (optional)
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepo.findOneByEmail(email).orElseThrow(()-> new UsernameNotFoundException(email));
    }
}






