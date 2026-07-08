# Mockito

## Overview

This folder contains all the **Mockito** exercises completed as part of the **Cognizant DN 5 Java FSE Deep Skilling Program**.

The exercises are divided into three modules:

- Mockito Basic
- Mockito Advanced
- Mockito Spring

Together, these modules cover the fundamentals of unit testing, mocking, stubbing, verification, interaction testing, and testing Spring Boot applications using Mockito.

---

## Technologies Used

- Java
- Mockito
- JUnit 5
- Spring Boot
- Spring MVC
- Spring Data JPA
- Spring Test

---

# Module Structure

```
Mockito/
│
├── Mockito-Basic/
│   ├── Exercise-1-Mocking-Stubbing/
│   ├── Exercise-2-Verifying-Interactions/
│   ├── Exercise-3-Argument-Matching/
│   ├── Exercise-4-Void-Methods/
│   ├── Exercise-5-Multiple-Returns/
│   ├── Exercise-6-Interaction-Order/
│   ├── Exercise-7-Void-Exceptions/
│   └── README.md
│
├── Mockito-Advanced/
│   ├── Exercise-1-Mock-Repository/
│   ├── Exercise-2-Mock-REST/
│   ├── Exercise-3-Mock-FileIO/
│   ├── Exercise-4-Mock-Network/
│   ├── Exercise-5-Multiple-Returns/
│   └── README.md
│
├── Mockito-Spring/
│   ├── Exercise-1-Controller-Test/
│   ├── Exercise-2-Service-Test/
│   ├── Exercise-3-Integration-Test/
│   └── README.md
│
└── README.md
```

---

# Modules

## 1. Mockito Basic

### Exercises

- Mocking and Stubbing
- Verifying Method Interactions
- Argument Matching
- Mocking Void Methods
- Multiple Return Values
- Verifying Interaction Order
- Throwing Exceptions from Void Methods

### Concepts Covered

- Mock Objects
- Stubbing
- Verification
- Argument Matchers
- Interaction Verification
- Consecutive Returns
- Exception Testing

---

## 2. Mockito Advanced

### Exercises

- Mocking Databases and Repositories
- Mocking REST APIs
- Mocking File I/O
- Mocking Network Interactions
- Mocking Multiple Return Values

### Concepts Covered

- Repository Mocking
- REST Client Mocking
- File System Mocking
- Network Mocking
- Consecutive Stubbing
- Dependency Isolation

---

## 3. Mockito Spring

### Exercises

- Controller Testing
- Service Testing
- Integration Testing

### Concepts Covered

- @Mock
- @MockBean
- @InjectMocks
- @WebMvcTest
- @SpringBootTest
- @AutoConfigureMockMvc
- MockMvc
- Repository Mocking
- Service Mocking
- JSON Response Validation

---

# Overall Learning Outcomes

After completing this module, I learned how to:

- Create mock objects using Mockito.
- Stub method responses.
- Verify method interactions.
- Verify invocation order.
- Mock repositories and databases.
- Mock REST APIs.
- Mock file operations.
- Mock network resources.
- Configure multiple return values.
- Test Spring Controllers.
- Test Spring Services.
- Write Integration Tests.
- Use MockMvc for REST API testing.
- Isolate business logic from external dependencies.
- Build clean and maintainable unit tests.

---

# Verification

## Mockito Basic

Compile and run using Java:

```bash
javac *.java
java MainClass
```

---

## Mockito Advanced

Requires:

- JUnit 5
- Mockito

Typical verification:

```bash
mvn clean test
```

---

## Mockito Spring

Requires:

- Spring Boot Test
- Spring MVC Test
- Spring Data JPA
- Mockito
- JUnit 5

Typical verification:

```bash
mvn clean test
```

Expected Result:

```
BUILD SUCCESS
```

---

# Module Statistics

| Module | Exercises |
|---------|----------:|
| Mockito Basic | 7 |
| Mockito Advanced | 5 |
| Mockito Spring | 3 |
| **Total Exercises** | **15** |

---

# Skills Gained

- Unit Testing
- Test-Driven Development (TDD) Fundamentals
- Mocking
- Stubbing
- Dependency Injection
- Repository Testing
- REST API Testing
- Spring Boot Testing
- Integration Testing
- Interaction Verification
- MockMvc
- JUnit 5
- Mockito

---

# Author

**Jeet Lohar**

B.Tech Computer Science and Engineering

Lovely Professional University

Cognizant DN 5 Java FSE Deep Skilling Program

2026