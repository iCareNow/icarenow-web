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
import us.icarenow.web.controller.form.AdDoctorForm;
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.model.entity.Doctor;
import us.icarenow.web.service.AddDoctorService;
import us.icarenow.web.service.SignUpService;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin/add-doctor")
public class AddDoctorController {

    @Autowired
    private AddDoctorService addDoctorService;

    @GetMapping
    public ModelAndView addDoctorView() {
        return new ModelAndView("icn-add-doctor", "doctorForm", new AdDoctorForm());
    }

    @PostMapping
    public String addDoctorAction(@Valid @ModelAttribute("doctorForm") AdDoctorForm doctorForm, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "icn-add-doctor";
        }

        System.out.println(doctorForm.toString());
        addDoctorService.addDoctor(doctorForm);

        return "icn-signup-confirmation";
    }
}