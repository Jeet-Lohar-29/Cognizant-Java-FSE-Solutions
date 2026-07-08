# Exercise 3 - Using Different Appenders

## Objective

Learn how to configure multiple appenders in Logback so that log messages are written to both the console and a log file.

---

## Problem Statement

Create a Java application that demonstrates using multiple appenders with SLF4J and Logback.

The application should:

- Display log messages on the console.
- Save the same log messages into a file named `app.log`.

---

## Technologies Used

- Java
- SLF4J
- Logback
- Maven

---

## Project Structure

```
Exercise-3-Appenders/
│── LoggingExample.java
│── logback.xml
│── pom.xml
└── README.md
```

---

## Files Description

### LoggingExample.java

Generates log messages of different severity levels.

### logback.xml

Configures ConsoleAppender and FileAppender.

### pom.xml

Contains SLF4J and Logback dependencies.

---

## Expected Output

### Console

```
DEBUG - Debug message
INFO  - Information message
WARN  - Warning message
ERROR - Error message
```

### File

```
app.log
```

Contains the same log messages.

---

## Concepts Used

- ConsoleAppender
- FileAppender
- Root Logger
- Log Pattern
- DEBUG Logging
- INFO Logging
- WARN Logging
- ERROR Logging

---

## Learning Outcomes

After completing this exercise, you will understand:

- How Logback appenders work.
- How to write logs to multiple destinations.
- How to configure log patterns.
- How to customize logging using `logback.xml`.

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program