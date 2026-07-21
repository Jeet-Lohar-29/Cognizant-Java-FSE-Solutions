# Week 4 - Sample Microservices Load Balancing Exercises

# Exercise 3 - Implementing Resilience Patterns in an API Gateway

This project demonstrates how to implement **Resilience Patterns** in a Spring Boot API Gateway using **Spring Cloud Gateway** and **Resilience4J Circuit Breaker**.

The API Gateway is configured to detect failures in downstream services and redirect requests to a fallback endpoint, improving the fault tolerance and availability of the microservices system.

---

# 📖 Exercise Overview

This exercise introduces the **Circuit Breaker Pattern**, one of the most important resilience patterns in Microservices Architecture.

Instead of repeatedly sending requests to an unavailable service, the circuit breaker detects failures and redirects requests to a fallback service until the downstream service becomes healthy again.

---

# 🎯 Objective

- Configure Spring Cloud Gateway.
- Configure Resilience4J Circuit Breaker.
- Configure Fallback Endpoint.
- Understand Fault Tolerance.
- Improve API Gateway Resilience.

---

# 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Cloud Gateway
- Resilience4J
- Spring Cloud Circuit Breaker
- Maven

---

# 📂 Project Structure

```text
Exercise-3-Resilience-Patterns
│
├── api-gateway-resilience
│   │
│   ├── src
│   │   ├── main
│   │   │
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── api_gateway_resilience
│   │   │               │
│   │   │               ├── ApiGatewayResilienceApplication.java
│   │   │               │
│   │   │               └── controller
│   │   │                      └── FallbackController.java
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

# 🔄 Circuit Breaker Flow

1. Client sends a request to the API Gateway.
2. Gateway forwards the request to the downstream service.
3. If the service responds successfully, the response is returned to the client.
4. If repeated failures occur, the Circuit Breaker opens.
5. Requests are redirected to the fallback endpoint until the downstream service recovers.

---

# 🌐 REST Endpoints

### Gateway Route

```http
GET /service/**
```

### Fallback Endpoint

```http
GET /fallback
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

Example Gateway URL:

```text
http://localhost:8080/service/test
```

Example Fallback URL:

```text
http://localhost:8080/fallback
```

If the downstream service is unavailable, the Circuit Breaker routes requests to the fallback endpoint.

---

# 📚 Concepts Covered

- API Gateway
- Circuit Breaker Pattern
- Resilience4J
- Spring Cloud Gateway
- Fault Tolerance
- Fallback Mechanism
- Microservices Resilience

---

# 🎓 Learning Outcome

After completing this exercise, you will be able to:

- Configure Circuit Breaker in Spring Cloud Gateway.
- Implement fallback mechanisms.
- Improve microservice fault tolerance.
- Understand resilience patterns in distributed systems.
- Build more reliable microservices.

---

# ✅ Module Completion

Module-1 – Sample Microservices Load Balancing Exercises Completed

Exercises Completed:

- Exercise 1 – Edge Services for Routing and Filtering
- Exercise 2 – Load Balancing in API Gateway
- Exercise 3 – Resilience Patterns in API Gateway

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Sample Microservices Load Balancing Exercises**