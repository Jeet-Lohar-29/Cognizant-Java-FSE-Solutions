package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.validation.Valid;

import java.util.List;

import com.cognizant.spring_learn.exception.EmployeeNotFoundException;
import com.cognizant.spring_learn.model.Employee;
import com.cognizant.spring_learn.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @PutMapping
    public Employee updateEmployee(
            @Valid @RequestBody Employee employee)
            throws EmployeeNotFoundException {

        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id)
            throws EmployeeNotFoundException {

        LOGGER.info("START");

        employeeService.deleteEmployee(id);

        LOGGER.info("END");

        return ResponseEntity.ok("Employee deleted successfully");
    }
}