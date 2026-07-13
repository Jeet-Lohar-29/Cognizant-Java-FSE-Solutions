# 1. Spring Data JPA Hands-on

## Overview

This module contains the Spring Data JPA hands-on exercises completed as part of the **Cognizant Digital Nurture 4.0 - Java Full Stack Engineer (FSE)** program.

The exercises introduce the fundamentals of Spring Data JPA, Hibernate, entity mapping, repository design, and CRUD operations using MySQL.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- Maven
- MySQL 8
- IntelliJ IDEA / VS Code

---

# Folder Structure

```
1. spring-data-jpa-handson
│
├── Handson-1-Quick-Example
│
├── Handson-2-Hibernate-XML
│
├── Handson-3-Hibernate-Annotations
│
├── Handson-4-JPA-vs-Hibernate-vs-SpringDataJPA
│
├── Handson-5-Country-Service
│
├── Handson-6-Find-Country
│
├── Handson-7-Add-Country
│
├── Handson-8-Update-Country
│
├── Handson-9-Delete-Country
│
└── README.md
```

---

# Hands-on Summary

## Handson-1: Quick Example

- Created first Spring Data JPA project
- Configured Spring Boot
- Connected MySQL database
- Implemented Country Entity
- Created Repository and Service layers

---

## Handson-2: Hibernate XML

- Hibernate configuration using XML
- Mapping with Employee.hbm.xml
- SessionFactory configuration
- CRUD using Hibernate Session API

---

## Handson-3: Hibernate Annotations

- Annotation-based entity mapping
- @Entity
- @Table
- @Id
- @Column
- Hibernate configuration using annotations

---

## Handson-4: JPA vs Hibernate vs Spring Data JPA

Topics covered

- JDBC
- Hibernate
- JPA
- Spring Data JPA

Comparison of

- Architecture
- Advantages
- Disadvantages
- Use Cases

---

## Handson-5: Country Service

Implemented

- Country Entity
- Repository Layer
- Service Layer
- Retrieve all countries

Methods used

```

findAll()

```

---

## Handson-6: Find Country

Implemented

- Find Country by Country Code
- Custom Exception Handling

Methods used

```

findById()

```

---

## Handson-7: Add Country

Implemented

- Insert new Country

Methods used

```

save()

```

---

## Handson-8: Update Country

Implemented

- Update existing Country

Methods used

```

save()

```

---

## Handson-9: Delete Country

Implemented

- Delete Country by Code

Methods used

```

deleteById()

```

---

# CRUD Operations Covered

| Operation | Repository Method |
| ---------- | ----------------- |
| Create     | save()            |
| Read All   | findAll()         |
| Read One   | findById()        |
| Update     | save()            |
| Delete     | deleteById()      |

---

# Database

Database

```
ormlearn
```

Table

```
country
```

---

# Build

```
mvn clean compile
```

---

# Run

```
mvn spring-boot:run
```

---

# Learning Outcomes

- Spring Boot project setup
- Hibernate ORM
- Spring Data JPA
- Entity Mapping
- Repository Pattern
- Service Layer
- Transaction Management
- Exception Handling
- CRUD Operations
- MySQL Integration

---

# References

- Spring Data JPA Repository
- Hibernate ORM
- Spring Boot
- Maven

Spring Data JPA repositories provide built-in CRUD methods such as `findAll()`, `findById()`, `save()`, and `deleteById()`, which were used throughout these hands-on exercises. :contentReference[oaicite:0]{index=0}

---

# Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 - Java Full Stack Engineer