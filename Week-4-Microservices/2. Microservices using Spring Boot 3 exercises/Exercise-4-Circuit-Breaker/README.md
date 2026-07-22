# Week 4 - Microservices using Spring Boot 3

# Exercise 4 - Resilient Microservices with Circuit Breaker

This project demonstrates the implementation of a **Circuit Breaker** using **Spring Cloud Circuit Breaker** and **Resilience4j**. The application simulates a Payment Service that communicates with a slow or unavailable third-party payment gateway and automatically falls back to a predefined response when failures occur.

The application improves service reliability by preventing repeated calls to a failing external service and providing a graceful fallback response.

---

# 📖 Exercise Overview

This exercise introduces the Circuit Breaker pattern for building fault-tolerant microservices.

The project consists of a single Spring Boot application.

* **Payment Service** – Simulates payment processing.
* **Circuit Breaker** – Detects failures and opens the circuit.
* **Fallback Method** – Returns an alternative response when the payment gateway is unavailable.

---

# 🎯 Objective

* Understand the Circuit Breaker pattern.
* Implement fault tolerance using Resilience4j.
* Configure Spring Cloud Circuit Breaker.
* Implement fallback methods.
* Monitor fallback execution.

---

# 🛠 Technologies Used

* Java 17
* Spring Boot 4.0.7
* Spring Cloud Circuit Breaker
* Resilience4j
* Spring Web
* Spring Boot Actuator
* Maven

---

# 📂 Project Structure

```text
Exercise-4-Circuit-Breaker
│
├── payment-service
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

1. Client sends a payment request.
2. Payment Controller calls the Payment Service.
3. Payment Service simulates a third-party payment gateway.
4. The simulated gateway throws an exception.
5. The Circuit Breaker intercepts the failure.
6. The fallback method is executed.
7. A friendly response is returned to the client.

---

# 🌐 REST APIs

## Payment Service

### Process Payment

```http
GET /payment
```

---

# ▶️ Build

```bash
mvn clean install
```

---

# ▶️ Run

```bash
mvn spring-boot:run
```

---

# 🧪 Testing

Open the following URL:

```text
http://localhost:8080/payment
```

Expected Response

```text
Payment Service is temporarily unavailable.
Please try again later.
```

Console Output

```text
Fallback Executed : Third Party Payment Gateway is Down
```

---

# 📚 Concepts Covered

* Microservices Architecture
* Circuit Breaker Pattern
* Spring Cloud Circuit Breaker
* Resilience4j
* Fallback Methods
* Fault Tolerance
* Exception Handling
* Spring Boot Actuator

---

# 🎓 Learning Outcomes

After completing this exercise, you will be able to:

* Implement the Circuit Breaker pattern.
* Configure Resilience4j in Spring Boot.
* Protect applications from cascading failures.
* Create fallback methods for failed requests.
* Improve the resilience of microservices.

---

# 🚀 Next Module

**Module 3 – Microservices with API Gateway**

Topics Covered:

* Eureka Discovery Server
* API Gateway
* Global Logging Filter
* Request Routing
* Service Discovery

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Microservices using Spring Boot 3**
