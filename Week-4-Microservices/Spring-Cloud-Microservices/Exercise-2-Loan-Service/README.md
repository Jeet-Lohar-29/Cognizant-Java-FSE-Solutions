# Week 4 - Spring Cloud Microservices

# Exercise 2 - Loan Microservice

A simple Spring Boot 3 RESTful Microservice developed as part of the **Cognizant Digital Nurture 5.0 - Java Full Stack Engineer (FSE)** Week-4 hands-on exercises.

---

## 📖 Exercise Overview

This exercise demonstrates how to create a standalone **Loan Microservice** using Spring Boot. The service exposes a REST API that returns dummy loan details based on the loan number provided in the URL.

Unlike the previous exercise, this microservice runs on **Port 8081**, allowing multiple microservices to execute independently at the same time. This illustrates one of the core principles of Microservices Architecture—each service is independently deployable and accessible through its own endpoint. :contentReference[oaicite:0]{index=0}

---

## 🎯 Objective

- Develop a standalone Loan Microservice.
- Expose REST APIs using Spring Boot.
- Return dummy loan details as JSON.
- Configure a custom server port.
- Understand how multiple microservices can run simultaneously.

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
Exercise-2-Loan-Service
│
└── loan-service
    │
    ├── src
    │   ├── main
    │   │
    │   ├── java
    │   │   └── com
    │   │       └── cognizant
    │   │           └── loanservice
    │   │               │
    │   │               ├── LoanServiceApplication.java
    │   │               │
    │   │               ├── controller
    │   │               │      └── LoanController.java
    │   │               │
    │   │               └── model
    │   │                      └── Loan.java
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

### Get Loan Details

**Method**

```http
GET
```

**Endpoint**

```http
/loans/{number}
```

### Example URL

```text
http://localhost:8081/loans/H00987987972342
```

---

## 📤 Sample Response

```json
{
    "number": "H00987987972342",
    "type": "Car",
    "loan": 400000.0,
    "emi": 3258,
    "tenure": 18
}
```

---

## ▶️ Running the Application

### Build the Project

```bash
mvn clean install
```

### Run the Application

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
http://localhost:8081/loans/H00987987972342
```

The application should return the sample JSON response.

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
- JSON Serialization
- Running Multiple Microservices

---

## 🎓 Learning Outcome

After completing this exercise, you will be able to:

- Create another independent Spring Boot Microservice.
- Configure applications to run on different ports.
- Develop REST APIs returning JSON objects.
- Understand the concept of independently deployable services.
- Prepare multiple services for Eureka Service Discovery in the upcoming exercises.

---

## 🚀 Next Exercise

**Exercise 3 – Eureka Discovery Server**

Topics Covered:

- Service Discovery
- Eureka Server
- Service Registration
- Registering Account Service
- Registering Loan Service

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

Week-4 – Spring Cloud Microservices