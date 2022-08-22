package com.glensequeira.springboottest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.glensequeira.springboottest.Util.JWTUtility;
import com.glensequeira.springboottest.dao.AuthRequest;

@RestController
public class WelcomeUserController {
    @Autowired
    private JWTUtility jwtUtility;


    @Autowired
    private AuthenticationManager authenticationManager;
    @GetMapping("/")
    public String welcome(){
        return "Welcome!! you are logged in now!";
    }
    @PostMapping("/authenticate")
    public String generateJwtToken(@RequestBody AuthRequest req) throws Exception{
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
            req.getUserName(),req.getPassword()));    
        }catch(Exception e){
            throw new Exception("Invalid Username  or Password!");
        }
        return jwtUtility.generateToken(req.getUserName());
    }
}
