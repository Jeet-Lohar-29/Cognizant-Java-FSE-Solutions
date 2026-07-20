package com.cognizant.spring_learn.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Skill {

    @NotNull(message = "Skill Id cannot be null")
    private Integer id;

    @NotBlank(message = "Skill name cannot be blank")
    @Size(min = 1, max = 30,
        message = "Skill name should contain 1 to 30 characters")
    private String name;

    public Skill() {
    }

    public Skill(int id, String name) {
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
        return "Skill [id=" + id + ", name=" + name + "]";
    }
}