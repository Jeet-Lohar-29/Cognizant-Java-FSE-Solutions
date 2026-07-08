# Mockito Spring

## Overview

This folder contains the **Mockito Spring** exercises completed as part of the **Cognizant DN 5 Java FSE Deep Skilling Program**.

These exercises demonstrate how to perform **unit testing** and **integration testing** in Spring Boot applications using **Mockito**, **JUnit 5**, and **Spring Test**.

The module covers testing different layers of a Spring Boot application, including Controllers, Services, and Integration Tests.

---

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Spring Test
- JUnit 5
- Mockito

---

## Exercises

| Exercise | Topic | Status |
|----------|-------|--------|
| Exercise 1 | Mocking a Service Dependency in a Controller Test | ✅ Completed |
| Exercise 2 | Mocking a Repository in a Service Test | ✅ Completed |
| Exercise 3 | Mocking a Service Dependency in an Integration Test | ✅ Completed |

---

## Folder Structure

```
Mockito-Spring/
│
├── Exercise-1-Controller-Test/
│   ├── User.java
│   ├── UserRepository.java
│   ├── UserService.java
│   ├── UserController.java
│   ├── UserControllerTest.java
│   └── README.md
│
├── Exercise-2-Service-Test/
│   ├── User.java
│   ├── UserRepository.java
│   ├── UserService.java
│   ├── UserServiceTest.java
│   └── README.md
│
├── Exercise-3-Integration-Test/
│   ├── User.java
│   ├── UserRepository.java
│   ├── UserService.java
│   ├── UserController.java
│   ├── UserIntegrationTest.java
│   └── README.md
│
└── README.md
```

---

## Spring Testing Concepts Covered

- Unit Testing
- Integration Testing
- Mocking Spring Beans
- Mocking Repository Layer
- Mocking Service Layer
- Controller Layer Testing
- Service Layer Testing
- Spring Boot Testing
- MockMvc
- JSON Response Validation
- Dependency Injection Testing

---

## Mockito & Spring Annotations Used

- @Mock
- @MockBean
- @InjectMocks
- @WebMvcTest
- @SpringBootTest
- @AutoConfigureMockMvc
- @Autowired
- @Service
- @RestController
- @RequestMapping
- @GetMapping

---

## Learning Outcomes

After completing this module, I learned how to:

- Write unit tests for Spring Boot applications.
- Mock Service layer dependencies.
- Mock Repository layer dependencies.
- Test REST Controllers using MockMvc.
- Perform Spring Boot Integration Testing.
- Use Mockito annotations effectively.
- Verify HTTP responses using jsonPath().
- Test business logic independently from external dependencies.
- Build reliable and maintainable Spring Boot test cases.

---

## Verification

These exercises require the following dependencies:

- Spring Boot Test
- Spring MVC Test
- Spring Data JPA
- Mockito
- JUnit 5

Without these dependencies, the projects cannot be compiled using plain `javac`.

Typical Maven verification command:

```bash
mvn clean test
```

Expected Output:

```
BUILD SUCCESS

Tests run: 3
Failures: 0
Errors: 0
Skipped: 0
```

---

## Module Summary

| Category | Count |
|----------|------:|
| Exercises Completed | 3 |
| Unit Tests | 2 |
| Integration Tests | 1 |
| Controller Tests | 1 |
| Service Tests | 1 |
| Integration Tests | 1 |

---

## Author

**Jeet Lohar**

B.Tech Computer Science and Engineering

Lovely Professional University

Cognizant DN 5 Java FSE Deep Skilling Program

2026