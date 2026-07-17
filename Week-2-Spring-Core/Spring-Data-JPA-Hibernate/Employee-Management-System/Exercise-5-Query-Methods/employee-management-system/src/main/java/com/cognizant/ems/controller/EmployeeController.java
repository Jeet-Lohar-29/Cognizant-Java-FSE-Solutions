package com.cognizant.ems.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.cognizant.ems.entity.Employee;
import com.cognizant.ems.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id,
                                   @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully";
    }

    @GetMapping("/search/name/{name}")
    public List<Employee> searchByName(@PathVariable String name) {
        return employeeService.searchByName(name);
    }

    @GetMapping("/search/email/{email}")
    public Employee searchByEmail(@PathVariable String email) {
        return employeeService.searchByEmail(email);
    }

    @GetMapping("/search/named/{name}")
    public List<Employee> searchByNamedQuery(@PathVariable String name) {
        return employeeService.searchByNamedQuery(name);
    }
}