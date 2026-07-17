# Handson-5: Native Query

## Objective

Implement a **Native SQL Query** using Spring Data JPA to calculate the average salary of employees belonging to a specific department.

This hands-on demonstrates how to execute database-specific SQL statements by using the `@Query` annotation with `nativeQuery = true`.

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
│   │   ├── java
│   │   │   └── com.cognizant.ormlearn
│   │   │       ├── model
│   │   │       │     Employee.java
│   │   │       │     Department.java
│   │   │       │     Skill.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │     EmployeeRepository.java
│   │   │       │
│   │   │       ├── service
│   │   │       │     EmployeeService.java
│   │   │       │
│   │   │       └── OrmLearnApplication.java
│   │   │
│   │   └── resources
│   │         application.properties
│   │
├── pom.xml
└── README.md
```

---

## Native SQL Query

The repository uses a native SQL query to calculate the average salary for employees in a given department.

```java
@Query(
    value = "SELECT AVG(em_salary) FROM employee WHERE em_dp_id = :id",
    nativeQuery = true
)
double getAverageSalary(@Param("id") int id);
```

Setting `nativeQuery = true` instructs Spring Data JPA to execute the SQL statement directly against the database instead of interpreting it as JPQL/HQL. :contentReference[oaicite:0]{index=0}

---

## Service Layer

The service delegates the repository call.

```java
public double getAverageSalary(int id) {
    return employeeRepository.getAverageSalary(id);
}
```

---

## Application Runner

The application executes:

```java
testGetAverageSalary();
```

This method:

- Retrieves the average salary using a native SQL query.
- Displays the calculated value in the console.

---

## Difference Between HQL and Native SQL

| HQL | Native SQL |
|-----|------------|
| Uses entity names | Uses database table names |
| Uses entity fields | Uses actual column names |
| Database independent | Database specific |
| Hibernate translates to SQL | SQL executed directly |

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

Average Salary : 65000.0

End
```

> The actual value depends on the employee data present in your database.

---

## Concepts Covered

- Spring Data JPA
- Native SQL Queries
- @Query Annotation
- nativeQuery = true
- Aggregate Functions
- AVG()
- Named Parameters
- Repository Pattern

---

## Learning Outcomes

After completing this hands-on, you will understand:

- Writing native SQL queries in Spring Data JPA.
- Difference between JPQL/HQL and Native SQL.
- Executing database-specific SQL statements.
- Using `nativeQuery = true` with `@Query`.
- Retrieving aggregate values using SQL.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer