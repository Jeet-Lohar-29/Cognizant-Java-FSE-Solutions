# Module 2: Spring Data JPA Hands-on

## Overview

This module focuses on implementing **Spring Data JPA** concepts using **Spring Boot**, **Hibernate**, and **MySQL**.

The hands-ons cover repository query methods, entity relationships, ORM mapping, and CRUD operations using Spring Data JPA.

Spring Data JPA reduces boilerplate code by providing repository abstractions that simplify data access while leveraging Hibernate as the JPA implementation. :contentReference[oaicite:0]{index=0}

---

# Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- MySQL 8
- Maven
- Git & GitHub

---

# Module Structure

```
2. spring-data-jpa-handson
│
├── Handson-1-Query-Methods
├── Handson-2-Stock-Query-Methods
├── Handson-3-ORM-Mapping
├── Handson-4-Many-To-One
├── Handson-5-One-To-Many
├── Handson-6-Many-To-Many
│
└── README.md
```

---

# Hands-on Summary

## Handson-1: Query Methods

### Objective

- Create Spring Data JPA repositories.
- Implement derived query methods.
- Retrieve data using repository method naming conventions.

### Concepts Covered

- JpaRepository
- Query Method Derivation
- CRUD Operations

---

## Handson-2: Stock Query Methods

### Objective

Implement custom query methods for the Stock entity.

### Concepts Covered

- Repository Queries
- Custom Finder Methods
- Spring Data Query Generation

---

## Handson-3: ORM Mapping

### Objective

Configure ORM mapping between Java entities and database tables.

### Concepts Covered

- Entity Mapping
- Primary Keys
- Hibernate ORM
- Spring Boot Configuration

---

## Handson-4: Many-To-One Mapping

### Objective

Implement a Many-To-One relationship between Employee and Department.

### Concepts Covered

- @ManyToOne
- @JoinColumn
- Foreign Keys
- Bidirectional Relationships

---

## Handson-5: One-To-Many Mapping

### Objective

Implement the reverse One-To-Many relationship.

### Concepts Covered

- @OneToMany
- mappedBy
- FetchType.LAZY
- FetchType.EAGER
- LazyInitializationException

---

## Handson-6: Many-To-Many Mapping

### Objective

Implement a Many-To-Many relationship between Employee and Skill.

### Concepts Covered

- @ManyToMany
- @JoinTable
- Join Tables
- Owning Side
- Inverse Side
- Entity Associations

---

# Learning Outcomes

After completing this module, you will understand:

- Spring Data JPA architecture
- Repository Pattern
- Query Method Derivation
- Hibernate ORM
- Entity Mapping
- CRUD Operations
- Transaction Management
- Bidirectional Relationships
- One-To-Many Mapping
- Many-To-One Mapping
- Many-To-Many Mapping
- Fetch Strategies (LAZY & EAGER)
- Join Tables
- Spring Boot Database Integration

---

# Build

Compile any hands-on project:

```bash
mvn clean compile
```

---

# Run

Run any Spring Boot project:

```bash
mvn spring-boot:run
```

---

# Module Completion

| Hands-on | Status |
|----------|--------|
| Handson-1 : Query Methods | ✅ Completed |
| Handson-2 : Stock Query Methods | ✅ Completed |
| Handson-3 : ORM Mapping | ✅ Completed |
| Handson-4 : Many-To-One | ✅ Completed |
| Handson-5 : One-To-Many | ✅ Completed |
| Handson-6 : Many-To-Many | ✅ Completed |

---

# Key Concepts Learned

- Spring Boot
- Spring Data JPA
- Hibernate
- Entity Mapping
- Repository Pattern
- Query Methods
- CRUD Operations
- ORM
- Bidirectional Relationships
- JPA Annotations
- Fetch Strategies
- Join Tables

---

# Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer