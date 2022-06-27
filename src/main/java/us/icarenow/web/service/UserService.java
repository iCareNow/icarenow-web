package us.icarenow.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import us.icarenow.web.controller.form.DoctorForm;
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.repository.UserRepository;
import us.icarenow.web.model.entity.Role;
import us.icarenow.web.model.entity.Roles;
import us.icarenow.web.model.entity.User;

import java.util.Arrays;

import static us.icarenow.web.model.entity.UserStatus.ACTIVE;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder pwdEncoder;
    @Autowired
    private PasswordEncoder pwdDoctorEncoder;


    public User createPatientUser(SignUpPatientForm patientForm) {
        User user = new User(patientForm.getEmail(), encodedPwd(patientForm));
        user.setRoles(Arrays.asList(new Role(Roles.PATIENT.toString())));
        user.setAccountStatus(ACTIVE.value());
        // TODO  send email (optional)
        return userRepository.save(user);
    }
    public User createDoctorUser(DoctorForm doctorForm) {
        User user = new User(doctorForm.getEmail(), encodedDoctorPwd(doctorForm));
        user.setRoles(Arrays.asList(new Role(Roles.DOCTOR.toString())));
        user.setAccountStatus(ACTIVE.value());
        // TODO  send email (optional)
        return userRepository.save(user);
    }

    private String encodedPwd(SignUpPatientForm patientForm) {
        return pwdEncoder.encode(patientForm.getPassword());
    }

    private String encodedDoctorPwd(DoctorForm doctorForm) {
        return pwdDoctorEncoder.encode(doctorForm.getPassword());
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepo.findOneByEmail(email).orElseThrow(()-> new UsernameNotFoundException(email));
    }
}






