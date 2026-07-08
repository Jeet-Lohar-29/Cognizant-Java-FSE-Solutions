# Exercise 1 - Mocking Databases and Repositories

## Objective

Learn how to test a service class by mocking its repository dependency using Mockito.

---

## Problem Statement

A service class depends on a repository to retrieve data from a database.

Instead of connecting to a real database, Mockito is used to create a mock repository that returns predefined data.

The test verifies that the service processes the mocked data correctly.

---

## Technologies Used

- Java
- JUnit 5
- Mockito

---

## Project Structure

```
Exercise-1-Mocking-Databases-and-Repositories/
│── Repository.java
│── Service.java
│── ServiceTest.java
└── README.md
```

---

## Files Description

### Repository.java

Defines the repository interface.

### Service.java

Contains the business logic that uses the repository.

### ServiceTest.java

Creates a mock repository using Mockito and verifies the service logic.

---

## Expected Output

```
Test Passed
```

The JUnit test should execute successfully with all assertions passing.

---

## Mockito Concepts Used

- @Mock
- @InjectMocks
- @ExtendWith(MockitoExtension.class)
- when().thenReturn()
- assertEquals()

---

## Learning Outcomes

After completing this exercise, you will understand:

- How Mockito creates mock objects
- How to stub repository methods
- How dependency injection works in unit testing
- How to write simple unit tests using JUnit 5

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program