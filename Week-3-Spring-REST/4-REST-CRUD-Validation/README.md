# Module 4-REST-CRUD-Validation

---

# Hands-on 1

## Title

REST Resource Naming & POST Country REST Service

## Objective

- Follow REST resource naming guidelines.
- Implement GET and POST REST services.
- Read JSON request using `@RequestBody`.
- Test using Browser, Postman and curl.

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

## Test URLs

```
GET  http://localhost:8083/countries
GET  http://localhost:8083/countries/IN
POST http://localhost:8083/countries
```

## Sample Request

```json
{
  "code": "IN",
  "name": "India"
}
```

## Expected Output

```json
{
  "code": "IN",
  "name": "India"
}
```

## Status

✔ Completed

---

# Hands-on 2

## Title

Validate Country Code in REST POST Request

## Objective

- Validate Country Code.
- Use Bean Validation annotations.
- Return HTTP 400 for invalid input.

## Technologies

- Java 17
- Spring Boot
- Spring Validation
- REST API
- Maven

## Run

```bash
mvn spring-boot:run
```

## Test URL

```
POST /countries
```

## Valid Request

```json
{
  "code":"IN",
  "name":"India"
}
```

## Invalid Request

```json
{
  "code":"I",
  "name":"India"
}
```

## Expected Result

- Valid request → Country returned.
- Invalid request → HTTP 400 Bad Request.

## Status

✔ Completed

---

# Hands-on 3

## Title

Global Exception Handling for Validation Errors

## Objective

- Create a global exception handler using `@ControllerAdvice`.
- Extend `ResponseEntityExceptionHandler`.
- Replace manual validation with `@Valid`.
- Return structured validation error responses.

## Technologies

- Java 17
- Spring Boot
- Spring Validation
- REST API
- Maven

## Run

```bash
mvn spring-boot:run
```

## Test URL

```
POST /countries
```

## Invalid Request

```json
{
  "code": "I",
  "name": "India"
}
```

## Expected Response

```json
{
  "timestamp": "...",
  "status": 400,
  "errors": [
    "Country code should be 2 characters"
  ]
}
```

## Status

✔ Completed

---

# Hands-on 4 (Part A)

## Title

Create Employee Model Classes

## Objective

- Create Employee model.
- Create Department model.
- Create Skill model.
- Add Bean Validation annotations.
- Create EmployeeNotFoundException.

## Technologies

- Java 17
- Spring Boot
- Jakarta Validation
- Maven

## Status

✔ Completed

---

# Hands-on 4 (Part B)

## Title

Update Employee using REST PUT

## Objective

- Create Employee DAO.
- Create Employee Service.
- Create Employee Controller.
- Implement PUT `/employees`.
- Update employee using in-memory data.

## Technologies

- Java 17
- Spring Boot
- Spring Web
- Jakarta Validation
- Maven

## Run

```bash
mvn spring-boot:run
```

## Test URL

```
GET /employees

PUT /employees
```

## Status

✔ Completed

---

# Hands-on 5

## Title

Implement REST DELETE Service

## Objective

- Implement DELETE REST endpoint for Employee.
- Delete employee by ID.
- Throw EmployeeNotFoundException if employee does not exist.
- Verify deletion using GET request.

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
DELETE http://localhost:8083/employees/{id}
```

Example

```
DELETE http://localhost:8083/employees/1
```

## Expected Output

```
Employee deleted successfully
```

If employee ID is invalid:

```
404 NOT FOUND
```

## Status

✔ Completed