# Module 4

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