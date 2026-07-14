# Handson-1: Query Methods

## Objective

Implement and demonstrate Spring Data JPA Query Methods using derived query method names.

This hands-on demonstrates how Spring Data JPA automatically generates SQL queries from repository method names without writing SQL or JPQL manually.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL 8
- Maven

---

## Project Structure

```
orm-learn
│
├── src
│   ├── main
│   │
│   ├── java
│   │   └── com.cognizant.ormlearn
│   │
│   │       ├── model
│   │       │     Country.java
│   │       │
│   │       ├── repository
│   │       │     CountryRepository.java
│   │       │
│   │       ├── service
│   │       │     CountryService.java
│   │       │
│   │       └── OrmLearnApplication.java
│   │
│   └── resources
│         application.properties
│
├── countries.sql
├── pom.xml
└── README.md
```

---

## Repository Query Methods

The following derived query methods were implemented:

```java
findByNameContaining(String text)

findByNameContainingOrderByNameAsc(String text)

findByNameStartingWith(String alphabet)
```

Spring Data JPA derives SQL queries automatically from these method names. :contentReference[oaicite:0]{index=0}

---

## Service Methods

- Search countries containing a keyword
- Search countries containing a keyword and sort alphabetically
- Search countries starting with a specific letter

---

## Database

Database

```
ormlearn
```

Table

```
country
```

---

## Sample Data

- India
- United States
- Australia
- South Africa
- Zambia
- Zimbabwe
- Luxembourg
- Bouvet Island
- Djibouti
- Guadeloupe
- South Sudan
- French Southern Territories

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

### Query Method 1

Countries containing:

```
"ou"
```

---

### Query Method 2

Countries containing:

```
"ou"
```

Sorted in ascending order.

---

### Query Method 3

Countries starting with:

```
Z
```

Returns:

```
Zambia
Zimbabwe
```

---

## Concepts Covered

- Spring Data JPA
- Repository Pattern
- Derived Query Methods
- Query Creation from Method Names
- Order By
- Containing
- StartingWith
- Dependency Injection
- Service Layer
- Hibernate ORM
- MySQL Integration

---

## Learning Outcome

After completing this hands-on you will understand:

- How Spring Data JPA generates SQL automatically
- Repository method naming conventions
- Derived query methods
- Service layer implementation
- Query execution using Hibernate

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer