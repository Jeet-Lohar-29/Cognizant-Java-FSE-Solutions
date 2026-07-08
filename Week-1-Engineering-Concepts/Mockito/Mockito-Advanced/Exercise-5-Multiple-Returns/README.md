# Exercise 5 - Mocking Multiple Return Values

## Objective

Learn how to configure Mockito to return different values on consecutive method calls.

---

## Problem Statement

A service calls the same repository method multiple times.

Instead of returning the same value every time, Mockito is configured to return different values for each invocation.

The test verifies that the service correctly processes each returned value.

---

## Technologies Used

- Java
- JUnit 5
- Mockito

---

## Project Structure

```
Exercise-5-Mocking-Multiple-Return-Values/
│── Repository.java
│── Service.java
│── MultiReturnServiceTest.java
└── README.md
```

---

## Files Description

### Repository.java

Defines the repository interface.

### Service.java

Implements the business logic.

### MultiReturnServiceTest.java

Mocks consecutive return values and verifies the service output.

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
- Consecutive Stubbing
- assertEquals()

---

## Learning Outcomes

After completing this exercise, you will understand:

- How to return different values on consecutive method calls
- How Mockito handles multiple invocations
- How to test state-dependent business logic
- How to perform consecutive stubbing

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program