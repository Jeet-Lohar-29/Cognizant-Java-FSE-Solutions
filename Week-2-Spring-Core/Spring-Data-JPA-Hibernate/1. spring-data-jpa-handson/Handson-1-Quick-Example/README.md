# Handson 1 - Quick Example

## Objective

The objective of this hands-on is to understand the basic setup and implementation of **Spring Data JPA** using **Spring Boot** and **MySQL**. This exercise demonstrates how to configure a Spring Boot project, connect it to a MySQL database, define an entity, create a repository, implement a service layer, and retrieve data from the database. Spring Data JPA simplifies data access by generating repository implementations automatically. :contentReference[oaicite:0]{index=0}

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven

---

## Project Structure

```text
Handson-1-Quick-Example
│
├── orm-learn
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── cognizant
│   │   │   │           └── ormlearn
│   │   │   │               ├── config
│   │   │   │               ├── exception
│   │   │   │               ├── model
│   │   │   │               │   └── Country.java
│   │   │   │               ├── repository
│   │   │   │               │   └── CountryRepository.java
│   │   │   │               ├── service
│   │   │   │               │   └── CountryService.java
│   │   │   │               └── OrmLearnApplication.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   │
│   ├── pom.xml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── README.md
│
└── README.md
```

---

## Features Implemented

- Spring Boot project setup
- MySQL database connectivity
- Spring Data JPA configuration
- Hibernate ORM integration
- Country entity mapping
- Repository interface using `JpaRepository`
- Service layer implementation
- Fetching all countries from the database
- Console output using `CommandLineRunner`

---

## Database Schema

Database

```sql
ormlearn
```

Table

```sql
country
```

Columns

| Column | Type | Description |
|---------|------|-------------|
| co_code | VARCHAR(2) | Primary Key |
| co_name | VARCHAR(50) | Country Name |

---

## Build & Run

### Compile

```bash
mvn clean compile
```

### Run

```bash
mvn spring-boot:run
```

---

## Expected Output

```text
Countries in Database:

Country [code=IN, name=India]
Country [code=US, name=United States]
```

---

## Concepts Covered

- Spring Boot Project Structure
- Spring Initializr
- Spring Data JPA
- Hibernate ORM
- Entity Mapping
- Repository Pattern
- Dependency Injection
- Service Layer
- MySQL Integration
- Maven Build Lifecycle

---

## Learning Outcomes

After completing this hands-on, I learned how to:

- Create a Spring Boot project using Spring Initializr.
- Configure a MySQL datasource.
- Map Java classes to database tables using JPA annotations.
- Create repository interfaces with Spring Data JPA.
- Implement a service layer for business logic.
- Retrieve records from a relational database without writing SQL for basic CRUD operations, leveraging Spring Data JPA repositories. :contentReference[oaicite:1]{index=1}

---

## Verification

✔ Maven Build Successful

✔ Spring Boot Project Configured

✔ MySQL Database Connected

✔ JPA Repository Created

✔ Data Retrieved Successfully

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering (Data Science)

Lovely Professional University

**Cognizant DN 5 Java FSE Deep Skilling Program**