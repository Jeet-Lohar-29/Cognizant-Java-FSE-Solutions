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

---

# Hands-on 2

## Title

Create In-Memory Users and Roles

## Objective

- Create two in-memory users:
  - admin (ROLE_ADMIN)
  - user (ROLE_USER)
- Restrict `/countries` endpoint to ROLE_USER.
- Authenticate using HTTP Basic Authentication.

## Technologies

- Java 17
- Spring Boot 3
- Spring Security 6
- Maven

## Run

```bash
mvn spring-boot:run
```

## Test URLs

```
GET /countries
```

### Credentials

```
Username: user
Password: pwd
```

```
Username: admin
Password: pwd
```

## Expected Results

- user → 200 OK
- admin → 403 Forbidden
- wrong password → 401 Unauthorized

## Status

✔ Completed