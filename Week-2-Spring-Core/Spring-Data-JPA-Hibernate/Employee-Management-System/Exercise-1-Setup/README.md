# Exercise 1: Employee Management System - Overview and Setup

## Objective

Create and configure a Spring Boot project for an **Employee Management System**.

The project is initialized with the required dependencies and configured to use an **H2 in-memory database** for development and testing.

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Spring Web
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
│   │   │       └── EmployeeManagementSystemApplication.java
│   │   └── resources
│   │         └── application.properties
│   │
├── pom.xml
├── mvnw
├── mvnw.cmd
├── HELP.md
└── README.md
```

---

## Dependencies

The project includes the following Spring Boot dependencies:

- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

These dependencies provide REST support, JPA persistence, an embedded H2 database for development, and code generation using Lombok. :contentReference[oaicite:0]{index=0}

---

## H2 Database Configuration

The application uses an **H2 in-memory database**.

Example configuration:

```properties
spring.application.name=employee-management-system

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

Spring Boot automatically configures the H2 datasource using the `spring.datasource.*` properties, and the H2 web console can be enabled for development using `spring.h2.console.enabled=true`. :contentReference[oaicite:1]{index=1}

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

The application starts successfully with the embedded H2 database configured.

---

## Learning Outcomes

After completing this exercise, you will understand:

- Creating a Spring Boot project using Spring Initializr.
- Adding Spring Data JPA, Spring Web, H2, and Lombok dependencies.
- Configuring an H2 in-memory database.
- Running and verifying a Spring Boot application.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer