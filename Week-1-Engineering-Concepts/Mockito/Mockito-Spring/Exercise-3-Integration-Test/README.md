# Exercise 3 - Mocking a Service Dependency in an Integration Test

## Objective

Learn how to write an integration test for a Spring Boot application by mocking a service dependency using Mockito.

---

## Problem Statement

A REST controller depends on a service layer to retrieve user information.

Instead of using the real service, Mockito is used to mock the service while the Spring Boot application context is loaded.

The integration test verifies the REST endpoint using MockMvc.

---

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- JUnit 5
- Mockito

---

## Project Structure

```
Exercise-3-Integration-Test/
│── User.java
│── UserRepository.java
│── UserService.java
│── UserController.java
│── UserIntegrationTest.java
└── README.md
```

---

## Files Description

### User.java

Represents the User entity.

### UserRepository.java

Spring Data JPA repository.

### UserService.java

Contains business logic.

### UserController.java

REST controller exposing `/users/{id}`.

### UserIntegrationTest.java

Integration test using Spring Boot, MockMvc, and Mockito.

---

## Expected Output

```
Test Passed
```

---

## Spring Testing Concepts Used

- @SpringBootTest
- @AutoConfigureMockMvc
- @MockBean
- MockMvc
- when().thenReturn()
- jsonPath()

---

## Learning Outcomes

After completing this exercise, you will understand:

- Spring Boot Integration Testing
- Mocking Spring Beans
- Using MockMvc
- Testing REST endpoints
- Loading the Spring Context

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program