package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Service
public class CriteriaQueryService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> getAllEmployees() {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Employee> criteriaQuery =
                builder.createQuery(Employee.class);

        Root<Employee> employee =
                criteriaQuery.from(Employee.class);

        criteriaQuery.select(employee);

        TypedQuery<Employee> query =
                entityManager.createQuery(criteriaQuery);

        return query.getResultList();
    }
}