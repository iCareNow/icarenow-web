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
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.service.SignUpService;
import javax.validation.Valid;

@Controller
@RequestMapping("/signup")
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping
    public ModelAndView signUpView() {
        return new ModelAndView("icn-signup", "patientForm", new SignUpPatientForm());
    }

    @PostMapping
    public String signUpAction(@Valid @ModelAttribute("patientForm") SignUpPatientForm patientForm, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "icn-signup";
        }

        System.out.println(patientForm.toString());
        signUpService.signUp(patientForm);

        return "icn-signup-confirmation";
    }
}