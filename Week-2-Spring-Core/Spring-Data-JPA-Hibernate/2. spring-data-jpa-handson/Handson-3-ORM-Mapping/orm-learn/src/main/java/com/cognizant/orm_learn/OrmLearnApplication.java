package com.cognizant.ormlearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("======================================");
        System.out.println("ORM Mapping Project Started Successfully");
        System.out.println("Employee Entity Loaded");
        System.out.println("Department Entity Loaded");
        System.out.println("Skill Entity Loaded");
        System.out.println("======================================");

    }
}