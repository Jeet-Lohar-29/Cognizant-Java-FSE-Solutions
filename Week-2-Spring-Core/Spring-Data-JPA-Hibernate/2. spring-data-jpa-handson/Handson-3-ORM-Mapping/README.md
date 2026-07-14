# Handson-3: ORM Mapping

## Objective

Implement basic Object Relational Mapping (ORM) using Spring Data JPA and Hibernate.

This hands-on demonstrates how Java entity classes are mapped to relational database tables using JPA annotations and managed through Spring Data JPA repositories.

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

## Entity Classes

- Employee
- Department
- Skill

Each entity is mapped to a corresponding database table using JPA annotations such as:

- `@Entity`
- `@Table`
- `@Id`
- `@GeneratedValue`
- `@Column`

---

## Repository Interfaces

The following repositories extend `JpaRepository`:

- EmployeeRepository
- DepartmentRepository
- SkillRepository

Spring Data JPA automatically provides CRUD operations for these entities through `JpaRepository`. :contentReference[oaicite:0]{index=0}

---

## Service Layer

Implemented service classes:

- EmployeeService
- DepartmentService
- SkillService

These classes interact with the repository layer and provide business logic for entity access.

---

## Database

Database

```
ormlearn
```

Tables

- employee
- department
- skill

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

```
======================================
ORM Mapping Project Started Successfully
Employee Entity Loaded
Department Entity Loaded
Skill Entity Loaded
======================================
```

---

## Concepts Covered

- Spring Data JPA
- Hibernate ORM
- Entity Mapping
- Repository Pattern
- Service Layer
- Dependency Injection
- MySQL Integration
- JPA Annotations

---

## Learning Outcome

After completing this hands-on you will understand:

- Mapping Java classes to relational database tables
- Creating JPA entities
- Using Spring Data JPA repositories
- Organizing projects using model, repository, and service layers
- Preparing entities for relationship mappings in subsequent exercises

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer