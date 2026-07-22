# Week 4 - Microservices with API Gateway

This module demonstrates the fundamentals of **Microservices Architecture** using **Spring Boot** and **Spring Cloud Gateway**. Throughout the exercises, multiple independent microservices are created and exposed through REST APIs, followed by implementing an API Gateway for centralized request routing and logging.

The module introduces service decomposition, REST communication, API Gateway routing, and request filtering, which are core concepts in modern cloud-native application development. Spring Cloud Gateway acts as the entry point for routing requests and applying cross-cutting concerns such as logging. :contentReference[oaicite:0]{index=0}

---

# 📖 Module Overview

This module consists of three exercises.

### Exercise 1 – API Gateway with Eureka

- Greet Service
- Eureka Discovery Server
- API Gateway
- Service Registration

> **Note:** Due to compatibility issues between **Spring Boot 4.0.7** and the current Spring Cloud Eureka release, this exercise was partially completed and skipped after verifying the framework limitation.

---

### Exercise 2 – Account & Loan Microservices

- Account Service
- Loan Service
- REST APIs
- JSON Responses

---

### Exercise 3 – API Gateway

- Greet Service
- API Gateway
- Request Routing
- Global Logging Filter

---

# 🎯 Module Objectives

- Understand Microservices Architecture.
- Build independent Spring Boot microservices.
- Implement REST APIs.
- Configure API Gateway routing.
- Apply Global Filters for centralized logging.
- Understand service communication concepts.

---

# 🛠 Technologies Used

- Java 17
- Spring Boot 4.0.7
- Spring Cloud Gateway
- Spring Web
- Spring WebFlux
- Maven

---

# 📂 Module Structure

```text
3. Microservices with API Gateway
│
├── Exercise-1-API-Gateway-With-Eureka
│   │
│   ├── greet-service
│   ├── eureka-server
│   ├── README.md
│
├── Exercise-2-Account-Loan-Microservices
│   │
│   ├── account
│   ├── loan
│   ├── README.md
│
├── Exercise-3-API-Gateway
│   │
│   ├── greet-service
│   ├── api-gateway
│   ├── README.md
│
├── Screenshots
│
└── README.md
```

---

# 📚 Exercises Summary

## Exercise 1

### API Gateway with Eureka

**Concepts Covered**

- Eureka Discovery Server
- Service Registration
- API Gateway
- Service Discovery

**Status**

- Partially completed.
- Skipped due to Spring Boot 4 and Spring Cloud Eureka compatibility issues.

---

## Exercise 2

### Account & Loan Microservices

Implemented:

- Account REST API
- Loan REST API
- JSON Responses
- Independent Spring Boot applications

Endpoints

```text
GET /accounts/{number}

GET /loans/{number}
```

---

## Exercise 3

### API Gateway

Implemented:

- Greet Service
- API Gateway
- Route Configuration
- Global Logging Filter
- Request Forwarding

Endpoint

```text
GET /greet
```

Gateway URL

```text
http://localhost:9090/greet
```

---

# ▶️ Build

Build every project individually.

```bash
mvn clean install
```

---

# ▶️ Run

Run each Spring Boot application separately.

```bash
mvn spring-boot:run
```

---

# 🧪 Testing

## Exercise 2

Account Service

```text
http://localhost:8080/accounts/00987987973432
```

Loan Service

```text
http://localhost:8081/loans/H00987987972342
```

---

## Exercise 3

Direct Service

```text
http://localhost:8080/greet
```

Gateway

```text
http://localhost:9090/greet
```

---

# 📚 Concepts Covered

- Microservices Architecture
- REST APIs
- Spring Boot
- Spring Cloud Gateway
- API Gateway Pattern
- Request Routing
- Route Predicates
- Global Filters
- Request Logging
- Spring WebFlux

---

# 🎓 Learning Outcomes

After completing this module, you will be able to:

- Build multiple independent Spring Boot applications.
- Design REST APIs.
- Understand microservices architecture.
- Configure Spring Cloud Gateway.
- Route requests through an API Gateway.
- Implement Global Filters.
- Understand centralized request processing.

---

# 🚀 Next Module

**Module 4 – OAuth2 & JWT Security**

Topics Covered:

- OAuth2 Authentication
- JWT Authentication
- Spring Security
- Authorization Server
- Resource Server

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Microservices with API Gateway**