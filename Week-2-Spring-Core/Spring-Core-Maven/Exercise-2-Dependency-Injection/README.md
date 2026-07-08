# Exercise 2 - Implementing Dependency Injection

## Objective

Implement Setter Dependency Injection using Spring XML configuration.

---

## Problem Statement

Configure a Library Management application where `BookService` depends on `BookRepository`.

The dependency is injected using Spring's IoC container through XML configuration.

---

## Technologies Used

- Java
- Spring Core
- Maven

---

## Project Structure

```
Exercise-2-Dependency-Injection/
│── src/
│── pom.xml
└── README.md
```

---

## Files Description

### BookRepository.java

Repository class.

### BookService.java

Service class with Setter Dependency Injection.

### applicationContext.xml

Spring XML configuration defining beans and dependencies.

### LibraryManagementApplication.java

Loads the Spring container and verifies dependency injection.

---

## Expected Output

```
Book Service Started
Book Repository Connected

Dependency Injection Successful
```

---

## Concepts Used

- Spring IoC
- Dependency Injection
- Setter Injection
- XML Configuration
- ApplicationContext

---

## Learning Outcomes

After completing this exercise, you will understand:

- Spring IoC Container
- Setter Dependency Injection
- Bean Wiring using XML
- Bean References using `ref`
- Loading Spring Context

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program