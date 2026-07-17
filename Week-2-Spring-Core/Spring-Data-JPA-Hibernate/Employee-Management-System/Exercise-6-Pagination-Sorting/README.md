# Exercise 6: Employee Management System - Pagination & Sorting

## Objective

Implement **pagination** and **sorting** in the Employee Management System using Spring Data JPA.

This exercise demonstrates how to retrieve employee records efficiently by dividing results into pages and sorting them dynamically using Spring Data JPA's `Page`, `Pageable`, `PageRequest`, and `Sort` classes.

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- H2 Database
- Spring Web
- Lombok
- Maven

---

## Project Structure

```text
employee-management-system
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.ems
│   │   │       ├── controller
│   │   │       │   ├── EmployeeController.java
│   │   │       │   └── DepartmentController.java
│   │   │       │
│   │   │       ├── entity
│   │   │       │   ├── Employee.java
│   │   │       │   └── Department.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │   ├── EmployeeRepository.java
│   │   │       │   └── DepartmentRepository.java
│   │   │       │
│   │   │       ├── service
│   │   │       │   ├── EmployeeService.java
│   │   │       │   └── DepartmentService.java
│   │   │       │
│   │   │       └── EmployeeManagementSystemApplication.java
│   │   │
│   │   └── resources
│   │         └── application.properties
│   │
├── pom.xml
└── README.md
```

---

## Features Implemented

### Pagination

Retrieve employee records page by page.

Example:

```java
Pageable pageable = PageRequest.of(page, size);
return employeeRepository.findAll(pageable);
```

---

### Sorting

Retrieve employee records sorted by any field.

Ascending:

```java
Sort.by(field)
```

Descending:

```java
Sort.by(field).descending()
```

---

### Pagination + Sorting

Pagination and sorting are combined using:

```java
PageRequest.of(page, size, Sort.by(field))
```

---

## REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/employees/page?page=0&size=5` | Pagination |
| GET | `/employees/sort?page=0&size=5&field=name` | Pagination + Ascending Sort |
| GET | `/employees/sort-desc?page=0&size=5&field=name` | Pagination + Descending Sort |

---

## Spring Data JPA Classes Used

- `Page`
- `Pageable`
- `PageRequest`
- `Sort`

These classes are provided by Spring Data JPA to simplify pagination and sorting without writing custom SQL queries.

---

## Build

```bash
mvn clean compile
```

---

## Run

```bash
mvn spring-boot:run
```

---

## Expected Output

```text
Started EmployeeManagementSystemApplication
```

Calling the REST endpoints returns paginated employee data along with metadata such as:

- Current Page
- Total Pages
- Total Elements
- Page Size

---

## Concepts Covered

- Spring Data JPA Pagination
- Pageable
- Page
- PageRequest
- Sorting
- Sort
- REST API
- Repository Layer
- Service Layer

---

## Learning Outcomes

After completing this exercise, you will understand:

- Implementing pagination using `Page` and `Pageable`.
- Sorting records in ascending and descending order.
- Combining pagination with sorting.
- Exposing paginated REST APIs using Spring Boot.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer