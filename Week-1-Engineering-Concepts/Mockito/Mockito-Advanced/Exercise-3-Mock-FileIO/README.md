# Exercise 3 - Mocking File I/O

## Objective

Learn how to mock file reading and writing operations using Mockito to test business logic without accessing the actual file system.

---

## Problem Statement

A service reads content from a file and writes processed content back.

Instead of interacting with real files, Mockito is used to mock the file reader and file writer.

The test verifies that:

- File content is read correctly.
- Processed data is written correctly.
- The service returns the expected result.

---

## Technologies Used

- Java
- JUnit 5
- Mockito

---

## Project Structure

```
Exercise-3-Mocking-File-IO/
│── FileReader.java
│── FileWriter.java
│── FileService.java
│── FileServiceTest.java
└── README.md
```

---

## Files Description

### FileReader.java

Defines the file reading interface.

### FileWriter.java

Defines the file writing interface.

### FileService.java

Implements the business logic for processing file content.

### FileServiceTest.java

Mocks file operations and verifies the service behavior.

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
- verify()
- assertEquals()

---

## Learning Outcomes

After completing this exercise, you will understand:

- How to mock file input/output operations
- How to verify method invocations using `verify()`
- How to isolate business logic from the file system
- How to write reliable unit tests without actual files

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program