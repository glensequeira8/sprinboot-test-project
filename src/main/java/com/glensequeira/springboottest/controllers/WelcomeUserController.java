package com.glensequeira.springboottest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeUserController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome!! you are logged in now!";
    }
}
