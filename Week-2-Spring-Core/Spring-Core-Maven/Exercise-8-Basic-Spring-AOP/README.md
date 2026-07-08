# Exercise 8 - Implementing Basic AOP with Spring

## Objective

Implement basic Spring AOP using Before and After advice.

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
- @Aspect
- @Before
- @After
- AspectJ Auto Proxy
- Cross-Cutting Concerns

---

## Expected Output

```
Before Method Execution

Book Service Executed

After Method Execution
```

---

## Verification

Compile:

```bash
mvn clean compile
```

Run:

```bash
mvn exec:java
```

---

## Learning Outcomes

- Create a Spring Aspect.
- Use Before and After advice.
- Configure AspectJ auto-proxying.
- Separate logging from business logic.

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program