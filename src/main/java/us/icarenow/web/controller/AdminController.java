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
import us.icarenow.web.service.AdminService;
import us.icarenow.web.service.DoctorService;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/dashboard")

    public String dashboard() {
        return "icn-admin";
    }

//    @GetMapping("/doctors")
//    public ModelAndView addDoctorView() {
//        return new ModelAndView("admin-doctors", "doctorForm", new DoctorForm());
//    }

    @PostMapping("/doctors")
    public String addDoctorAction(@Valid @ModelAttribute("doctorForm") DoctorForm doctorForm, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "icn-doctors";
        }

        System.out.println(doctorForm.toString());
        adminService.addDoctor(doctorForm);

        return "icn-doctors";
    }
    @GetMapping("/doctors")
    public ModelAndView addDoctorView() {
        ModelAndView doctorListMV = new ModelAndView("icn-doctors", "doctorForm", new DoctorForm());
        doctorListMV.addObject("doctorList", doctorService.getAllUsers());
        return doctorListMV;

    }
//    public ModelAndView userList() {
//        ModelAndView userListMV = new ModelAndView("icn-doctors");
//        userListMV.addObject("doctorList", doctorService.getAllUsers());
//        return userListMV;
//    }
}