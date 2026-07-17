# Exercise 2: Employee Management System - Creating Entities

## Objective

Create JPA entity classes for **Employee** and **Department** and establish a **One-to-Many / Many-to-One** relationship between them using Spring Data JPA and Hibernate.

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- H2 Database
- Lombok
- Maven

---

## Project Structure

```text
employee-management-system
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.ems
│   │   │       ├── entity
│   │   │       │   ├── Employee.java
│   │   │       │   └── Department.java
│   │   │       └── EmployeeManagementSystemApplication.java
│   │   └── resources
│   │         └── application.properties
│   │
├── pom.xml
└── README.md
```

---

## Employee Entity

The `Employee` entity contains:

- id
- name
- email
- department

Each employee belongs to one department.

```java
@ManyToOne
@JoinColumn(name = "department_id")
private Department department;
```

---

## Department Entity

The `Department` entity contains:

- id
- name
- employees

One department can have multiple employees.

```java
@OneToMany(mappedBy = "department")
private List<Employee> employees;
```

---

## Relationship Mapping

The project implements a **bidirectional One-to-Many / Many-to-One relationship**.

- `@ManyToOne` is placed on the `Employee` entity.
- `@OneToMany(mappedBy = "department")` is placed on the `Department` entity.
- The foreign key `department_id` is stored in the `employees` table. This is the standard JPA approach where the many-side owns the relationship. :contentReference[oaicite:0]{index=0}

---

## JPA Annotations Used

- `@Entity`
- `@Table`
- `@Id`
- `@GeneratedValue`
- `@Column`
- `@OneToMany`
- `@ManyToOne`
- `@JoinColumn`

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
Started EmployeeManagementSystemApplication
```

Hibernate automatically creates the entity tables and the foreign key relationship based on the JPA annotations.

---

## Learning Outcomes

After completing this exercise, you will understand:

- Creating JPA entity classes.
- Mapping Java classes to database tables.
- Defining primary keys.
- Using `@Entity` and `@Table`.
- Implementing One-to-Many and Many-to-One relationships.
- Configuring foreign keys with `@JoinColumn`.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer