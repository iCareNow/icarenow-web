package us.icarenow.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import us.icarenow.web.model.dto.UserCreationForm;
import us.icarenow.web.service.UserService;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String signupForm(UserCreationForm userCreationForm) {
        return "signup";
    }

    @PostMapping("/signup")
    public String addUser(@Valid UserCreationForm userCreationForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "signup";
        }

        System.out.println("Signup");
        userService.createUser(userCreationForm);
        return "redirect:/signup?success";
    }

    @GetMapping("/list")
    @PreAuthorize("hasRole('ADMIN')")
    public ModelAndView userListV1() {
        ModelAndView userListMV = new ModelAndView("users");
        userListMV.addObject("userList", userService.getAllUsers());

        return userListMV;
    }

    @GetMapping("/listV2")
    public String userListV2(Model model) {
        model.addAttribute("userList", userService.getAllUsers());

        return "users";
    }


}
