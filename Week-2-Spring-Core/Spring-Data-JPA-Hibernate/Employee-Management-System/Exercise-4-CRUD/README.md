# Exercise 4: Employee Management System - CRUD Operations

## Objective

Implement complete **CRUD (Create, Read, Update, Delete)** operations for the Employee Management System using **Spring Boot**, **Spring Data JPA**, and **RESTful APIs**.

This exercise demonstrates how to use `JpaRepository` methods through a Service layer and expose them using REST Controllers. Spring Data JPA provides built-in CRUD methods through `JpaRepository`, eliminating the need to write boilerplate data access code. :contentReference[oaicite:0]{index=0}

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- H2 Database
- Spring Web
- Lombok
- Maven

---

## Project Structure

```text
employee-management-system
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.ems
│   │   │       ├── controller
│   │   │       │   ├── EmployeeController.java
│   │   │       │   └── DepartmentController.java
│   │   │       │
│   │   │       ├── entity
│   │   │       │   ├── Employee.java
│   │   │       │   └── Department.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │   ├── EmployeeRepository.java
│   │   │       │   └── DepartmentRepository.java
│   │   │       │
│   │   │       ├── service
│   │   │       │   ├── EmployeeService.java
│   │   │       │   └── DepartmentService.java
│   │   │       │
│   │   │       └── EmployeeManagementSystemApplication.java
│   │   │
│   │   └── resources
│   │         └── application.properties
│   │
├── pom.xml
└── README.md
```

---

## CRUD Operations Implemented

### Employee

- Create Employee
- Get All Employees
- Get Employee by ID
- Update Employee
- Delete Employee

### Department

- Create Department
- Get All Departments
- Get Department by ID
- Update Department
- Delete Department

---

## REST API Endpoints

### Employee APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/employees` | Retrieve all employees |
| GET | `/employees/{id}` | Retrieve employee by ID |
| POST | `/employees` | Create a new employee |
| PUT | `/employees/{id}` | Update an existing employee |
| DELETE | `/employees/{id}` | Delete an employee |

### Department APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/departments` | Retrieve all departments |
| GET | `/departments/{id}` | Retrieve department by ID |
| POST | `/departments` | Create a new department |
| PUT | `/departments/{id}` | Update an existing department |
| DELETE | `/departments/{id}` | Delete a department |

---

## Service Layer

The Service layer handles business logic and delegates database operations to the repository layer.

Key methods include:

- `save()`
- `findAll()`
- `findById()`
- `deleteById()`

These operations are provided by `JpaRepository` and are automatically implemented by Spring Data JPA. :contentReference[oaicite:1]{index=1}

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
Started EmployeeManagementSystemApplication
```

The REST API will be available for testing using tools such as Postman or a web browser.

---

## Concepts Covered

- Spring Boot REST APIs
- CRUD Operations
- Spring Data JPA
- JpaRepository
- REST Controllers
- Service Layer
- Repository Layer
- H2 Database

---

## Learning Outcomes

After completing this exercise, you will understand:

- Building RESTful CRUD APIs using Spring Boot.
- Separating Controller, Service, and Repository layers.
- Using JpaRepository for database operations.
- Implementing Create, Read, Update, and Delete functionality.
- Testing REST endpoints using HTTP methods.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer