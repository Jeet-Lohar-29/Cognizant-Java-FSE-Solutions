package com.cognizant.springtest;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    void testFindByName() {

        repository.save(new User(1L, "Jeet"));
        repository.save(new User(2L, "Rahul"));

        List<User> users = repository.findByName("Jeet");

        assertEquals(1, users.size());
        assertEquals("Jeet", users.get(0).getName());

    }

}