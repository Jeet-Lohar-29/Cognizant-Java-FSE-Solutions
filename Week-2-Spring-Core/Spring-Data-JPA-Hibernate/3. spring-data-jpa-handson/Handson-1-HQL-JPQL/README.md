# Handson-1: Introduction to HQL & JPQL

## Objective

Understand the fundamentals of Hibernate Query Language (HQL) and Java Persistence Query Language (JPQL).

This hands-on introduces object-oriented query languages used in Hibernate and Spring Data JPA.

---

## What is HQL?

Hibernate Query Language (HQL) is an object-oriented query language provided by Hibernate.

Instead of querying database tables, HQL queries Java entity classes and their properties.

Example:

```java
SELECT e FROM Employee e
```

---

## What is JPQL?

Java Persistence Query Language (JPQL) is the standard query language defined by the JPA specification.

JPQL is supported by all JPA providers, including Hibernate.

Example:

```java
SELECT e FROM Employee e
```

---

## Difference Between HQL and JPQL

| HQL | JPQL |
|-----|------|
| Hibernate specific | JPA standard |
| Supports INSERT | Does not support INSERT |
| Superset of JPQL | Subset of HQL |
| Works only with Hibernate | Works with any JPA provider |

---

## Similarities

Both support:

- SELECT
- UPDATE
- DELETE

Both query:

- Java classes
- Entity properties

instead of database tables.

---

## Advantages

- Database independent
- Object-oriented
- Easy to read
- Integrates with Spring Data JPA
- Reduces SQL dependency

---

## Learning Outcomes

After completing this hands-on you will understand:

- HQL
- JPQL
- Difference between HQL and JPQL
- Advantages of object-oriented query languages
- Entity-based querying

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer