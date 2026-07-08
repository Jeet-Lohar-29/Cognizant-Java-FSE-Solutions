# Logging Exercises (SLF4J)

## Overview

This folder contains the **SLF4J Logging Exercises** completed as part of the **Cognizant DN 5 Java FSE Deep Skilling Program**.

These exercises demonstrate how to use **SLF4J** with **Logback** to implement efficient logging in Java applications. The module covers different logging levels, parameterized logging, and configuring multiple appenders for console and file-based logging.

---

## Technologies Used

- Java
- SLF4J
- Logback
- Maven

---

## Exercises

| Exercise | Topic | Status |
|----------|-------|--------|
| Exercise 1 | Logging Error Messages and Warning Levels | ✅ Completed |
| Exercise 2 | Parameterized Logging | ✅ Completed |
| Exercise 3 | Using Different Appenders | ✅ Completed |

---

## Folder Structure

```
Logging-Exercises/
│
├── Exercise-1-Error-Warning-Logging/
│   ├── LoggingExample.java
│   ├── pom.xml
│   └── README.md
│
├── Exercise-2-Parameterized-Logging/
│   ├── LoggingExample.java
│   ├── pom.xml
│   └── README.md
│
├── Exercise-3-Appenders/
│   ├── LoggingExample.java
│   ├── logback.xml
│   ├── pom.xml
│   └── README.md
│
└── README.md
```

---

## Topics Covered

### Exercise 1 – Error & Warning Logging

- Creating a Logger using `LoggerFactory`
- ERROR Logging
- WARN Logging
- Introduction to Logback

---

### Exercise 2 – Parameterized Logging

- INFO Logging
- Parameterized Logging
- `{}` Placeholders
- Multiple Parameters
- Efficient Logging

---

### Exercise 3 – Using Different Appenders

- ConsoleAppender
- FileAppender
- logback.xml Configuration
- Logging Patterns
- Multiple Appenders

---

## SLF4J & Logback Concepts Covered

- Logger
- LoggerFactory
- Logging Levels
  - DEBUG
  - INFO
  - WARN
  - ERROR
- Parameterized Logging
- ConsoleAppender
- FileAppender
- Encoder
- Logging Pattern
- Root Logger
- logback.xml Configuration

---

## Learning Outcomes

After completing this module, I learned how to:

- Configure SLF4J with Logback.
- Create loggers using `LoggerFactory`.
- Log messages at different severity levels.
- Use parameterized logging with `{}` placeholders.
- Improve logging performance by avoiding string concatenation.
- Configure ConsoleAppender and FileAppender.
- Write log messages to multiple destinations.
- Customize log output using `logback.xml`.
- Build maintainable logging solutions for Java applications.

---

## Verification

These exercises require the following dependencies:

- SLF4J API
- Logback Classic
- Maven

Without these dependencies, the projects cannot be compiled using plain `javac`.

Typical Maven commands:

Compile:

```bash
mvn clean compile
```

Run:

```bash
mvn exec:java -Dexec.mainClass="LoggingExample"
```

Expected Result:

```
Console Output

DEBUG - Debug message
INFO  - Information message
WARN  - Warning message
ERROR - Error message
```

For **Exercise 3**, an additional file named **app.log** will be generated containing the same log messages.

---

## Module Summary

| Category | Count |
|----------|------:|
| Exercises Completed | 3 |
| Java Classes | 3 |
| Maven Projects | 3 |
| Logback Configuration Files | 1 |
| README Files | 4 |

---

## Skills Gained

- Java Logging
- SLF4J
- Logback
- LoggerFactory
- Logging Levels
- Parameterized Logging
- Console Logging
- File Logging
- Appender Configuration
- Maven Dependency Management

---

## Author

**Jeet Lohar**

B.Tech Computer Science and Engineering

Lovely Professional University

Cognizant DN 5 Java FSE Deep Skilling Program

2026