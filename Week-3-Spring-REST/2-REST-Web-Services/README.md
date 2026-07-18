# Module 2 - REST Web Services

## Hands-on 1

### Title

Display Employee List using RESTful Web Service

## Objective

- Create a RESTful Web Service.
- Create Controller, Service and DAO layers.
- Return Employee data through a REST API.
- Test the API using Postman.

## Technologies

- Java 17
- Spring Boot
- Spring Web
- Maven
- REST API
- Postman

## Run

```bash
mvn spring-boot:run
```

## Expected Output

- Spring Boot application starts successfully.
- Embedded Tomcat runs on port 8080.

## Status

✔ Completed

---

# Hands-on 2

## Title

Hello World RESTful Web Service

## Objective

- Create a REST Controller.
- Implement a GET endpoint.
- Return "Hello World!!".
- Test the REST service using a browser and Postman.
- Include START and END logs.

## Technologies

- Java 17
- Spring Boot
- Spring Web
- REST API
- SLF4J
- Maven

## Run

```bash
mvn spring-boot:run
```

## Test URL

```
http://localhost:8083/hello
```

## Expected Output

```
Hello World!!
```

## Status

✔ Completed

---

# Hands-on 3

## Title

REST - Country Web Service

## Objective

- Create a Country bean.
- Load the Country bean from Spring XML.
- Expose a REST endpoint that returns the Country object as JSON.
- Test using Browser and Postman.

## Technologies

- Java 17
- Spring Boot
- Spring Web
- Spring Core (XML Configuration)
- REST API
- SLF4J
- Maven

## Run

```bash
mvn spring-boot:run
```

## Test URL

```
http://localhost:8083/country
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