# Exercise 6 - Configuring Beans with Annotations

## Objective

Configure Spring beans using annotations instead of XML bean definitions.

---

## Technologies Used

- Java
- Spring Core
- Maven

---

## Project Structure

```
Exercise-6-Annotation-Based-Configuration/
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

## Annotations Used

- @Service
- @Repository
- @Autowired

---

## Concepts Covered

- Component Scanning
- Annotation-Based Configuration
- Dependency Injection
- Spring IoC Container

---

## Expected Output

```
Book Service Bean Created
Book Repository Bean Created

Annotation Configuration Successful
```

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

- Use @Service and @Repository.
- Enable component scanning.
- Perform automatic dependency injection.
- Configure Spring without explicit bean declarations.

---

## Author

Jeet Lohar

Cognizant DN 5 Java FSE Deep Skilling Program