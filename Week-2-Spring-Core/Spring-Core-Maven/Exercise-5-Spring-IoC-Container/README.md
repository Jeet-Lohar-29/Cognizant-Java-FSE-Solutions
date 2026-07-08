# Exercise 5 - Configuring the Spring IoC Container

## Objective

Configure the Spring IoC Container using XML-based configuration.

---

## Technologies Used

- Java
- Spring Core
- Maven

---

## Project Structure

```
Exercise-5-Spring-IoC-Container/
│
├── src/
├── pom.xml
└── README.md
```

---

## Files

- BookRepository.java
- BookService.java
- LibraryManagementApplication.java
- applicationContext.xml
- pom.xml

---

## Concepts Covered

- Spring IoC Container
- XML Bean Configuration
- Setter Dependency Injection
- Bean References
- ApplicationContext

---

## Expected Output

```
Book Service Bean Loaded
Book Repository Bean Loaded

Spring IoC Container Configured Successfully
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

- Configure the Spring IoC Container.
- Manage beans through XML.
- Perform setter-based dependency injection.
- Load beans using `ApplicationContext`.

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program