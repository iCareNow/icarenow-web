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
import us.icarenow.web.controller.form.AddDoctorForm;
import us.icarenow.web.service.AdminService;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/doctors")
    public ModelAndView addDoctorView() {
        return new ModelAndView("icn-add-doctor", "doctorForm", new AddDoctorForm());
    }

    @PostMapping("/doctors")
    public String addDoctorAction(@Valid @ModelAttribute("doctorForm") AddDoctorForm doctorForm, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "icn-add-doctor";
        }

        System.out.println(doctorForm.toString());
        adminService.addDoctor(doctorForm);

        return "icn-signup-confirmation";
    }
}