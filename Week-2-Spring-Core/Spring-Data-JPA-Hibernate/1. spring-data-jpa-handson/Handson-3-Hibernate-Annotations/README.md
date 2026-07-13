# Handson 3 - Hibernate Annotations

## Objective

Demonstrate Hibernate ORM using Java Annotations instead of XML mapping files.

## Technologies Used

- Java 17
- Maven
- Hibernate ORM 6
- MySQL
- SLF4J

## Annotations Used

- @Entity
- @Table
- @Id
- @GeneratedValue
- @Column

## Project Structure

- Employee.java
- ManageEmployee.java
- hibernate.cfg.xml

## Build

```bash
mvn clean compile
```

## Run

```bash
mvn exec:java
```

## Expected Output

- Hibernate connects to MySQL.
- Creates/updates the EMPLOYEE table.
- Inserts a sample employee record.
- Prints the generated employee ID.

## Learning Outcome

Learned how Hibernate uses annotations for entity mapping, eliminating the need for `Employee.hbm.xml`.