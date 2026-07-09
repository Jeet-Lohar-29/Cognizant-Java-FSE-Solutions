# Exercise 9 - Creating a Spring Boot Application

## Objective

Develop a **Spring Boot** application for a Library Management System that exposes RESTful CRUD APIs using **Spring Web**, **Spring Data JPA**, and an **H2 in-memory database**.

---

## Problem Statement

Create a Spring Boot application that:

- Uses Spring Initializr
- Connects to an H2 Database
- Defines a Book entity
- Uses Spring Data JPA for database operations
- Exposes CRUD REST APIs
- Runs on an embedded Tomcat server

---

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Hibernate ORM
- H2 Database
- Maven

---

## Project Structure

```text
Exercise-9-Spring-Boot-Application
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── library
│       │           ├── controller
│       │           │      BookController.java
│       │           │
│       │           ├── entity
│       │           │      Book.java
│       │           │
│       │           ├── repository
│       │           │      BookRepository.java
│       │           │
│       │           └── LibraryManagementApplication.java
│       │
│       └── resources
│              application.properties
│
├── pom.xml
└── README.md
```

---

## Features

- Spring Boot Application
- Embedded Tomcat Server
- RESTful Web Services
- CRUD Operations
- Spring Data JPA Repository
- Hibernate ORM
- H2 In-Memory Database
- Automatic Table Creation

---

## REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/books` | Retrieve all books |
| GET | `/books/{id}` | Retrieve a book by ID |
| POST | `/books` | Add a new book |
| PUT | `/books/{id}` | Update an existing book |
| DELETE | `/books/{id}` | Delete a book |

---

## Sample JSON Request

### POST `/books`

```json
{
    "title": "Spring Boot",
    "author": "Jeet Lohar",
    "price": 599
}
```

### Sample Response

```json
{
    "id": 1,
    "title": "Spring Boot",
    "author": "Jeet Lohar",
    "price": 599.0
}
```

---

## H2 Database Configuration

The application uses an in-memory H2 database.

H2 Console URL

```
http://localhost:8080/h2-console
```

Connection Details

| Property | Value |
|----------|-------|
| JDBC URL | jdbc:h2:mem:librarydb |
| Username | sa |
| Password | *(leave blank)* |

---

## Verification

### Compile

```bash
mvn clean compile
```

### Run

```bash
mvn spring-boot:run
```

Expected Output

```
Started LibraryManagementApplication

Tomcat started on port(s): 8080
```

Open:

```
http://localhost:8080/books
```

Expected response for an empty database:

```json
[]
```

---

## Concepts Covered

- Spring Boot
- Spring Initializr
- Spring Web
- REST Controller
- CRUD Operations
- Spring Data JPA
- JpaRepository
- Hibernate ORM
- H2 Database
- Entity Mapping
- Embedded Tomcat

---

## Learning Outcomes

After completing this exercise, I learned how to:

- Create a Spring Boot application
- Configure Spring Boot using Maven
- Build REST APIs
- Connect to an H2 in-memory database
- Create JPA entities
- Use Spring Data JPA repositories
- Perform CRUD operations
- Test REST endpoints using a browser or Postman

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering (Data Science)

Lovely Professional University

Cognizant DN 5 Java FSE Deep Skilling Program