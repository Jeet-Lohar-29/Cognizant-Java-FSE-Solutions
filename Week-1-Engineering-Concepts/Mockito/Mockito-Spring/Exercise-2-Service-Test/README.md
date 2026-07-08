# Exercise 2 - Mocking a Repository in a Service Test

## Objective

Learn how to unit test a Spring Service by mocking its repository dependency using Mockito.

---

## Problem Statement

A Spring Service retrieves user information from a repository.

Instead of connecting to a real database, Mockito is used to mock the repository and return predefined user data.

The test verifies that the service correctly retrieves and returns the mocked user.

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- JUnit 5
- Mockito

---

## Project Structure

```
Exercise-2-Service-Test/
│── User.java
│── UserRepository.java
│── UserService.java
│── UserServiceTest.java
└── README.md
```

---

## Files Description

### User.java

Represents the User entity.

### UserRepository.java

Spring Data JPA repository interface.

### UserService.java

Contains business logic for retrieving users.

### UserServiceTest.java

Mocks the repository and verifies the service logic.

---

## Expected Output

```
Test Passed
```

---

## Mockito Concepts Used

- @Mock
- @InjectMocks
- @ExtendWith(MockitoExtension.class)
- when().thenReturn()
- assertEquals()
- assertNotNull()

---

## Learning Outcomes

After completing this exercise, you will understand:

- Service layer testing
- Mocking Spring Data repositories
- Using Optional in mocked responses
- Testing business logic without a database
- Using Mockito annotations with JUnit 5

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program