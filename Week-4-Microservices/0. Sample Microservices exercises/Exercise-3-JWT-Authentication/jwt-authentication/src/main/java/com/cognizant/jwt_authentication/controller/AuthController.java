package com.cognizant.jwt_authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt_authentication.security.JwtTokenProvider;

@RestController
public class AuthController {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @GetMapping("/")
    public String home() {

        return "JWT Authentication Service Running";

    }

    @GetMapping("/token")
    public String generateToken(@RequestParam String username) {

        return jwtTokenProvider.createToken(username);

    }

    @GetMapping("/secure")
    public String secure() {

        return "JWT Authentication Successful";

    }

}