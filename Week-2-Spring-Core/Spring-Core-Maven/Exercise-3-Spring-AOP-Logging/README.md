# Exercise 3 - Implementing Logging with Spring AOP

## Objective

Implement logging using Spring AOP.

---

## Technologies Used

- Java
- Spring Core
- Spring AOP
- AspectJ Weaver
- Maven

---

## Files

- BookRepository.java
- BookService.java
- LoggingAspect.java
- LibraryManagementApplication.java
- applicationContext.xml
- pom.xml

---

## Concepts Covered

- Spring AOP
- Aspect
- Around Advice
- Execution Pointcut
- AspectJ Support
- XML Configuration

---

## Expected Output

```
Book Service Executed

Execution Time : 2 ms
```

(The execution time will vary.)

---

## Verification

Compile

```bash
mvn clean compile
```

Run

```bash
mvn exec:java
```

---

## Learning Outcomes

- Understand Spring AOP.
- Measure method execution time.
- Configure AspectJ support.
- Apply cross-cutting concerns using aspects.

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program