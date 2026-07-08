# Exercise 2 - Mocking External Services (RESTful APIs)

## Objective

Learn how to mock an external REST client using Mockito so that unit tests do not perform actual HTTP requests.

---

## Problem Statement

An application communicates with an external REST API through a REST client.

Instead of making a real API call, Mockito is used to mock the REST client and return predefined responses.

The test verifies that the service correctly processes the mocked API response.

---

## Technologies Used

- Java
- JUnit 5
- Mockito

---

## Project Structure

```
Exercise-2-Mocking-External-Services/
│── RestClient.java
│── ApiService.java
│── ApiServiceTest.java
└── README.md
```

---

## Files Description

### RestClient.java

Defines the REST client interface.

### ApiService.java

Contains business logic that calls the REST client.

### ApiServiceTest.java

Mocks the REST client and verifies the service response.

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
- assertEquals()

---

## Learning Outcomes

After completing this exercise, you will understand:

- How to mock external REST services
- How to isolate business logic from API calls
- How to stub REST client responses
- How to test service classes without real network communication

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program