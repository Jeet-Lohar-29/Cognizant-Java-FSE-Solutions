# Handson-5: One-To-Many Mapping

## Objective

Implement a **One-To-Many** relationship between `Department` and `Employee` using Spring Data JPA and Hibernate.

This hands-on extends the previous Many-To-One mapping by adding the reverse association, allowing a department to access all employees assigned to it.

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- MySQL 8
- Maven

---

## Project Structure

```
orm-learn
│
├── src
│   ├── main
│   │
│   ├── java
│   │   └── com.cognizant.ormlearn
│   │       ├── model
│   │       │     Employee.java
│   │       │     Department.java
│   │       │     Skill.java
│   │       │
│   │       ├── repository
│   │       │     EmployeeRepository.java
│   │       │     DepartmentRepository.java
│   │       │     SkillRepository.java
│   │       │
│   │       ├── service
│   │       │     EmployeeService.java
│   │       │     DepartmentService.java
│   │       │     SkillService.java
│   │       │
│   │       └── OrmLearnApplication.java
│   │
│   └── resources
│         application.properties
│
├── pom.xml
└── README.md
```

---

## One-To-Many Relationship

The relationship is implemented in the `Department` entity.

```java
@OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
private Set<Employee> employeeList;
```

Each department can contain multiple employees, while each employee belongs to only one department. By default, `@OneToMany` uses `FetchType.LAZY`; this hands-on changes it to `FetchType.EAGER` so the employee collection is loaded together with the department. :contentReference[oaicite:0]{index=0}

---

## Department Entity

The Department entity contains:

- Department ID
- Department Name
- Employee List

The `employeeList` collection stores all employees associated with the department.

---

## Employee Entity

The Employee entity already contains:

```java
@ManyToOne
@JoinColumn(name = "em_dp_id")
private Department department;
```

The `employee` table stores the foreign key (`em_dp_id`) that references the `department` table.

---

## Understanding `mappedBy`

`mappedBy = "department"` tells Hibernate that the relationship is owned by the `department` field inside the `Employee` entity.

Because of this, Hibernate reuses the existing foreign key instead of creating a separate join table. :contentReference[oaicite:1]{index=1}

---

## Lazy vs Eager Fetching

### FetchType.LAZY

- Loads only the Department initially.
- Employee records are loaded only when `employeeList` is accessed.
- Accessing the collection after the Hibernate session closes may result in `LazyInitializationException`.

### FetchType.EAGER

- Loads both Department and Employee records together.
- Used in this hands-on to demonstrate fetching related entities in a single operation. :contentReference[oaicite:2]{index=2}

---

## Why LazyInitializationException Occurs

When a collection is configured with LAZY loading, Hibernate postpones loading it until first access.

If the Hibernate session has already closed before `employeeList` is accessed, Hibernate cannot fetch the remaining data and throws:

```
LazyInitializationException
```

Using `FetchType.EAGER` prevents this for the purpose of this exercise.

---

## Repository Layer

Repositories used:

- EmployeeRepository
- DepartmentRepository
- SkillRepository

These interfaces extend `JpaRepository`, providing CRUD operations without additional implementation. :contentReference[oaicite:3]{index=3}

---

## Service Layer

Services used:

- EmployeeService
- DepartmentService
- SkillService

Each service provides methods to:

- Retrieve entities
- Save entities

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

## Test Method

Run:

```java
testGetDepartment();
```

Expected logs:

- Department Details
- Employee List

---

## Expected Output

```
Department:
Department{id=1, name='Information Technology'}

Employees:
[
 Employee{id=1, ...},
 Employee{id=2, ...},
 Employee{id=3, ...}
]
```

---

## Concepts Covered

- Spring Data JPA
- Hibernate ORM
- One-To-Many Mapping
- Many-To-One Mapping
- Bidirectional Relationships
- mappedBy
- FetchType.LAZY
- FetchType.EAGER
- LazyInitializationException
- Entity Relationships

---

## Learning Outcomes

After completing this hands-on, you will understand:

- Bidirectional entity relationships
- One-To-Many mapping using Hibernate
- The purpose of `mappedBy`
- Difference between LAZY and EAGER fetching
- Why LazyInitializationException occurs
- Fetching parent and child entities together

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer