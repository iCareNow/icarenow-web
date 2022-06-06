package us.icarenow.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PagesController {
    @GetMapping("sign-in.html")
    private String getSignInPage(){

        return "sign-in.html";
    }
    @GetMapping("sign-up.html")
    private String getSignUpPage(){

        return "sign-up.html";
    }
}
