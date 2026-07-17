package com.cognizant.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ems.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findByName(String name);

}