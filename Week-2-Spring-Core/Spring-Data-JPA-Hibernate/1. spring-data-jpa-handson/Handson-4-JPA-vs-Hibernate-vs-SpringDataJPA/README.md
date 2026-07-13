# Hands-on 4 – Difference between JPA, Hibernate and Spring Data JPA

## Objective

Understand the relationship between Java Persistence API (JPA), Hibernate and Spring Data JPA.

---

## What is JPA?

- JPA stands for Java Persistence API.
- It is a specification (JSR 338).
- It defines standard interfaces and annotations for Object Relational Mapping (ORM).
- JPA itself does not contain any implementation.

Examples:

- @Entity
- @Table
- @Id
- EntityManager

---

## What is Hibernate?

- Hibernate is an ORM Framework.
- Hibernate is one of the implementations of JPA.
- Hibernate converts Java objects into database records.
- Hibernate internally uses JDBC to communicate with the database.

Extra Features:

- HQL
- Criteria API
- Caching
- Lazy Loading
- Dirty Checking

---

## What is Spring Data JPA?

Spring Data JPA is a framework built on top of JPA.

It reduces boilerplate code by providing:

- JpaRepository
- CrudRepository
- Automatic Query Methods
- Transaction Management
- Pagination
- Sorting

It still requires a JPA provider such as Hibernate.

---

## Architecture

Application

↓

Spring Data JPA

↓

Hibernate (JPA Provider)

↓

JDBC

↓

MySQL Database

---

## Comparison

| Feature | JPA | Hibernate | Spring Data JPA |
|----------|-----|-----------|-----------------|
| Type | Specification | ORM Framework | Spring Framework |
| Implementation | ❌ | ✅ | ❌ |
| Database Access | Through Provider | Direct ORM | Through Hibernate |
| Boilerplate Code | Medium | High | Very Low |
| Transaction Management | Manual | Manual | Automatic (@Transactional) |

---

## Hibernate Example

```java
Session session = factory.openSession();

Transaction tx = session.beginTransaction();

session.save(employee);

tx.commit();

session.close();
```

---

## Spring Data JPA Example

```java
@Autowired
private EmployeeRepository repository;

@Transactional
public void addEmployee(Employee employee){
    repository.save(employee);
}
```

---

## Advantages of Spring Data JPA

- Less code
- Repository pattern
- Auto-generated CRUD methods
- Easy transaction management
- Better maintainability

---

## Conclusion

JPA defines the rules.

Hibernate implements those rules.

Spring Data JPA simplifies working with Hibernate by reducing boilerplate code.