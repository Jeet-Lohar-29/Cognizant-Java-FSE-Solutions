# Exercise 8: Employee Management System - Creating Projections

## Objective

Implement **Spring Data JPA Projections** to fetch only the required fields from the database instead of retrieving complete entities.

This exercise demonstrates:

- Interface-based Projections
- Class-based (DTO) Projections
- Open Projections using `@Value`
- JPQL Constructor Expressions

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
│   │   │
│   │   │       ├── controller
│   │   │       │   ├── EmployeeController.java
│   │   │       │   └── DepartmentController.java
│   │   │       │
│   │   │       ├── dto
│   │   │       │   └── EmployeeDTO.java
│   │   │       │
│   │   │       ├── entity
│   │   │       │   ├── Employee.java
│   │   │       │   └── Department.java
│   │   │       │
│   │   │       ├── projection
│   │   │       │   └── EmployeeView.java
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

## Interface-Based Projection

The application defines an interface projection to retrieve only selected fields.

```java
public interface EmployeeView {

    String getName();

    String getEmail();

    @Value("#{target.name + ' - ' + target.email}")
    String getEmployeeInfo();
}
```

The `@Value` annotation creates an **Open Projection** that computes additional values from entity properties.

---

## DTO Projection

A DTO is created to transfer only the required employee data.

```java
public class EmployeeDTO {

    private String name;
    private String email;

    public EmployeeDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
```

---

## Repository Methods

### Interface Projection

```java
List<EmployeeView> findAllProjectedBy();
```

### DTO Projection

```java
@Query("""
SELECT new com.cognizant.ems.dto.EmployeeDTO(
e.name,
e.email
)
FROM Employee e
""")
List<EmployeeDTO> getEmployeeDTO();
```

---

## REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/employees/projection` | Interface-based Projection |
| GET | `/employees/dto` | DTO Projection |

---

## Concepts Covered

- Interface-Based Projection
- Open Projection
- DTO Projection
- `@Value`
- JPQL Constructor Expression
- Partial Data Fetching
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

Example response for interface projection:

```json
[
  {
    "name": "John",
    "email": "john@example.com",
    "employeeInfo": "John - john@example.com"
  }
]
```

Example response for DTO projection:

```json
[
  {
    "name": "John",
    "email": "john@example.com"
  }
]
```

---

## Learning Outcomes

After completing this exercise, you will understand:

- Creating interface-based projections.
- Creating class-based DTO projections.
- Using `@Value` to build open projections.
- Using JPQL constructor expressions.
- Fetching only the required columns from the database.
- Improving query performance by avoiding unnecessary entity loading.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer