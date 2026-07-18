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

---

# Hands-on 4

## Title

REST - Get All Countries

## Objective

- Create multiple Country beans in Spring XML.
- Create a list of Country objects.
- Expose a REST endpoint that returns all countries.
- Test the REST API using Browser and Postman.

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
http://localhost:8083/countries
```

## Expected Output

```json
[
  {
    "code": "IN",
    "name": "India"
  },
  {
    "code": "US",
    "name": "United States"
  },
  {
    "code": "JP",
    "name": "Japan"
  },
  {
    "code": "DE",
    "name": "Germany"
  }
]
```

## Status

✔ Completed

---

# Hands-on 5

## Title

REST - Get Country Based on Country Code

## Objective

- Create a Service layer.
- Use `@PathVariable` to read the country code from the URL.
- Return the matching country.
- Perform case-insensitive search.
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

## Test URLs

```
http://localhost:8083/countries/IN
http://localhost:8083/countries/DE
http://localhost:8083/countries/in
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

# Hands-on 6

## Title

REST - Get Country Exceptional Scenario

## Objective

- Create a custom exception.
- Return HTTP 404 when the country code is not found.
- Use `@ResponseStatus` for exception handling.
- Test the service using Browser, Postman and curl.

## Technologies

- Java 17
- Spring Boot
- Spring Web
- Spring Core
- REST API
- Exception Handling
- SLF4J
- Maven

## Run

```bash
mvn spring-boot:run
```

## Test URLs

```
http://localhost:8083/countries/IN
http://localhost:8083/countries/AZ
```

## Expected Output

### Valid Request

```json
{
  "code": "IN",
  "name": "India"
}
```

### Invalid Request

- HTTP Status: **404 Not Found**
- Message: **Country not found**

## Status

✔ Completed