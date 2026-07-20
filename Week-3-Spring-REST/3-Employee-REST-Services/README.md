# Module 3 - Employee & Department REST Services

---

# Hands-on 1

## Title

Create Static Employee List using Spring XML Configuration

## Objective

- Create Employee, Department and Skill model classes.
- Create static employee data using Spring XML.
- Create EmployeeDao.
- Load employee list from XML configuration.

## Technologies

- Java 17
- Spring Boot
- Spring Core (XML Configuration)
- Spring Web
- Maven

## Run

```bash
mvn spring-boot:run
```

## Expected Output

- Employee data loaded from Spring XML.
- Employee list available through EmployeeDao.

## Status

✔ Completed (Code Implementation)

---

# Hands-on 2

## Title

Display Employee List using RESTful Web Service

## Objective

- Create Employee REST Controller.
- Create GET endpoint to return all employees.
- Use Service layer to retrieve employee data.
- Test using Browser and Postman.

## Technologies

- Java 17
- Spring Boot
- Spring Web
- REST API
- Maven

## Run

```bash
mvn spring-boot:run
```

## Test URL

```
http://localhost:8083/employees
```

## Expected Output

- JSON array containing all employee records.

## Status

✔ Completed (Code Implementation)

---

# Hands-on 3

## Title

Display Department List using RESTful Web Service

## Objective

- Create Department DAO.
- Create Department Service.
- Create Department REST Controller.
- Expose GET endpoint to return all departments.
- Test using Browser and Postman.

## Technologies

- Java 17
- Spring Boot
- Spring Web
- REST API
- Maven

## Run

```bash
mvn spring-boot:run
```

## Test URL

```
http://localhost:8083/departments
```

## Expected Output

- JSON array containing all department records.

## Status

✔ Completed (Code Implementation)

---

# Known Limitation

The official Cognizant Week 3 Spring REST handout instructs learners to reuse the employee sample data from the Angular module to create `employee.xml`. However, the required Angular sample data and the `employee.xml` configuration file were not included in the provided training material.

As a result:

- The model, DAO, Service and Controller layers have been implemented according to the exercise.
- The REST endpoints have been developed as specified.
- The application cannot be executed completely until a valid `employee.xml` file containing the employee sample data is available.

Once the missing XML configuration is provided, the project will run without requiring any changes to the Java source code.