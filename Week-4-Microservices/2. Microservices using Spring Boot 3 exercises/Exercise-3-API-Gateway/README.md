# Week 4 – Microservices using Spring Boot 3

# Exercise 3 – API Gateway

This project demonstrates the implementation of an **API Gateway** using **Spring Cloud Gateway**. The gateway acts as a single entry point for client requests and routes them to different backend microservices based on URL patterns.

---

# 📖 Exercise Overview

The exercise demonstrates how an API Gateway can manage routing between multiple microservices.

The following services were created:

* Customer Service
* Billing Service
* API Gateway

The API Gateway forwards client requests to the appropriate service using route predicates and filters.

---

# 🎯 Objective

* Understand API Gateway Architecture.
* Configure Spring Cloud Gateway.
* Route requests to multiple microservices.
* Implement path-based routing.
* Apply path rewriting using gateway filters.

---

# 🛠 Technologies Used

* Java 17
* Spring Boot 4.0.7
* Spring Cloud Gateway
* Spring WebFlux
* Maven

---

# 📂 Project Structure

```text
Exercise-3-API-Gateway
│
├── api-gateway
│
├── customer-service
│
├── billing-service
│
├── Screenshots
│
└── README.md
```

---

# 🔄 Architecture

```text
               Client
                  │
                  ▼
          API Gateway (8080)
            /            \
           /              \
          ▼                ▼
Customer Service      Billing Service
    (8081)                (8082)
```

---

# ⚙ Services

## Customer Service

Provides customer-related endpoints.

### Endpoint

```http
GET /customers
```

Runs on:

```text
http://localhost:8081
```

---

## Billing Service

Provides billing-related endpoints.

### Endpoint

```http
GET /billing
```

Runs on:

```text
http://localhost:8082
```

---

## API Gateway

Runs on:

```text
http://localhost:8080
```

Routes incoming requests to the appropriate backend service using Spring Cloud Gateway route configuration.

---

# 🌐 Gateway Endpoints

## Customer Service

```http
GET http://localhost:8080/customer/customers
```

Expected Response

```text
Customer Service is Running Successfully!
```

---

## Billing Service

```http
GET http://localhost:8080/billing/billing
```

Expected Response

```text
Billing Service is Running Successfully!
```

---

# ▶️ Build

For each project:

```bash
mvn clean install
```

---

# ▶️ Run Order

1. Customer Service

```bash
mvn spring-boot:run
```

2. Billing Service

```bash
mvn spring-boot:run
```

3. API Gateway

```bash
mvn spring-boot:run
```

---

# 🧪 Testing

Verify backend services:

```text
http://localhost:8081/customers

http://localhost:8082/billing
```

Verify Gateway:

```text
http://localhost:8080/customer/customers

http://localhost:8080/billing/billing
```

---

# 📚 Concepts Covered

* API Gateway
* Spring Cloud Gateway
* Route Predicates
* Gateway Filters
* StripPrefix Filter
* Path-Based Routing
* Microservices Communication
* Spring WebFlux

---

# 🎓 Learning Outcomes

After completing this exercise, you will be able to:

* Build an API Gateway using Spring Cloud Gateway.
* Route requests to multiple backend services.
* Configure route predicates and filters.
* Use StripPrefix and path-based routing.
* Understand centralized request handling in a microservices architecture.

---

# 🚀 Next Exercise

**Exercise 4 – Circuit Breaker**

Topics Covered:

* Spring Cloud Circuit Breaker
* Resilience4j
* Fallback Methods
* Fault Tolerance
* Microservice Resilience

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Microservices using Spring Boot 3**
