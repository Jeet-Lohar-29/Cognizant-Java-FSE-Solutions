# SLF4J

## Overview

This folder contains the **SLF4J (Simple Logging Facade for Java)** exercises completed as part of the **Cognizant DN 5 Java FSE Deep Skilling Program**.

The exercises demonstrate how to implement logging in Java applications using **SLF4J** with **Logback** as the logging framework.

The module covers:

- Logging Levels
- Parameterized Logging
- Logback Configuration
- Console Logging
- File Logging
- Multiple Appenders

---

## Technologies Used

- Java
- SLF4J
- Logback
- Maven

---

# Folder Structure

```
SLF4J/
│
├── Logging-Exercises/
│   │
│   ├── Exercise-1-Error-Warning-Logging/
│   │   ├── LoggingExample.java
│   │   ├── pom.xml
│   │   └── README.md
│   │
│   ├── Exercise-2-Parameterized-Logging/
│   │   ├── LoggingExample.java
│   │   ├── pom.xml
│   │   └── README.md
│   │
│   ├── Exercise-3-Appenders/
│   │   ├── LoggingExample.java
│   │   ├── logback.xml
│   │   ├── pom.xml
│   │   └── README.md
│   │
│   └── README.md
│
└── README.md
```

---

# Module Contents

## Logging Exercises

### Exercise 1 – Logging Error Messages and Warning Levels

Learn how to:

- Create a Logger
- Log ERROR messages
- Log WARN messages
- Configure Logback dependencies

---

### Exercise 2 – Parameterized Logging

Learn how to:

- Use parameterized logging
- Pass single and multiple parameters
- Improve logging efficiency using `{}` placeholders

---

### Exercise 3 – Using Different Appenders

Learn how to:

- Configure ConsoleAppender
- Configure FileAppender
- Use multiple appenders
- Customize logging using `logback.xml`

---

# Logging Levels Covered

- DEBUG
- INFO
- WARN
- ERROR

---

# SLF4J Features Covered

- Logger
- LoggerFactory
- Parameterized Logging
- Logback Configuration
- ConsoleAppender
- FileAppender
- Encoder
- Logging Pattern
- Root Logger
- logback.xml

---

# Learning Outcomes

After completing this module, I learned how to:

- Configure SLF4J with Logback.
- Create loggers using `LoggerFactory`.
- Log messages using different logging levels.
- Use parameterized logging for better performance.
- Configure logging using XML.
- Write logs to the console.
- Write logs to files.
- Configure multiple appenders.
- Customize log formats.
- Manage dependencies using Maven.

---

# Verification

These exercises require:

- Java
- Maven
- SLF4J API
- Logback Classic

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

For **Exercise 3**, an additional file named **app.log** is generated containing the same log messages.

---

# Module Statistics

| Category | Count |
|----------|------:|
| Modules | 1 |
| Exercises | 3 |
| Java Classes | 3 |
| Maven Projects | 3 |
| Logback Configuration Files | 1 |
| README Files | 5 |

---

# Skills Gained

- Java Logging
- SLF4J
- Logback
- LoggerFactory
- Logging Levels
- Parameterized Logging
- ConsoleAppender
- FileAppender
- Logging Configuration
- XML Configuration
- Maven Dependency Management

---

# Author

**Jeet Lohar**

B.Tech Computer Science and Engineering

Lovely Professional University

Cognizant DN 5 Java FSE Deep Skilling Program

2026