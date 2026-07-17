# Exercise 7: Employee Management System - Entity Auditing

## Objective

Implement **Entity Auditing** in the Employee Management System using **Spring Data JPA Auditing**.

This exercise demonstrates how to automatically capture the creation and modification timestamps of entities using Spring Data JPA auditing features.

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
│   │   │       ├── entity
│   │   │       │   ├── Employee.java
│   │   │       │   └── Department.java
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

## JPA Auditing Configuration

JPA auditing is enabled in the main application class.

```java
@EnableJpaAuditing
@SpringBootApplication
public class EmployeeManagementSystemApplication {
}
```

---

## Entity Auditing

The `Employee` entity is configured with:

```java
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Employee {
}
```

The following auditing fields are added:

```java
@CreatedDate
private LocalDateTime createdDate;

@LastModifiedDate
private LocalDateTime lastModifiedDate;
```

These fields are automatically populated by Spring Data JPA whenever an entity is created or updated.

---

## Auditing Annotations Used

- `@EnableJpaAuditing`
- `@EntityListeners`
- `@CreatedDate`
- `@LastModifiedDate`
- `AuditingEntityListener`

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

When a new employee record is created:

- `createdDate` is populated automatically.
- `lastModifiedDate` is initialized.

When an existing employee record is updated:

- `lastModifiedDate` is updated automatically.

---

## Concepts Covered

- Spring Data JPA Auditing
- Entity Listeners
- CreatedDate
- LastModifiedDate
- Automatic Timestamp Management
- JPA Entity Lifecycle

---

## Learning Outcomes

After completing this exercise, you will understand:

- How to enable Spring Data JPA auditing.
- How to automatically maintain entity timestamps.
- How `@CreatedDate` and `@LastModifiedDate` work.
- How auditing integrates with JPA entity lifecycle events.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer