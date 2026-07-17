# Handson-6: Criteria Query

## Objective

Implement a simple **JPA Criteria API** query to retrieve all employee records from the database.

This hands-on demonstrates how to create type-safe dynamic queries using the JPA Criteria API instead of JPQL/HQL or Native SQL.

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven

---

## Project Structure

```text
orm-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.ormlearn
│   │   │       ├── model
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       │     CriteriaQueryService.java
│   │   │       └── OrmLearnApplication.java
│   │   └── resources
│   │         application.properties
│
├── pom.xml
└── README.md
```

---

## Criteria API Flow

The Criteria API follows these steps:

1. Obtain an `EntityManager`
2. Create a `CriteriaBuilder`
3. Create a `CriteriaQuery`
4. Define the query root using `Root`
5. Create a `TypedQuery`
6. Execute the query using `getResultList()`

Example:

```java
CriteriaBuilder builder = entityManager.getCriteriaBuilder();

CriteriaQuery<Employee> criteriaQuery =
        builder.createQuery(Employee.class);

Root<Employee> employee =
        criteriaQuery.from(Employee.class);

criteriaQuery.select(employee);

TypedQuery<Employee> query =
        entityManager.createQuery(criteriaQuery);

List<Employee> employees = query.getResultList();
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

```text
Start

Employee{id=1, ...}
Employee{id=2, ...}
Employee{id=3, ...}

End
```

---

## Concepts Covered

- JPA Criteria API
- CriteriaBuilder
- CriteriaQuery
- Root
- TypedQuery
- EntityManager
- Dynamic Queries

---

## Learning Outcomes

- Understand how to build type-safe queries.
- Use the Criteria API instead of string-based JPQL.
- Execute dynamic queries using `EntityManager`.
- Retrieve entity data using `TypedQuery`.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer