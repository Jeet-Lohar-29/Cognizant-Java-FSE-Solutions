package com.cognizant.spring_learn.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Department {

    @NotNull(message = "Department Id cannot be null")
    private Integer id;

    @NotBlank(message = "Department name cannot be blank")
    @Size(min = 1, max = 30,
        message = "Department name should contain 1 to 30 characters")
    private String name;

    public Department() {
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}