# Handson-2: Get All Permanent Employees using HQL

## Objective

Implement **Hibernate Query Language (HQL)** using Spring Data JPA to retrieve all permanent employees.

The query should also fetch the associated **Department** and **Skill** details using **JOIN FETCH** to avoid unnecessary database queries.

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- MySQL 8
- Maven

---

## Project Structure

```text
orm-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.ormlearn
│   │   │       ├── model
│   │   │       │     Employee.java
│   │   │       │     Department.java
│   │   │       │     Skill.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │     EmployeeRepository.java
│   │   │       │     DepartmentRepository.java
│   │   │       │     SkillRepository.java
│   │   │       │
│   │   │       ├── service
│   │   │       │     EmployeeService.java
│   │   │       │     DepartmentService.java
│   │   │       │     SkillService.java
│   │   │       │
│   │   │       └── OrmLearnApplication.java
│   │   │
│   │   └── resources
│   │         application.properties
│   │
├── pom.xml
└── README.md
```

---

## HQL Query

The repository contains the following JPQL/HQL query:

```java
@Query("""
SELECT e
FROM Employee e
LEFT JOIN FETCH e.department
LEFT JOIN FETCH e.skillList
WHERE e.permanent = true
""")
List<Employee> getAllPermanentEmployees();
```

This query retrieves all permanent employees and eagerly loads the related `Department` and `Skill` entities in a single database query. Spring Data JPA allows custom JPQL/HQL queries to be declared directly on repository methods using the `@Query` annotation. :contentReference[oaicite:0]{index=0}

---

## Service Layer

A new service method delegates the repository call:

```java
public List<Employee> getAllPermanentEmployees() {
    return employeeRepository.getAllPermanentEmployees();
}
```

---

## Application Runner

The application includes a test method:

```java
testGetAllPermanentEmployees();
```

This method:

- Retrieves all permanent employees
- Displays employee details
- Displays department details
- Displays associated skills

---

## Why JOIN FETCH?

Without `FETCH`, Hibernate may execute additional SQL queries for lazy-loaded associations.

Using `LEFT JOIN FETCH`:

- Retrieves Employee, Department, and Skill data together
- Avoids the N+1 query problem
- Improves performance
- Prevents `LazyInitializationException` when associations are accessed after retrieval

---

## Build

```bash
mvn clean compile
```

---

## Run

```bash
mvn spring-boot:run
```

---

## Expected Output

```text
Start

Permanent Employees:
Employee{id=1,...}

Department:
Department{id=1,...}

Skills:
[Java, Spring Boot, SQL]

End
```

---

## Concepts Covered

- Hibernate Query Language (HQL)
- JPQL
- Spring Data JPA
- @Query Annotation
- JOIN
- JOIN FETCH
- Entity Relationships
- Lazy vs Eager Loading
- Performance Optimization

---

## Learning Outcomes

After completing this hands-on, you will understand:

- Writing HQL queries using `@Query`
- Fetching associated entities with `JOIN FETCH`
- Optimizing Hibernate queries
- Reducing unnecessary SQL execution
- Integrating HQL with Spring Data JPA repositories

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer