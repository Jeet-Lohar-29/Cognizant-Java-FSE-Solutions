package com.cognizant.springtest;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User saveUser(User user) {
        return user;
    }

}