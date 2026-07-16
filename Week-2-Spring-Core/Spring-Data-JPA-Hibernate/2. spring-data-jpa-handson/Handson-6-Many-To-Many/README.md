# Handson-6: Many-To-Many Mapping

## Objective

Implement a **Many-To-Many** relationship between **Employee** and **Skill** using Spring Data JPA and Hibernate.

This hands-on extends the previous relationship mappings by allowing:

- One Employee to have multiple Skills.
- One Skill to belong to multiple Employees.

The relationship is maintained using the **employee_skill** join table.

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

```text
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

# Many-To-Many Relationship

The owning side is defined in **Employee.java**.

```java
@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(
    name = "employee_skill",
    joinColumns = @JoinColumn(name = "es_em_id"),
    inverseJoinColumns = @JoinColumn(name = "es_sk_id")
)
private Set<Skill> skillList;
```

The inverse side is defined in **Skill.java**.

```java
@ManyToMany(mappedBy = "skillList")
private Set<Employee> employeeList;
```

The association is stored in the **employee_skill** join table, with the owning side declaring the `@JoinTable` and the inverse side using `mappedBy`. By default, `@ManyToMany` uses `FetchType.LAZY`; this hands-on uses `FetchType.EAGER` to load related skills together with the employee. :contentReference[oaicite:0]{index=0}

---

# Employee Entity

The Employee entity contains:

- Employee ID
- Name
- Salary
- Permanent Status
- Date of Birth
- Department
- Skill List

Each employee can possess multiple skills.

---

# Skill Entity

The Skill entity contains:

- Skill ID
- Skill Name
- Employee List

Each skill can be associated with multiple employees.

---

# Join Table

The relationship is maintained using:

```
employee_skill
```

Columns:

```
es_em_id
es_sk_id
```

Each record represents one Employee–Skill association.

---

# Fetch Strategy

Initially, `@ManyToMany` uses `FetchType.LAZY`, so attempting to access `skillList` outside an active Hibernate session may result in `LazyInitializationException`.

For this exercise, the mapping is updated to:

```java
@ManyToMany(fetch = FetchType.EAGER)
```

so the associated skills are loaded immediately with the employee. :contentReference[oaicite:1]{index=1}

---

# Repository Layer

Repositories used:

- EmployeeRepository
- DepartmentRepository
- SkillRepository

All repositories extend `JpaRepository`.

---

# Service Layer

Services used:

- EmployeeService
- DepartmentService
- SkillService

Operations include:

- Retrieve entity
- Save entity

---

# Build

```bash
mvn clean compile
```

---

# Run

```bash
mvn spring-boot:run
```

---

# Test Methods

Run:

```java
testGetEmployee();
```

Expected logs:

- Employee
- Department
- Skills

Run:

```java
testAddSkillToEmployee();
```

Expected result:

- A new Employee–Skill relationship is created (if it does not already exist).
- A new record is inserted into the `employee_skill` join table.

---

# Expected Output

```
Employee:
Employee{id=1,...}

Department:
Department{id=1,...}

Skills:
[
 Skill{id=1, name='Java'},
 Skill{id=2, name='Spring Boot'}
]
```

After adding a skill:

```
Employee updated successfully.
```

A corresponding row appears in the `employee_skill` table.

---

# Concepts Covered

- Spring Data JPA
- Hibernate ORM
- Many-To-Many Mapping
- Join Table
- Owning Side
- Inverse Side
- mappedBy
- FetchType.LAZY
- FetchType.EAGER
- LazyInitializationException
- Bidirectional Relationships

---

# Learning Outcomes

After completing this hands-on, you will understand:

- How to implement Many-To-Many relationships.
- How `@JoinTable` creates and manages join-table mappings.
- The role of `mappedBy` in bidirectional associations.
- Difference between owning and inverse sides.
- Lazy vs Eager fetching in Many-To-Many relationships.
- How to add an existing skill to an existing employee.

---

# Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer