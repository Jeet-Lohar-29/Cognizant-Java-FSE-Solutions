# Module 3: Spring Data JPA Hands-on

## Objective

This module focuses on advanced querying techniques in **Spring Data JPA** using:

- JPQL (Java Persistence Query Language)
- HQL (Hibernate Query Language)
- Native SQL Queries
- JPA Criteria API

The hands-ons demonstrate how to retrieve, filter, aggregate, and dynamically query database records using Spring Boot, Hibernate, and Spring Data JPA. The Criteria API introduces a type-safe way to construct queries programmatically, complementing JPQL/HQL and native queries. :contentReference[oaicite:0]{index=0}

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven

---

## Module Structure

```text
3. spring-data-jpa-handson
│
├── Handson-1-HQL-JPQL
├── Handson-2-HQL-Permanent-Employees
├── Handson-3-HQL-Quiz
├── Handson-4-HQL-Average-Salary
├── Handson-5-Native-Query
├── Handson-6-Criteria-Query
└── README.md
```

---

## Hands-ons Covered

### Handson-1: HQL & JPQL

- Introduction to JPQL and HQL
- Entity-based querying
- Repository query methods

---

### Handson-2: HQL Permanent Employees

- Custom HQL queries
- Filtering permanent employees
- Spring Data JPA `@Query`

---

### Handson-3: HQL Quiz

- Complex HQL queries
- JOIN and JOIN FETCH
- Fetching related entities efficiently

---

### Handson-4: HQL Average Salary

- Aggregate functions
- `AVG()` in HQL
- Named parameters with `@Param`

---

### Handson-5: Native Query

- Native SQL queries
- `nativeQuery = true`
- Comparing HQL and SQL

---

### Handson-6: Criteria Query

- JPA Criteria API
- `CriteriaBuilder`
- `CriteriaQuery`
- `Root`
- `TypedQuery`
- Dynamic query construction

---

## Key Concepts Learned

- JPQL
- Hibernate Query Language (HQL)
- Native SQL Queries
- Spring Data JPA Repositories
- Custom Repository Methods
- Aggregate Functions
- Entity Relationships
- JOIN FETCH
- Criteria API
- Dynamic Queries
- EntityManager
- Repository Pattern

---

## Build

Run from any `orm-learn` project directory:

```bash
mvn clean compile
```

---

## Run

```bash
mvn spring-boot:run
```

---

## Learning Outcomes

After completing this module, you will be able to:

- Write JPQL and HQL queries.
- Create custom repository methods using `@Query`.
- Execute native SQL queries using Spring Data JPA.
- Use aggregate functions such as `AVG()`.
- Fetch related entities efficiently with JOIN FETCH.
- Build dynamic, type-safe queries using the JPA Criteria API.
- Work with Hibernate and Spring Data JPA in Spring Boot applications.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer