package com.cognizant.ormlearn.repository;

import java.util.List;

import com.cognizant.ormlearn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT DISTINCT e FROM Employee e left join fetch e.department d left join fetch d.employeeList left join fetch e.skillList WHERE e.permanent = true")
    List<Employee> getAllPermanentEmployees();

    @Query(
        value = "SELECT AVG(em_salary) FROM employee WHERE em_dp_id = :id",
        nativeQuery = true
    )
    double getAverageSalary(@Param("id") int id);

}
