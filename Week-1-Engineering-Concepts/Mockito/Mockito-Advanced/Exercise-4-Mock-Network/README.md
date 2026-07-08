# Exercise 4 - Mocking Network Interactions

## Objective

Learn how to mock network interactions using Mockito to test business logic without establishing real network connections.

---

## Problem Statement

A service communicates with a network resource through a network client.

Instead of connecting to an actual server, Mockito is used to create a mock network client that returns a predefined connection response.

The test verifies that the service correctly processes the mocked network interaction.

---

## Technologies Used

- Java
- JUnit 5
- Mockito

---

## Project Structure

```
Exercise-4-Mocking-Network-Interactions/
│── NetworkClient.java
│── NetworkService.java
│── NetworkServiceTest.java
└── README.md
```

---

## Files Description

### NetworkClient.java

Defines the network client interface.

### NetworkService.java

Contains business logic for connecting to a network resource.

### NetworkServiceTest.java

Mocks the network client and verifies the service behavior.

---

## Expected Output

```
Test Passed
```

The JUnit test should execute successfully.

---

## Mockito Concepts Used

- @Mock
- @InjectMocks
- @ExtendWith(MockitoExtension.class)
- when().thenReturn()
- verify()
- assertEquals()

---

## Learning Outcomes

After completing this exercise, you will understand:

- How to mock network interactions
- How to isolate business logic from network dependencies
- How to verify mocked method invocations
- How to write reliable unit tests without requiring a network connection

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program