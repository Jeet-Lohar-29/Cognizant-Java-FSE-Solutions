package com.cognizant.spring_learn.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.spring_learn.exception.EmployeeNotFoundException;
import com.cognizant.spring_learn.model.Department;
import com.cognizant.spring_learn.model.Employee;
import com.cognizant.spring_learn.model.Skill;

@Repository
public class EmployeeDao {

    private static final List<Employee> employeeList = new ArrayList<>();

    static {

        Department department = new Department(1, "IT");

        Skill java = new Skill(1, "Java");
        Skill spring = new Skill(2, "Spring Boot");

        employeeList.add(
                new Employee(
                        1,
                        "John",
                        85000,
                        true,
                        new Date(),
                        department,
                        Arrays.asList(java, spring)
                )
        );
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee updateEmployee(Employee employee)
            throws EmployeeNotFoundException {

        for (int i = 0; i < employeeList.size(); i++) {

            if (employeeList.get(i).getId().equals(employee.getId())) {

                employeeList.set(i, employee);

                return employee;
            }
        }

        throw new EmployeeNotFoundException(
                "Employee with id "
                        + employee.getId()
                        + " not found");
    }
}