package com.cognizant.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.ems.entity.Employee;
import com.cognizant.ems.repository.EmployeeRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> searchByName(String name) {
        return employeeRepository.findByName(name);
    }

    public Employee searchByEmail(String email) {
        return employeeRepository.getEmployeeByEmail(email);
    }

    public List<Employee> searchByNamedQuery(String name) {
        return employeeRepository.findByEmployeeName(name);
    }

    public Page<Employee> getEmployees(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);

        return employeeRepository.findAll(pageable);
    }

    public Page<Employee> getEmployeesSorted(int page,
                                            int size,
                                            String field) {

        Pageable pageable =
                PageRequest.of(page, size, Sort.by(field));

        return employeeRepository.findAll(pageable);
    }

    public Page<Employee> getEmployeesSortedDesc(int page,
                                                int size,
                                                String field) {

        Pageable pageable =
                PageRequest.of(page,
                            size,
                            Sort.by(field).descending());

        return employeeRepository.findAll(pageable);
    }
}