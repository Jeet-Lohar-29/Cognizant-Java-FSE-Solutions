# Exercise 10: Employee Management System - Hibernate Features

## Objective

Implement Hibernate-specific features in the Employee Management System.

This exercise demonstrates:

- Optimistic Locking using `@Version`
- Entity Locking
- Hibernate SQL Formatting
- Hibernate Statistics
- Hibernate-specific configuration properties

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
│   │   │       ├── config
│   │   │       ├── controller
│   │   │       ├── dto
│   │   │       ├── entity
│   │   │       │   ├── Employee.java
│   │   │       │   └── Department.java
│   │   │       ├── projection
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       └── EmployeeManagementSystemApplication.java
│   │   │
│   │   └── resources
│   │         └── application.properties
│   │
├── pom.xml
└── README.md
```

---

## Optimistic Locking

The Employee entity uses Hibernate's optimistic locking mechanism.

```java
@Version
private Long version;
```

The version column is automatically updated whenever an entity is modified, helping prevent lost updates during concurrent transactions.

---

## Repository Locking

The repository demonstrates entity locking.

```java
@Lock(LockModeType.READ)
List<Employee> findAll();
```

---

## Hibernate Configuration

Additional Hibernate properties are enabled.

```properties
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.generate_statistics=true
```

These properties improve SQL readability and enable runtime statistics for monitoring Hibernate activity.

---

## Features Covered

- Optimistic Locking
- Entity Versioning
- Lock Modes
- SQL Formatting
- Hibernate Statistics
- Hibernate ORM Configuration

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

Hibernate automatically:

- Maintains the version column.
- Detects concurrent updates.
- Generates formatted SQL.
- Displays runtime statistics.

---

## Learning Outcomes

After completing this exercise, you will understand:

- Hibernate optimistic locking.
- The purpose of `@Version`.
- Repository locking using `@Lock`.
- Hibernate runtime configuration.
- SQL formatting and statistics generation.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer