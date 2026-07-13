# Handson-8: Update Country

## Objective

Implement the **Update Country** functionality using Spring Data JPA.

This exercise extends Handson-7 by updating an existing country record using the `save()` method provided by `JpaRepository`.

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
Handson-8-Update-Country
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
- Spring Data JPA Repository
- Transaction Management
- MySQL Integration

---

## Service Method

```java
@Transactional
public void updateCountry(Country country) {
    countryRepository.save(country);
}
```

---

## Test

The application:

- Retrieves an existing country
- Updates its name
- Saves it back to the database
- Retrieves it again for verification

Example:

```
Country Code : IN
Old Name : India
New Name : Republic of India
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

Updated Country:
Country(code=IN, name=Republic of India)

End
```

---

## Learning Outcome

- Updating existing entities
- Using JpaRepository.save() for updates
- Working with managed entities
- Transaction Management
- CRUD Update Operation

---

## Author

Jeet Lohar

Cognizant Digital Nurture 4.0 Java FSE