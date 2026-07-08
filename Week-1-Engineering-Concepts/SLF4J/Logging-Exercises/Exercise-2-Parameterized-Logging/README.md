# Exercise 2 - Parameterized Logging

## Objective

Learn how to use parameterized logging in SLF4J using placeholders (`{}`).

---

## Problem Statement

Create a Java application that demonstrates parameterized logging.

The application should:

- Log a single parameter.
- Log multiple parameters.

---

## Technologies Used

- Java
- SLF4J
- Logback
- Maven

---

## Project Structure

```
Exercise-2-Parameterized-Logging/
│── LoggingExample.java
│── pom.xml
└── README.md
```

---

## Files Description

### LoggingExample.java

Demonstrates parameterized logging using placeholders (`{}`).

### pom.xml

Contains the SLF4J and Logback dependencies.

---

## Expected Output

```
INFO - User Name: Jeet Lohar
INFO - User Name: Jeet Lohar, Age: 21
```

---

## Concepts Used

- Logger
- LoggerFactory
- INFO Logging
- Parameterized Logging
- Placeholder `{}`

---

## Learning Outcomes

After completing this exercise, you will understand:

- How parameterized logging works.
- Why placeholders (`{}`) are preferred over string concatenation.
- How to log one or multiple values.
- How SLF4J improves logging performance.

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program