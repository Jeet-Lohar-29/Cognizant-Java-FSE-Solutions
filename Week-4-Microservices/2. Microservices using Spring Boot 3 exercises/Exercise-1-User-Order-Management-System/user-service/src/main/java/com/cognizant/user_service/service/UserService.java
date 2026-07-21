package com.cognizant.user_service.service;

import com.cognizant.user_service.model.User;
import com.cognizant.user_service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUser(Long id) {
        return repository.findById(id).orElse(null);
    }
}