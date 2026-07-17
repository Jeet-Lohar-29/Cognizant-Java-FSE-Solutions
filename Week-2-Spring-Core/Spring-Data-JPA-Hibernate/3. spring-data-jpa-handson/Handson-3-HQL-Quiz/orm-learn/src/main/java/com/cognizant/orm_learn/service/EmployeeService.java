package com.cognizant.ormlearn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> getAllPermanentEmployees() {
        return employeeRepository.getAllPermanentEmployees();
    }

    @Transactional
    public Employee get(int id) {
        LOGGER.info("Start");
        LOGGER.debug("Employee id: {}", id);
        Employee employee = employeeRepository.findById(id).orElse(null);
        LOGGER.debug("Employee: {}", employee);
        LOGGER.info("End");
        return employee;
    }

    @Transactional
    public void save(Employee employee) {
        LOGGER.info("Start");
        LOGGER.debug("Employee: {}", employee);
        employeeRepository.save(employee);
        LOGGER.info("End");
    }

}
