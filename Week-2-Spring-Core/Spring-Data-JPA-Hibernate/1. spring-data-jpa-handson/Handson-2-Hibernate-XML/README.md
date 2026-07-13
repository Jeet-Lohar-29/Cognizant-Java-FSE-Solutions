# Handson 2 - Hibernate XML Configuration

## Objective

This hands-on demonstrates Hibernate ORM using XML-based configuration and mapping files.

## Technologies Used

- Java 17
- Hibernate ORM
- Maven
- MySQL

## Files

- hibernate.cfg.xml
- Employee.java
- Employee.hbm.xml
- ManageEmployee.java

## Features

- XML Configuration
- XML Mapping
- CRUD Operations
- SessionFactory
- Session
- Transaction Management

## Build

```bash
mvn clean compile
```

## Run

```bash
mvn exec:java -Dexec.mainClass="com.cognizant.hibernatexml.ManageEmployee"
```

## Expected Output

- Insert Employee
- Display Employees
- Update Employee
- Delete Employee

## Status

Completed