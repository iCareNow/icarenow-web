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

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/doctors")
    public ModelAndView addDoctorView() {
        return new ModelAndView("icn-doctor", "doctorForm", new DoctorForm());
    }

    @PostMapping("/doctors")
    public String addDoctorAction(@Valid @ModelAttribute("doctorForm") DoctorForm doctorForm, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "icn-doctor";
        }

        System.out.println(doctorForm.toString());
        adminService.addDoctor(doctorForm);

        return "icn-signup-confirmation";
    }
}