# Handson-5: Country Service

## Objective

Implement the **Country Service** using **Spring Data JPA**.

This hands-on introduces the Repository and Service layers by retrieving all countries from the MySQL database using the built-in `findAll()` method provided by Spring Data JPA.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- Maven
- MySQL 8

---

## Project Structure

```
orm-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.ormlearn
│   │   │
│   │   │       ├── model
│   │   │       │     Country.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │     CountryRepository.java
│   │   │       │
│   │   │       ├── service
│   │   │       │     CountryService.java
│   │   │       │
│   │   │       └── OrmLearnApplication.java
│   │   │
│   │   └── resources
│   │         application.properties
│   │
│   └── test
│
├── countries.sql
├── pom.xml
└── README.md
```

---

## Features

- Spring Boot Configuration
- MySQL Integration
- Hibernate ORM
- Spring Data JPA Repository
- Service Layer
- Retrieve all countries
- Transaction Management

---

## Repository

```java
public interface CountryRepository
        extends JpaRepository<Country, String> {

}
```

---

## Service

```java
@Transactional
public List<Country> getAllCountries() {

    return countryRepository.findAll();

}
```

---

## Repository Method Used

```java
findAll()
```

This method retrieves every record from the `country` table without requiring a custom query. It is inherited from `JpaRepository`. :contentReference[oaicite:0]{index=0}

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

Sample Data

| Country Code | Country Name |
|--------------|--------------|
| IN | India |
| US | United States |
| GB | United Kingdom |
| JP | Japan |

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

```
Start

Countries =
[
Country(code=IN, name=India),
Country(code=US, name=United States),
Country(code=GB, name=United Kingdom)
]

End
```

---

## Learning Outcome

- Spring Data JPA setup
- Repository Pattern
- Service Layer
- Dependency Injection
- Transaction Management
- Using JpaRepository
- Reading records from MySQL

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer