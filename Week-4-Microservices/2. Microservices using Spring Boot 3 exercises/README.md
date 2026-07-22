# Week 4 - Microservices using Spring Boot 3

# Module 2 - Microservices using Spring Boot 3 Exercises

This module focuses on developing a **Microservices Architecture** using **Spring Boot**, **Spring Cloud**, and related technologies. The exercises demonstrate how independent services communicate with one another, how requests are routed through an API Gateway, and how resilience can be added using the Circuit Breaker pattern.

The module covers the fundamental building blocks of modern distributed systems, including service-to-service communication, API Gateway routing, fault tolerance, and Spring Cloud components. Spring Cloud provides infrastructure support for common distributed system patterns such as routing, resilience, and service communication.

---

# 📖 Module Overview

This module consists of four exercises:

### Exercise 1 – User and Order Management System

* User Service
* Order Service
* OpenFeign Client
* REST API Communication

---

### Exercise 2 – Inventory Management System *(Skipped)*

This exercise was skipped due to compatibility issues between the original training material and the latest Spring Boot 4 / Spring Cloud versions.

Components included:

* Config Server
* Eureka Server
* Product Service
* Inventory Service

---

### Exercise 3 – API Gateway

* Customer Service
* Billing Service
* Spring Cloud Gateway
* Route Predicates
* Gateway Filters
* Path-Based Routing

---

### Exercise 4 – Circuit Breaker

* Payment Service
* Spring Cloud Circuit Breaker
* Resilience4j
* Fallback Method
* Fault Tolerance

---

# 🎯 Learning Objectives

* Understand Microservices Architecture.
* Build independent Spring Boot services.
* Implement REST APIs.
* Configure inter-service communication.
* Use OpenFeign for service communication.
* Implement API Gateway routing.
* Configure Spring Cloud Gateway.
* Apply Circuit Breaker using Resilience4j.
* Improve application resilience and fault tolerance.

---

# 🛠 Technologies Used

* Java 17
* Spring Boot 4.0.7
* Spring Cloud
* Spring Cloud Gateway
* Spring Cloud OpenFeign
* Spring Cloud Circuit Breaker
* Resilience4j
* Spring Web
* Spring WebFlux
* Spring Data JPA
* MySQL
* Maven

---

# 📂 Module Structure

```text
2. Microservices using Spring Boot 3 exercises
│
├── Exercise-1-User-Order-Management-System
│   ├── user-service
│   ├── order-service
│   └── README.md
│
├── Exercise-2-Inventory-Management-System
│   ├── config-server
│   ├── eureka-server
│   ├── inventory-service
│   ├── product-service
│   └── (Skipped)
│
├── Exercise-3-API-Gateway
│   ├── api-gateway
│   ├── customer-service
│   ├── billing-service
│   └── README.md
│
├── Exercise-4-Circuit-Breaker
│   ├── payment-service
│   └── README.md
│
└── README.md
```

---

# 🔄 Module Flow

```text
                 Client
                    │
                    ▼
             API Gateway
                    │
      ┌─────────────┴─────────────┐
      ▼                           ▼
Customer Service            Billing Service

                    │
                    ▼
             User Service
                    │
                    ▼
             Order Service
                    │
                    ▼
          OpenFeign Communication

                    │
                    ▼
            Payment Service
                    │
                    ▼
          Circuit Breaker (Resilience4j)
                    │
                    ▼
            Fallback Response
```

---

# 📚 Exercises Summary

## ✅ Exercise 1

**User and Order Management System**

Concepts Covered:

* REST APIs
* Spring Data JPA
* MySQL
* OpenFeign
* Inter-Service Communication

---

## ⏭ Exercise 2 *(Skipped)*

**Inventory Management System**

Originally intended to demonstrate:

* Config Server
* Eureka Server
* Service Discovery
* Inventory Microservice

> **Note:** This exercise was skipped because the original handout targets an older Spring Boot/Spring Cloud version, while the implementation in this repository uses Spring Boot 4.0.7, resulting in framework compatibility issues.

---

## ✅ Exercise 3

**API Gateway**

Concepts Covered:

* Spring Cloud Gateway
* Route Predicates
* Gateway Filters
* StripPrefix
* Path-Based Routing

---

## ✅ Exercise 4

**Circuit Breaker**

Concepts Covered:

* Resilience4j
* Circuit Breaker Pattern
* Fallback Methods
* Fault Tolerance
* Exception Handling

---

# 🎓 Learning Outcomes

After completing this module, you will be able to:

* Build multiple Spring Boot microservices.
* Implement RESTful APIs.
* Configure service-to-service communication using OpenFeign.
* Build and configure an API Gateway.
* Route requests between multiple microservices.
* Implement Circuit Breaker using Resilience4j.
* Build resilient and fault-tolerant microservices.
* Understand core Spring Cloud patterns used in distributed systems.

---

# 📁 Repository

```text
Cognizant-Java-FSE-Solutions/
└── Week-4-Microservices/
    └── 2. Microservices using Spring Boot 3 exercises/
```

---

# 🚀 Next Module

**Module 3 – Microservices with API Gateway**

Topics Covered:

* Eureka Discovery Server
* API Gateway
* Global Logging Filter
* Service Discovery
* Request Routing

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Microservices**
