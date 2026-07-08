# Exercise 1 - Logging Error Messages and Warning Levels

## Objective

Learn how to use **SLF4J** with **Logback** to log error and warning messages in a Java application.

---

## Problem Statement

Create a Java application that demonstrates logging using SLF4J.

The application should:

- Log an ERROR message.
- Log a WARNING message.

---

## Technologies Used

- Java
- SLF4J
- Logback
- Maven

---

## Project Structure

```
Exercise-1-Error-Warning-Logging/
│── LoggingExample.java
│── pom.xml
└── README.md
```

---

## Files Description

### LoggingExample.java

Demonstrates ERROR and WARN logging using SLF4J.

### pom.xml

Contains the SLF4J and Logback dependencies.

---

## Expected Output

```
ERROR - This is an error message
WARN  - This is a warning message
```

---

## Concepts Used

- Logger
- LoggerFactory
- ERROR Logging
- WARN Logging
- Logback Implementation

---

## Learning Outcomes

After completing this exercise, you will understand:

- What SLF4J is.
- How Logback works with SLF4J.
- How to log error messages.
- How to log warning messages.
- Why logging frameworks are preferred over `System.out.println()`.

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program