# Week 4 - Microservices with API Gateway

# Exercise 3 - API Gateway

This project demonstrates the implementation of an **API Gateway** using **Spring Cloud Gateway**, where a gateway application acts as the single entry point for backend microservices. The gateway routes incoming requests to the **Greet Service** and applies a **Global Logging Filter** to log every incoming request.

The application illustrates centralized request routing and cross-cutting concerns such as request logging using Spring Cloud Gateway. Global filters are applied to all matched routes in the gateway.

---

# 📖 Exercise Overview

This exercise consists of two Spring Boot applications.

* **Greet Service** – Exposes a simple REST endpoint.
* **API Gateway** – Routes requests to the Greet Service and logs every incoming request.

---

# 🎯 Objective

* Build an API Gateway.
* Configure request routing.
* Implement a Global Logging Filter.
* Understand centralized request handling.
* Learn request forwarding using Spring Cloud Gateway.

---

# 🛠 Technologies Used

* Java 17
* Spring Boot 4.0.7
* Spring Cloud Gateway
* Spring Web
* Spring WebFlux
* Maven

---

# 📂 Project Structure

```text
Exercise-3-API-Gateway
│
├── greet-service
│   │
│   ├── src
│   ├── pom.xml
│   ├── mvnw
│   └── application.properties
│
├── api-gateway
│   │
│   ├── src
│   ├── pom.xml
│   ├── mvnw
│   └── application.properties
│
├── Screenshots
└── README.md
```

---

# 🔄 Application Flow

1. Client sends a request to the API Gateway.
2. API Gateway matches the configured route.
3. Global Logging Filter logs the incoming request.
4. Gateway forwards the request to the Greet Service.
5. Greet Service processes the request.
6. Response is returned through the API Gateway.

---

# 🌐 REST APIs

## Greet Service

### Get Greeting

```http
GET /greet
```

Direct Access

```text
http://localhost:8080/greet
```

Response

```text
Hello World!!
```

---

## API Gateway

### Gateway Route

```http
GET /greet
```

Gateway Access

```text
http://localhost:9090/greet
```

Response

```text
Hello World!!
```

---

# ▶️ Build

## Greet Service

```bash
mvn clean install
```

## API Gateway

```bash
mvn clean install
```

---

# ▶️ Run

## Greet Service

```bash
mvn spring-boot:run
```

## API Gateway

```bash
mvn spring-boot:run
```

---

# 🧪 Testing

### Direct Service

```text
http://localhost:8080/greet
```

Expected Response

```text
Hello World!!
```

---

### Through API Gateway

```text
http://localhost:9090/greet
```

Expected Response

```text
Hello World!!
```

---

### Gateway Console

Example Log

```text
Incoming Request : GET http://localhost:9090/greet
```

---

# 📚 Concepts Covered

* API Gateway Pattern
* Spring Cloud Gateway
* Route Predicates
* Global Filters
* Request Routing
* Request Logging
* Spring WebFlux

---

# 🎓 Learning Outcomes

After completing this exercise, you will be able to:

* Configure Spring Cloud Gateway.
* Route requests to backend services.
* Implement a Global Logging Filter.
* Monitor incoming requests.
* Understand centralized routing in a microservices architecture.

---

# 🚀 Next Module

**Module 4 – OAuth2 and JWT Security**

Topics Covered:

* OAuth2 Authentication
* JWT Token
* Spring Security
* Authorization
* Resource Server

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Microservices with API Gateway**
