# Week 4 - Spring Cloud Microservices

# Exercise 1 - Account Microservice

A simple Spring Boot 3 RESTful Microservice developed as part of the **Cognizant Digital Nurture 5.0 - Java Full Stack Engineer (FSE)** Week-4 hands-on exercises.

---

## 📖 Exercise Overview

This exercise demonstrates how to create a standalone **Account Microservice** using Spring Boot. The service exposes a REST API that returns dummy account details based on the account number provided in the URL.

This is the first step towards building a complete Microservices Architecture using Spring Cloud. In the upcoming exercises, this service will be registered with Eureka Discovery Server and accessed through an API Gateway.

---

## 🎯 Objective

- Create a Spring Boot Microservice.
- Develop a REST API using Spring MVC.
- Return JSON data without using a database.
- Understand the basic structure of a Microservice.
- Prepare the service for Spring Cloud integration.

---

## 🛠 Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Boot DevTools
- Maven

---

## 📂 Project Structure

```text
Exercise-1-Account-Service
│
└── account-service
    │
    ├── src
    │   ├── main
    │   │
    │   ├── java
    │   │   └── com
    │   │       └── cognizant
    │   │           └── accountservice
    │   │               │
    │   │               ├── AccountServiceApplication.java
    │   │               │
    │   │               ├── controller
    │   │               │      └── AccountController.java
    │   │               │
    │   │               └── model
    │   │                      └── Account.java
    │   │
    │   └── resources
    │          └── application.properties
    │
    ├── pom.xml
    ├── mvnw
    ├── mvnw.cmd
    └── HELP.md
```

---

## ⚙️ REST API

### Get Account Details

**Method**

```http
GET
```

**Endpoint**

```http
/accounts/{number}
```

### Example URL

```text
http://localhost:8080/accounts/00987987973432
```

---

## 📤 Sample Response

```json
{
    "number": "00987987973432",
    "type": "Savings",
    "balance": 234343.0
}
```

---

## ▶️ Running the Application

### Build the Project

```bash
mvn clean install
```

### Run the Project

```bash
mvn spring-boot:run
```

or

```bash
./mvnw spring-boot:run
```

---

## 🧪 Testing

Open your browser or Postman and visit:

```text
http://localhost:8080/accounts/00987987973432
```

The service should return the sample JSON response.

---

## 📚 Concepts Covered

- Spring Boot
- Microservices
- REST API
- Spring MVC
- Maven
- @SpringBootApplication
- @RestController
- @GetMapping
- @PathVariable
- JSON Response

---

## 🎓 Learning Outcome

After completing this exercise, you will be able to:

- Create a Spring Boot project using Spring Initializr.
- Build a simple Microservice.
- Develop REST endpoints.
- Return Java objects as JSON.
- Run and test a Spring Boot application.
- Understand the foundation of a Microservices architecture.

---

## 🚀 Next Exercise

Exercise 2 - Loan Microservice

Topics Covered:

- Running multiple Microservices
- Custom Server Port (8081)
- Independent REST APIs
- Preparing for Eureka Service Discovery

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

Week-4 – Spring Cloud Microservices