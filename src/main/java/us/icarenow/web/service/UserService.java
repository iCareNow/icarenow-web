package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.repository.UserRepository;
import us.icarenow.web.model.entity.Role;
import us.icarenow.web.model.entity.User;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserRepository userRepository;

    public User createPatientUser(SignUpPatientForm patientForm) {
        // 0. Set role on user Role.PATIENT
        // 1. save to db
        // 2. send email (optional)
        return userRepository.save(new User(patientForm.getEmail(), patientForm.getPassword()));
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepo.findOneByEmail(email).orElseThrow(()-> new UsernameNotFoundException(email));
    }
}






