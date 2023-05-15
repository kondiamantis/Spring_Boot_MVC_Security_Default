package com.luv2code.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){

        //just returns the name of the html file that will be loaded
        //i have to create manually this file
        return "fancy-login";
    }

    //add request mapping for /access-denied
    @GetMapping("/access-denied")
    public String showAccessDenied(){

        //just returns the name of the html file that will be loaded
        //i have to create manually this file
        return "access-denied";
    }
}
