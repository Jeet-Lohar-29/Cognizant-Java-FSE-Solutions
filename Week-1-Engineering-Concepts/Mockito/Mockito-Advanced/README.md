# Mockito Advanced

## Overview

This folder contains the **Mockito Advanced** exercises completed as part of the **Cognizant DN 5 Java FSE Deep Skilling Program**.

These exercises demonstrate advanced unit testing techniques using **Mockito** and **JUnit 5**, including mocking repositories, external services, file operations, network interactions, and methods with multiple return values.

---

## Technologies Used

- Java
- JUnit 5
- Mockito

---

## Exercises

| Exercise | Topic | Status |
|----------|-------|--------|
| Exercise 1 | Mocking Databases and Repositories | ✅ Completed |
| Exercise 2 | Mocking External Services (RESTful APIs) | ✅ Completed |
| Exercise 3 | Mocking File I/O | ✅ Completed |
| Exercise 4 | Mocking Network Interactions | ✅ Completed |
| Exercise 5 | Mocking Multiple Return Values | ✅ Completed |

---

## Folder Structure

```
Mockito-Advanced/
│── Exercise-1-Mocking-Databases-and-Repositories/
│   ├── Repository.java
│   ├── Service.java
│   ├── ServiceTest.java
│   └── README.md
│
│── Exercise-2-Mocking-External-Services/
│   ├── RestClient.java
│   ├── ApiService.java
│   ├── ApiServiceTest.java
│   └── README.md
│
│── Exercise-3-Mocking-File-IO/
│   ├── FileReader.java
│   ├── FileWriter.java
│   ├── FileService.java
│   ├── FileServiceTest.java
│   └── README.md
│
│── Exercise-4-Mocking-Network-Interactions/
│   ├── NetworkClient.java
│   ├── NetworkService.java
│   ├── NetworkServiceTest.java
│   └── README.md
│
│── Exercise-5-Mocking-Multiple-Return-Values/
│   ├── Repository.java
│   ├── Service.java
│   ├── MultiReturnServiceTest.java
│   └── README.md
│
└── README.md
```

---

## Mockito Concepts Covered

- Creating Mock Objects
- Mocking Repositories
- Mocking REST Clients
- Mocking File Input/Output
- Mocking Network Clients
- Consecutive Stubbing using `thenReturn()`
- Dependency Injection using `@InjectMocks`
- Using `@Mock`
- Mockito JUnit 5 Extension
- Verifying Method Calls using `verify()`

---

## Learning Outcomes

After completing these exercises, I learned how to:

- Create mock objects using Mockito.
- Isolate business logic from external dependencies.
- Test services without using real databases, APIs, files, or network resources.
- Stub method responses using `when().thenReturn()`.
- Configure multiple return values for consecutive method calls.
- Verify interactions between services and mocked dependencies.
- Write clean and maintainable unit tests using JUnit 5 and Mockito.

---

## Verification

These exercises require **JUnit 5** and **Mockito** libraries.

Without a build tool such as Maven or Gradle, they cannot be compiled using plain `javac`.

Typical Maven verification command:

```bash
mvn clean test
```

Expected Result:

```
BUILD SUCCESS
Tests run: 1
Failures: 0
Errors: 0
```

---

## Author

**Jeet Lohar**

B.Tech Computer Science and Engineering

Lovely Professional University

Cognizant DN 5 Java FSE Deep Skilling Program

2026