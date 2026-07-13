# Handson-7: Add Country

## Objective

Implement the **Add Country** feature using Spring Data JPA.

This exercise extends Handson-6 by adding a new country to the MySQL database using the `save()` method provided by `JpaRepository`.

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
Handson-7-Add-Country
│
└── orm-learn
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── com.cognizant.ormlearn
    │   │   │       ├── model
    │   │   │       ├── repository
    │   │   │       ├── service
    │   │   │       ├── exception
    │   │   │       └── OrmLearnApplication.java
    │   │   └── resources
    │   │       └── application.properties
    │   └── test
    ├── countries.sql
    ├── pom.xml
    └── README.md
```

---

## Features Implemented

- Retrieve country by country code
- Add new country
- Spring Data JPA Repository
- Service Layer
- Transaction Management
- MySQL Integration

---

## Service Method

```java
@Transactional
public void addCountry(Country country) {
    countryRepository.save(country);
}
```

---

## Test

The application creates a new Country object and saves it into the database.

Example:

```
Code : ZZ
Name : ChatGPT Land
```

After saving, the application retrieves the same country using:

```java
countryService.findCountryByCode("ZZ");
```

---

## Database

Schema:

```
ormlearn
```

Table:

```
country
```

---

## Build

```
mvn clean compile
```

---

## Run

```
mvn spring-boot:run
```

---

## Expected Output

```
Start

Country : Country(code=ZZ, name=ChatGPT Land)

End
```

---

## Learning Outcome

- Using JpaRepository.save()
- Persisting entities with Spring Data JPA
- Transaction Management using @Transactional
- CRUD Create Operation
- Service Layer Architecture

---

## Author

Jeet Lohar

Cognizant Digital Nurture 4.0 Java FSE