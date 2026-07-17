# Exercise 5: Employee Management System - Defining Query Methods

## Objective

Enhance the Employee Management System by implementing different types of query methods provided by **Spring Data JPA**.

This exercise demonstrates:

- Derived Query Methods
- JPQL Queries using `@Query`
- Named Queries using `@NamedQuery` and `@NamedQueries`

Spring Data JPA supports all three approaches for querying entities depending on the application's requirements.

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

## Query Methods Implemented

### 1. Derived Query Methods

Spring Data JPA automatically generates queries based on method names.

Example:

```java
List<Employee> findByName(String name);

Employee findByEmail(String email);
```

---

### 2. JPQL Query using `@Query`

A custom JPQL query is defined inside the repository.

```java
@Query("SELECT e FROM Employee e WHERE e.email = :email")
Employee getEmployeeByEmail(@Param("email") String email);
```

---

### 3. Named Query

The Employee entity contains a named query.

```java
@NamedQuery(
    name = "Employee.findByEmployeeName",
    query = "SELECT e FROM Employee e WHERE e.name = :name"
)
```

Repository method:

```java
List<Employee> findByEmployeeName(String name);
```

---

## REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/employees/search/name/{name}` | Search using derived query |
| GET | `/employees/search/email/{email}` | Search using JPQL `@Query` |
| GET | `/employees/search/named/{name}` | Search using Named Query |

---

## Concepts Covered

- Derived Query Methods
- JPQL
- `@Query`
- `@NamedQuery`
- `@NamedQueries`
- Repository Query Methods
- Parameter Binding
- Spring Data JPA

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

The application starts successfully and exposes REST endpoints for testing different query mechanisms.

---

## Learning Outcomes

After completing this exercise, you will understand:

- Creating derived query methods.
- Writing JPQL queries using `@Query`.
- Defining reusable named queries.
- Binding parameters using `@Param`.
- Choosing the appropriate query mechanism based on application requirements.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer