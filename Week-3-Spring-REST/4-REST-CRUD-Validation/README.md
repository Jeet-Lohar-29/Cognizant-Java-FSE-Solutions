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