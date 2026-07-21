# Week 4 - Sample Microservices Load Balancing Exercises

# Exercise 1 - Implementing Edge Services for Routing and Filtering

This project demonstrates the implementation of an **API Gateway (Edge Service)** using **Spring Cloud Gateway**.

The API Gateway acts as the single entry point for client requests and routes them to downstream services while providing cross-cutting features such as request logging and filtering.

---

## 📖 Exercise Overview

This exercise introduces the concept of an **Edge Service** in a Microservices Architecture.

The API Gateway is responsible for:

- Routing client requests
- Applying global filters
- Logging incoming requests
- Acting as the entry point for backend microservices

---

## 🎯 Objective

- Configure Spring Cloud Gateway.
- Implement a Global Logging Filter.
- Configure route mapping.
- Understand API Gateway architecture.
- Route requests to downstream services.

---

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Cloud Gateway
- Maven

---

## 📂 Project Structure

```text
Exercise-1-Edge-Services-Routing-Filtering
│
├── api-gateway
│   │
│   ├── src
│   │   ├── main
│   │   │
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── api_gateway
│   │   │               │
│   │   │               ├── ApiGatewayApplication.java
│   │   │               │
│   │   │               └── filter
│   │   │                      └── LoggingFilter.java
│   │   │
│   │   └── resources
│   │          └── application.properties
│   │
│   ├── pom.xml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── HELP.md
│
├── Screenshots
└── README.md
```

---

## 🌐 Gateway Features

- API Routing
- Request Filtering
- Request Logging
- Centralized Entry Point

---

## ▶️ Build

```bash
mvn clean install
```

---

## ▶️ Run

```bash
mvn spring-boot:run
```

---

## 📚 Concepts Covered

- API Gateway
- Edge Services
- Spring Cloud Gateway
- Global Filters
- Route Configuration
- Request Routing

---

## 🎓 Learning Outcome

After completing this exercise, you will be able to:

- Configure Spring Cloud Gateway.
- Create a Global Filter.
- Route requests through an API Gateway.
- Understand Edge Services in Microservices Architecture.

---

## 🚀 Next Exercise

**Exercise 2 – Load Balancing using Spring Cloud Gateway**

Topics Covered:

- Load Balancing
- Service Discovery
- Gateway Routing
- Multiple Service Instances

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Sample Microservices Load Balancing Exercises**