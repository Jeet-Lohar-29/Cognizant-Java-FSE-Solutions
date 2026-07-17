# Exercise 3: Employee Management System - Creating Repositories

## Objective

Implement Spring Data JPA repositories for the **Employee** and **Department** entities.

The repositories provide built-in CRUD operations through `JpaRepository` and demonstrate **derived query methods** that are automatically implemented by Spring Data JPA based on method names. :contentReference[oaicite:0]{index=0}

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- H2 Database
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
│   │   │       ├── entity
│   │   │       │   ├── Employee.java
│   │   │       │   └── Department.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │   ├── EmployeeRepository.java
│   │   │       │   └── DepartmentRepository.java
│   │   │       │
│   │   │       └── EmployeeManagementSystemApplication.java
│   │   │
│   │   └── resources
│   │         application.properties
│   │
├── pom.xml
└── README.md
```

---

## EmployeeRepository

The `EmployeeRepository` extends `JpaRepository` and provides standard CRUD operations.

It also defines the following derived query methods:

```java
List<Employee> findByName(String name);

Employee findByEmail(String email);
```

Spring Data JPA derives the SQL/JPQL automatically from these method names. :contentReference[oaicite:1]{index=1}

---

## DepartmentRepository

The `DepartmentRepository` extends `JpaRepository`.

Derived query method:

```java
List<Department> findByName(String name);
```

---

## Benefits of JpaRepository

By extending `JpaRepository`, the application automatically gets methods such as:

- `save()`
- `findById()`
- `findAll()`
- `deleteById()`
- `existsById()`
- `count()`

No implementation class is required because Spring Data JPA creates the repository implementation at runtime. :contentReference[oaicite:2]{index=2}

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

The application starts successfully and Spring Boot detects the repository interfaces automatically.

---

## Concepts Covered

- Spring Data JPA
- JpaRepository
- Repository Pattern
- CRUD Operations
- Derived Query Methods
- Automatic Query Generation

---

## Learning Outcomes

After completing this exercise, you will understand:

- Creating repository interfaces using `JpaRepository`.
- Performing CRUD operations without writing SQL.
- Creating derived query methods using naming conventions.
- How Spring Data JPA generates repository implementations automatically.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer