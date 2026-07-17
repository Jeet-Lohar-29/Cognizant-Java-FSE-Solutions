package com.cognizant.ormlearn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Transactional
    public Department get(int id) {
        LOGGER.info("Start");
        LOGGER.debug("Department id: {}", id);
        Department department = departmentRepository.findById(id).get();
        LOGGER.debug("Department: {}", department);
        LOGGER.info("End");
        return department;
    }

    @Transactional
    public void save(Department department) {
        LOGGER.info("Start");
        LOGGER.debug("Department: {}", department);
        departmentRepository.save(department);
        LOGGER.info("End");
    }

}
