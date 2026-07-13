# Handson-9: Delete Country

## Objective

Implement the **Delete Country** functionality using Spring Data JPA.

This exercise extends Handson-8 by deleting an existing country record from the MySQL database using the `deleteById()` method provided by `JpaRepository`.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- MySQL 8

---

## Project Structure

```
Handson-9-Delete-Country
│
└── orm-learn
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
    │   │   │       ├── exception
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

## Features Implemented

- Retrieve Country by Country Code
- Add New Country
- Update Existing Country
- Delete Country
- Spring Data JPA Repository
- Service Layer
- Transaction Management
- MySQL Integration

---

## Service Method

```java
@Transactional
public void deleteCountry(String countryCode) {
    countryRepository.deleteById(countryCode);
}
```

---

## Test

The application:

- Deletes an existing country using its country code.
- Verifies the deletion by checking that the record is no longer available in the database.

Example:

```
Country Code : ZZ

Country Deleted Successfully
```

---

## Database

Schema

```
ormlearn
```

Table

```
country
```

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

Country Deleted Successfully

End
```

---

## Learning Outcome

- Using `JpaRepository.deleteById()`
- Deleting entities from the database
- Spring Data JPA CRUD Delete Operation
- Transaction Management
- Working with Repository methods

---

## Author

Jeet Lohar

Cognizant Digital Nurture 4.0 Java FSE