# Handson-4: Many-To-One Mapping

## Objective

Implement a **Many-To-One** relationship between `Employee` and `Department` using Spring Data JPA and Hibernate.

In this mapping:

- One Department can have many Employees.
- Each Employee belongs to exactly one Department.

The relationship is implemented using JPA annotations and managed through Spring Data JPA repositories.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL 8
- Maven

---

## Project Structure

```
orm-learn
│
├── src
│   ├── main
│   │
│   ├── java
│   │   └── com.cognizant.ormlearn
│   │
│   │       ├── model
│   │       │     Employee.java
│   │       │     Department.java
│   │       │     Skill.java
│   │       │
│   │       ├── repository
│   │       │     EmployeeRepository.java
│   │       │     DepartmentRepository.java
│   │       │     SkillRepository.java
│   │       │
│   │       ├── service
│   │       │     EmployeeService.java
│   │       │     DepartmentService.java
│   │       │     SkillService.java
│   │       │
│   │       └── OrmLearnApplication.java
│   │
│   └── resources
│         application.properties
│
├── pom.xml
└── README.md
```

---

## Relationship Mapping

The Employee entity owns the relationship.

```java
@ManyToOne
@JoinColumn(name = "em_dp_id")
private Department department;
```

The `em_dp_id` column in the **employee** table stores the foreign key referencing the **department** table. :contentReference[oaicite:1]{index=1}

---

## Employee Entity

Employee contains:

- Employee ID
- Name
- Salary
- Permanent Status
- Date of Birth
- Department Reference

Each employee belongs to one department.

---

## Department Entity

Department contains:

- Department ID
- Department Name

One department can be assigned to multiple employees.

---

## Repository Layer

Implemented repositories:

- EmployeeRepository
- DepartmentRepository
- SkillRepository

All repositories extend `JpaRepository`, providing CRUD operations without requiring manual implementation. :contentReference[oaicite:2]{index=2}

---

## Service Layer

Implemented services:

- EmployeeService
- DepartmentService
- SkillService

The service layer performs:

- Fetch Employee
- Fetch Department
- Save Employee
- Save Department

---

## Database

Database:

```
ormlearn
```

Tables:

- employee
- department
- skill

Foreign Key:

```
employee.em_dp_id
        ↓
department.dp_id
```

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

## Test Methods

Implemented in `OrmLearnApplication`:

- `testGetEmployee()`
- `testAddEmployee()`
- `testUpdateEmployee()`

Only one method should remain active inside `run()` during testing.

---

## Expected Output

Example:

```
Employee:
Employee{id=1, name='John Doe', salary=50000.0, permanent=true, dateOfBirth=1999-01-01, department=Department{id=1, name='IT'}}

Department:
Department{id=1, name='IT'}
```

---

## Concepts Covered

- Spring Data JPA
- Hibernate ORM
- Entity Relationships
- Many-To-One Mapping
- @ManyToOne
- @JoinColumn
- Repository Pattern
- Service Layer
- Dependency Injection
- CommandLineRunner

---

## Learning Outcomes

After completing this hands-on you will understand:

- How to implement Many-To-One relationships
- How Hibernate manages foreign keys
- Mapping entity associations using JPA annotations
- Performing CRUD operations through Spring Data JPA
- Testing entity relationships using Spring Boot

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer