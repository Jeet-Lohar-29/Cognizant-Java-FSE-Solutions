# Handson-4: Average Salary using HQL

## Objective

Implement **Hibernate Query Language (HQL)** to calculate the average salary of employees belonging to a specific department.

This hands-on demonstrates the use of HQL aggregate functions, named parameters, and custom repository queries using Spring Data JPA.

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
│   │   │       │
│   │   │       ├── service
│   │   │       │     EmployeeService.java
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

The repository contains a custom HQL query to calculate the average salary of employees in a given department.

```java
@Query("SELECT AVG(e.salary) FROM Employee e WHERE e.department.id = :id")
double getAverageSalary(@Param("id") int id);
```

The query uses the HQL `AVG()` aggregate function and a named parameter (`:id`) supplied through `@Param`. Spring Data JPA supports custom JPQL/HQL queries using the `@Query` annotation. :contentReference[oaicite:0]{index=0}

---

## Service Layer

The service delegates the repository call.

```java
public double getAverageSalary(int id) {
    return employeeRepository.getAverageSalary(id);
}
```

---

## Application Runner

The application executes:

```java
testGetAverageSalary();
```

This method:

- Retrieves the average salary for a department
- Displays the calculated value in the console

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

Average Salary : 65000.0

End
```

> The actual value depends on the employee records stored in your database.

---

## Concepts Covered

- Hibernate Query Language (HQL)
- Spring Data JPA
- @Query Annotation
- Aggregate Functions
- AVG()
- Named Parameters
- @Param
- Repository Pattern

---

## Learning Outcomes

After completing this hands-on, you will understand:

- Writing custom HQL queries
- Using aggregate functions in HQL
- Passing named parameters with `@Param`
- Integrating HQL queries into Spring Data JPA repositories
- Retrieving calculated values from the database

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer