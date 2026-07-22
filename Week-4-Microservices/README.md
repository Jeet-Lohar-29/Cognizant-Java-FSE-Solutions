# Week 4 - Microservices

This repository contains all the hands-on exercises completed during **Week 4** of the **Cognizant Digital Nurture 5.0** program. The week focuses on building **Microservices-based applications** using **Spring Boot**, **Spring Cloud**, **OAuth2**, **JWT Authentication**, **API Gateway**, **Load Balancing**, **Resilience Patterns**, and the **Composite Microservice Pattern**.

Throughout this week, multiple independent Spring Boot applications were developed to understand service decomposition, RESTful communication, API Gateway routing, authentication, resilience, and microservice orchestration. The exercises collectively demonstrate the transition from monolithic applications to scalable microservices architecture. :contentReference[oaicite:0]{index=0}

---

# 📖 Week Overview

Week 4 consists of five modules.

### Module 0 – Sample Microservices Exercises

- OAuth2 OIDC
- Authorization Server & Resource Server
- JWT Authentication

---

### Module 1 – Sample Microservices Load Balancing Exercises

- Edge Services Routing & Filtering
- Load Balancing
- Resilience Patterns
- Circuit Breaker

---

### Module 2 – Microservices using Spring Boot

- User & Order Management System
- Inventory Management System *(attempted; Eureka compatibility issue with Spring Boot 4)*
- API Gateway
- Circuit Breaker

---

### Module 3 – Microservices with API Gateway

- API Gateway with Eureka *(partially completed due to Spring Boot 4 compatibility)*
- Account & Loan Microservices
- API Gateway with Global Logging Filter

---

### Module 4 – Microservices Composite

- Composite Microservice
- Account Service
- Loan Service
- Composite Service using RestTemplate

---

# 🎯 Learning Objectives

During this week, the following concepts were implemented:

- Build RESTful Microservices
- OAuth2 Authentication
- JWT Authentication
- Authorization & Resource Servers
- API Gateway
- Global Filters
- Spring Cloud Gateway
- Load Balancing
- Resilience Patterns
- Circuit Breaker
- Service-to-Service Communication
- Composite Microservice Pattern
- REST Client using RestTemplate
- Request Routing
- API Aggregation

---

# 🛠 Technologies Used

- Java 17
- Spring Boot 4.0.7
- Spring Cloud
- Spring Cloud Gateway
- Spring Security
- OAuth2
- JWT
- Spring Web
- Spring WebFlux
- RestTemplate
- Maven

---

# 📂 Week Structure

```text
Week-4-Microservices
│
├── 0. Sample Microservices exercises
│   ├── Exercise-1-OAuth2-OIDC
│   ├── Exercise-2-Authorization-Server-Resource-Server
│   ├── Exercise-3-JWT-Authentication
│   └── README.md
│
├── 1. Sample Microservices Load balancing exercises
│   ├── Exercise-1-Edge-Services-Routing-Filtering
│   ├── Exercise-2-Load-Balancing
│   ├── Exercise-3-Resilience-Patterns
│   └── README.md
│
├── 2. Microservices using Spring Boot 3 exercises
│   ├── Exercise-1-User-Order-Management-System
│   ├── Exercise-2-Inventory-Management-System
│   ├── Exercise-3-API-Gateway
│   ├── Exercise-4-Circuit-Breaker
│   └── README.md
│
├── 3. Microservices with API Gateway
│   ├── Exercise-1-API-Gateway-With-Eureka
│   ├── Exercise-2-Account-Loan-Microservices
│   ├── Exercise-3-API-Gateway
│   └── README.md
│
├── 4. Microservices Composite
│   ├── Exercise-1-Composite-Microservice
│   └── README.md
│
└── README.md
```

---

# 📚 Modules Summary

## Module 0 – Sample Microservices

Topics Covered

- OAuth2 OIDC
- Authorization Server
- Resource Server
- JWT Authentication

---

## Module 1 – Load Balancing & Resilience

Topics Covered

- Edge Service Routing
- Spring Cloud Gateway
- Load Balancing
- Resilience4J
- Circuit Breaker

---

## Module 2 – Spring Boot Microservices

Topics Covered

- User Service
- Order Service
- OpenFeign
- API Gateway
- Circuit Breaker

**Note**

The Inventory Management (Eureka Discovery) exercise was partially skipped because the original Cognizant material targets an older Spring Boot/Spring Cloud combination, while this implementation uses Spring Boot **4.0.7**, which has compatibility limitations with the older Netflix Eureka examples. :contentReference[oaicite:1]{index=1}

---

## Module 3 – API Gateway

Topics Covered

- API Gateway
- Account Service
- Loan Service
- Global Logging Filter
- Request Routing

---

## Module 4 – Composite Microservice

Topics Covered

- Account Service
- Loan Service
- Composite Service
- RestTemplate
- Service Aggregation

---

# ▶️ Build

Each Spring Boot project can be built individually.

```bash
mvn clean install
```

---

# ▶️ Run

Each application can be started independently.

```bash
mvn spring-boot:run
```

---

# 📚 Key Concepts Learned

- Microservices Architecture
- Spring Boot REST APIs
- Spring Cloud Gateway
- OAuth2
- JWT Authentication
- API Gateway Pattern
- Route Predicates
- Global Filters
- Circuit Breaker Pattern
- Load Balancing
- OpenFeign
- RestTemplate
- Composite Microservice Pattern
- Service Orchestration
- API Aggregation

---

# 🎓 Learning Outcomes

After completing Week 4, you will be able to:

- Design RESTful microservices using Spring Boot.
- Implement OAuth2 and JWT-based authentication.
- Configure Spring Cloud Gateway.
- Route requests through an API Gateway.
- Apply Global Filters for centralized logging.
- Build resilient applications using Circuit Breaker patterns.
- Enable communication between microservices using OpenFeign and RestTemplate.
- Design Composite Microservices that aggregate multiple backend services.
- Understand core cloud-native microservices concepts and architecture. :contentReference[oaicite:2]{index=2}

---

# 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Microservices**