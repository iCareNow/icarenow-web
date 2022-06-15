package us.icarenow.web.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import us.icarenow.web.model.dto.UserCreationForm;
import us.icarenow.web.model.dto.UserDTO;
import us.icarenow.web.model.entity.Role;
import us.icarenow.web.model.entity.User;
import us.icarenow.web.repository.UserRepository;

import javax.persistence.EntityNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ModelMapper modelMapper;

    public void createUser(UserCreationForm userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setStatus((byte)1);
        if ("libenciuc.adrian@yahoo.com".equals(userDTO.getEmail())) {
            user.setRoles(Arrays.asList(new Role("ADMIN")));
        } else {
            user.setRoles(Arrays.asList(new Role("DOCTOR")));
        }

        userRepo.save(user);
    }

    public List<UserDTO> getAllUsers() {
        return userRepo.findAll()
                .stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    public UserDTO getUser(long id) {
        return userRepo.findById(id)
                .map(user -> modelMapper.map(user, UserDTO.class))
                .orElseThrow(EntityNotFoundException::new);
    }

    public void update(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);

        userRepo.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepo.findOneByEmail(email).orElseThrow(()-> new UsernameNotFoundException(email));
    }
}





