# Exercise 1 - Mocking a Service Dependency in a Controller Test

## Objective

Learn how to unit test a Spring Boot REST controller by mocking its service dependency using Mockito.

---

## Problem Statement

A REST controller depends on a service layer to retrieve user data.

Instead of calling the real service, Mockito is used to provide a mocked implementation so the controller can be tested independently.

---

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- JUnit 5
- Mockito

---

## Project Structure

```
Exercise-1-Mocking-Service-Dependency/
│── User.java
│── UserRepository.java
│── UserService.java
│── UserController.java
│── UserControllerTest.java
└── README.md
```

---

## Files Description

### User.java

Represents the User entity.

### UserRepository.java

Repository interface for user lookup.

### UserService.java

Business logic for retrieving users.

### UserController.java

REST Controller exposing the `/users/{id}` endpoint.

### UserControllerTest.java

Tests the controller by mocking the service dependency.

---

## Expected Output

```
Test Passed
```

---

## Spring Testing Concepts Used

- @WebMvcTest
- @MockBean
- MockMvc
- Mockito when().thenReturn()
- jsonPath()
- status().isOk()

---

## Learning Outcomes

After completing this exercise, you will understand:

- Controller layer testing
- Mocking service dependencies
- Using MockMvc
- Verifying HTTP responses
- Testing REST endpoints without starting the full application

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program