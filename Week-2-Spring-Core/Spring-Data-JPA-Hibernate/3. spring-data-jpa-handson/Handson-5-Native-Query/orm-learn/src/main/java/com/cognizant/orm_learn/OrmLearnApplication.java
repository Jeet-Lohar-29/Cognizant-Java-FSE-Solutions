package com.cognizant.ormlearn;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService;

    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);
        skillService = context.getBean(SkillService.class);

        // testGetAllPermanentEmployees();
        // testGetEmployee();
        // testGetDepartment();
        // testAddEmployee();
        // testUpdateEmployee();
        // testAddSkillToEmployee();
        testGetAverageSalary();
    }

    private static void testGetAllPermanentEmployees() {
        LOGGER.info("Start");

        List<Employee> employees = employeeService.getAllPermanentEmployees();
        LOGGER.debug("Permanent Employees: {}", employees);

        employees.forEach(employee -> LOGGER.debug("Skills: {}", employee.getSkillList()));

        LOGGER.info("End");
    }

    private static void testGetDepartment() {
        LOGGER.info("Start");

        Department department = departmentService.get(1);
        LOGGER.debug("Department:{}", department);
        LOGGER.debug("Employees:{}", department.getEmployeeList());

        LOGGER.info("End");
    }

    private static void testGetEmployee() {
        LOGGER.info("Start");

        Employee employee = employeeService.get(1);
        if (employee == null) {
            LOGGER.debug("No employee found");
            LOGGER.info("End");
            return;
        }

        LOGGER.debug("Employee: {}", employee);
        LOGGER.debug("Department:{}", employee.getDepartment());
        LOGGER.debug("Skills:{}", employee.getSkillList());

        LOGGER.info("End");
    }

    private static void testAddEmployee() throws Exception {
        LOGGER.info("Start");

        Employee employee = new Employee();
        employee.setName("Jeet Lohar");
        employee.setSalary(50000);
        employee.setPermanent(true);
        employee.setDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").parse("2002-03-04"));

        Department department = departmentService.get(1);
        employee.setDepartment(department);

        employeeService.save(employee);
        LOGGER.debug("Saved Employee: {}", employee);

        LOGGER.info("End");
    }

    private static void testUpdateEmployee() {
        LOGGER.info("Start");

        Employee employee = employeeService.get(1);
        Department department = departmentService.get(2);
        employee.setDepartment(department);

        employeeService.save(employee);
        LOGGER.debug("Updated Employee: {}", employee);

        LOGGER.info("End");
    }

    private static void testAddSkillToEmployee() {
        LOGGER.info("Start");

        Employee employee = employeeService.get(1);
        Skill skill = skillService.get(2);

        if (employee == null || skill == null) {
            LOGGER.debug("Employee or skill not found");
            LOGGER.info("End");
            return;
        }

        Set<Skill> skillList = employee.getSkillList();
        if (skillList == null) {
            skillList = new HashSet<>();
            employee.setSkillList(skillList);
        }

        boolean skillAlreadyPresent = skillList.stream()
                .anyMatch(existingSkill -> existingSkill.getId() == skill.getId());

        if (!skillAlreadyPresent) {
            skillList.add(skill);
            employeeService.save(employee);
        }

        LOGGER.debug("Updated Employee: {}", employee);
        LOGGER.info("End");
    }
    
    private void testGetAverageSalary() {

        LOGGER.info("Start");

        double averageSalary = employeeService.getAverageSalary(1);

        LOGGER.debug("Average Salary : {}", averageSalary);

        LOGGER.info("End");
    }
}
