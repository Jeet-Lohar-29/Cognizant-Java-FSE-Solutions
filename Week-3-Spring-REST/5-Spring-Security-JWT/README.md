# Module 5-Spring-Security-JWT

---

# Hands-on 1

## Title

Secure RESTful Web Services using Spring Security

## Objective

- Add Spring Security dependency.
- Secure all REST APIs.
- Configure HTTP Basic Authentication.
- Verify unauthorized and authorized access.

## Technologies

- Java 17
- Spring Boot 3
- Spring Security
- Maven

## Run

```bash
mvn spring-boot:run
```

## Test URL

```
http://localhost:8083/countries
```

## Expected Output

- Without credentials → 401 Unauthorized
- With generated credentials → Countries API accessible

## Status

✔ Completed