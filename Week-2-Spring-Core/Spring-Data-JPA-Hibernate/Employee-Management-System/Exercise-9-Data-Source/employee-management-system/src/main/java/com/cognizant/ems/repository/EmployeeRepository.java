package com.cognizant.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.ems.entity.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.cognizant.ems.dto.EmployeeDTO;
import com.cognizant.ems.projection.EmployeeView;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived Query Methods
    List<Employee> findByName(String name);

    Employee findByEmail(String email);

    // JPQL Query
    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee getEmployeeByEmail(@Param("email") String email);

    // Named Query
    List<Employee> findByEmployeeName(@Param("name") String name);

// Interface Projection
    List<EmployeeView> findAllProjectedBy();

    // DTO Projection
    @Query("""
    SELECT new com.cognizant.ems.dto.EmployeeDTO(
    e.name,
    e.email
    )
    FROM Employee e
    """)
    List<EmployeeDTO> getEmployeeDTO();

}