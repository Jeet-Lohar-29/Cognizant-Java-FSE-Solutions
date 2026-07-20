# Week 3 - Spring REST

This repository contains the solutions for **Week 3 - Spring REST** of the **Cognizant Digital Nurture 5.0 - Java FSE** program.

The week focuses on building RESTful web services using Spring Boot, implementing CRUD operations, request validation, exception handling, and securing REST APIs using Spring Security and JWT authentication. The progression aligns with the standard Spring architecture of Controller → Service → DAO layers and introduces authentication and authorization concepts. :contentReference[oaicite:0]{index=0}

---

# Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Core
- Spring Security
- JWT (JJWT)
- Spring Validation
- Maven
- SLF4J & Logback
- REST API
- Postman

---

# Folder Structure

```
Week-3-Spring-REST
│
├── 1-Spring-REST-Basics
│
├── 2-REST-Web-Services
│
├── 3-Employee-REST-Services
│
├── 4-REST-CRUD-Validation
│
├── 5-Spring-Security-JWT
│
└── README.md
```

---

# Module 1 - Spring REST Basics

### Hands-on 1
- Created Spring Boot REST project using Maven.

### Hands-on 2
- Loaded `SimpleDateFormat` bean using Spring XML Configuration.

### Hands-on 3
- Added logging using SLF4J and Logback.

### Hands-on 4
- Implemented Hello World REST API.

### Hands-on 5
- Returned Country object as JSON response.

### Hands-on 6
- Loaded Country data from XML configuration.

---

# Module 2 - REST Web Services

### Hands-on 1
- Implemented REST Controller.

### Hands-on 2
- GET Country by Country Code.

### Hands-on 3
- Custom Exception Handling.

### Hands-on 4
- Global Exception Handling.

### Hands-on 5
- Request Mapping Improvements.

### Hands-on 6
- REST API Testing using Browser and Postman.

---

# Module 3 - Employee REST Services

### Hands-on 1
- Created Employee Model.
- Created Department Model.
- Created Skill Model.

### Hands-on 2
- Employee REST API.

### Hands-on 3
- Department REST API.

### Note

The official Cognizant handout references an `employee.xml` configuration file that was not included with the training materials. The application structure (models, DAO, service, and controllers) has been implemented, while the XML-backed sample data could not be reproduced without the missing resource.

---

# Module 4 - REST CRUD Validation

### Hands-on 1
- REST Resource Naming.
- POST Country REST Service.

### Hands-on 2
- Bean Validation.
- Country Validation.

### Hands-on 3
- Global Exception Handling using `@ControllerAdvice`.

### Hands-on 4
- Employee CRUD (GET & PUT).
- In-memory Employee DAO.

### Hands-on 5
- DELETE Employee REST API.
- Employee Validation.
- Employee Exception Handling.

---

# Module 5 - Spring Security & JWT

### Hands-on 1
- Added Spring Security.

### Hands-on 2
- Created In-Memory Users.
- Implemented Role-Based Authentication.

### Hands-on 3
- Authentication Controller.

### Hands-on 4
- JWT Token Generation.

### Hands-on 5
- JWT Authorization Filter.
- Protected REST APIs using JWT.

---

# Project Features

- Spring Boot REST APIs
- XML Bean Configuration
- REST Controllers
- Layered Architecture (Controller → Service → DAO)
- CRUD Operations
- Bean Validation
- Global Exception Handling
- Spring Security
- HTTP Basic Authentication
- JWT Authentication
- Logging using SLF4J
- Maven Build Management

---

# Build

```bash
mvn clean install
```

---

# Run

```bash
mvn spring-boot:run
```

---

# Testing

The applications were tested using:

- Browser
- Postman
- cURL

---

# Learning Outcomes

After completing Week 3, the following concepts were covered:

- Spring Boot REST API Development
- RESTful Web Services
- Request Mapping
- JSON Serialization
- Bean Validation
- Global Exception Handling
- CRUD REST APIs
- Layered Spring Architecture
- Spring Security Basics
- Authentication & Authorization
- JWT Token Generation
- JWT-Based API Security
- Logging and Debugging

---

# Repository

Cognizant Digital Nurture 5.0 – Java FSE Solutions

**Week 3:** Spring REST

Status: **✔ Completed**