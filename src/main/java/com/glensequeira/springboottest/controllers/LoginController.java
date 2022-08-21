package com.glensequeira.springboottest.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.glensequeira.springboottest.dao.UserDao;
import com.glensequeira.springboottest.repositories.UserRepo;

@Controller
public class LoginController {
    @Autowired
    private UserRepo UserRepo;

    @PostConstruct    
    private void initUsers(){
        List<UserDao> users=Stream.of(
            new UserDao(101,"glensqr","123abc123","sqr@gmail.com"),
            new UserDao(104,"glensqr23","123abc23","sqr23@gmail.com"),
            new UserDao(107,"glensqr78","123abc78","sqr78@gmail.com"),
            new UserDao(108,"glensqr12","123abc","sqr12@gmail.com")
        ).collect(Collectors.toList());
        UserRepo.saveAll(users);
    }
}
