package us.icarenow.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import us.icarenow.web.controller.form.DoctorForm;
import us.icarenow.web.model.dto.DoctorUserDTO;
import us.icarenow.web.model.entity.Doctor;
import us.icarenow.web.model.entity.Specialty;
import us.icarenow.web.model.entity.User;
import us.icarenow.web.service.AdminService;
import us.icarenow.web.service.DoctorService;
import us.icarenow.web.service.UserService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private UserService userService;

    @GetMapping("/dashboard")

    public String dashboard() {
        return "icn-admin";
    }

    @PostMapping("/doctors")
    public ModelAndView addDoctorAction(@Valid @ModelAttribute("doctorForm") DoctorForm doctorForm, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return new ModelAndView("icn-doctors");
        }

        System.out.println(doctorForm.toString());
        adminService.addDoctor(doctorForm);

        List<Doctor> doctors = doctorService.getAllUsers();
        List<User> users = userService.getAllUsers();
        List<DoctorUserDTO> doctorUserDTOS = new ArrayList<>();
        doctors.forEach(doctor -> {
            DoctorUserDTO doctorUserDTO = new DoctorUserDTO();
            doctorUserDTO.setFirstName(doctor.getFirstName());
            doctorUserDTO.setLastName(doctor.getLastName());
            StringBuilder builder = new StringBuilder();
            for(int i=0; i<doctor.getSpecialty().size(); i++){
                builder.append(doctor.getSpecialty().get(i).getName());
                if(i<doctor.getSpecialty().size()-1){
                    builder.append(", ");
                }
            }
            doctorUserDTO.setMergedSpecialties(builder.toString());
            users.forEach(user -> {
                if(user.getId()==doctor.getUserId()){
                    doctorUserDTO.setEmail(user.getEmail());
                }
            });
            doctorUserDTOS.add(doctorUserDTO);
        });

        ModelAndView doctorListMV = new ModelAndView("icn-doctors", "doctorForm", new DoctorForm());
        doctorListMV.addObject("doctorList", doctorUserDTOS);
        return doctorListMV;
    }
    @GetMapping("/doctors")
    public ModelAndView addDoctorView() {
        List<Doctor> doctors = doctorService.getAllUsers();
        List<User> users = userService.getAllUsers();
        List<DoctorUserDTO> doctorUserDTOS = new ArrayList<>();
        doctors.forEach(doctor -> {
            DoctorUserDTO doctorUserDTO = new DoctorUserDTO();
            doctorUserDTO.setFirstName(doctor.getFirstName());
            doctorUserDTO.setLastName(doctor.getLastName());
            StringBuilder builder = new StringBuilder();
            for(int i=0; i<doctor.getSpecialty().size(); i++){
                builder.append(doctor.getSpecialty().get(i).getName());
                if(i<doctor.getSpecialty().size()-1){
                    builder.append(", ");
                }
            }
            doctorUserDTO.setMergedSpecialties(builder.toString());
            users.forEach(user -> {
                if(user.getId()==doctor.getUserId()){
                    doctorUserDTO.setEmail(user.getEmail());
                }
            });
            doctorUserDTOS.add(doctorUserDTO);
        });

        ModelAndView doctorListMV = new ModelAndView("icn-doctors", "doctorForm", new DoctorForm());
        doctorListMV.addObject("doctorList", doctorUserDTOS);
        return doctorListMV;
    }
    //TODO delete doctors
}