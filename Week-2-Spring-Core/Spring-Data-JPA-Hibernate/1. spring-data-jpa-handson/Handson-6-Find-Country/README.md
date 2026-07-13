# Handson 6 - Find Country

## Objective

Implement a service method to retrieve a country based on its country code using Spring Data JPA.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- MySQL

---

## Project Structure

```
orm-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.ormlearn
│   │   │       ├── model
│   │   │       │     Country.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │     CountryRepository.java
│   │   │       │
│   │   │       ├── service
│   │   │       │     CountryService.java
│   │   │       │
│   │   │       ├── service.exception
│   │   │       │     CountryNotFoundException.java
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

- Retrieve Country by Country Code
- Uses `JpaRepository.findById()`
- Custom Exception Handling
- Service Layer Implementation
- Transaction Management

---

## Repository Method

```java
findById(String countryCode)
```

---

## Service Method

```java
findCountryByCode(String countryCode)
```

---

## Exception

```java
CountryNotFoundException
```

Thrown when the requested country code is not available in the database.

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

Country [code=IN, name=India]

End
```

---

## Learning Outcome

- Understand Spring Data JPA's `findById()` method.
- Work with `Optional<T>`.
- Implement custom exception handling.
- Retrieve records using the primary key.

---

## Status

✅ Completed