# Week 4 - Sample Microservices Load Balancing Exercises

# Exercise 2 - Load Balancing using Spring Cloud Gateway

This project demonstrates how to implement **Client-Side Load Balancing** in a Spring Boot Microservices application using **Spring Cloud Gateway** and **Spring Cloud LoadBalancer**.

The API Gateway routes client requests to service instances using a logical service name (`lb://`) instead of a fixed URL, allowing Spring Cloud LoadBalancer to distribute requests across available instances.

---

# 📖 Exercise Overview

This exercise introduces the concept of **Client-Side Load Balancing** in a Microservices Architecture.

Instead of sending requests directly to a single server, the API Gateway forwards requests to a service name. Spring Cloud LoadBalancer selects an appropriate service instance to handle the request.

---

# 🎯 Objective

- Configure Spring Cloud Gateway.
- Configure Spring Cloud LoadBalancer.
- Route requests using `lb://`.
- Understand client-side load balancing.
- Learn service discovery concepts.

---

# 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Cloud Gateway
- Spring Cloud LoadBalancer
- Maven

---

# 📂 Project Structure

```text
Exercise-2-Load-Balancing
│
├── api-gateway-loadbalancer
│   │
│   ├── src
│   │   ├── main
│   │   │
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── api_gateway_loadbalancer
│   │   │               │
│   │   │               └── ApiGatewayLoadbalancerApplication.java
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

# ⚙️ Load Balancing Flow

1. Client sends a request to the API Gateway.
2. The Gateway identifies the logical service using the `lb://` URI.
3. Spring Cloud LoadBalancer selects one of the available service instances.
4. The request is forwarded to the selected instance.
5. The response is returned to the client.

---

# 🌐 Route Configuration

```properties
spring.cloud.gateway.routes[0].uri=lb://example-service
```

The `lb://` prefix instructs Spring Cloud Gateway to use Spring Cloud LoadBalancer to resolve the service name instead of calling a fixed URL.

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

Example URL:

```text
http://localhost:8080/loadbalanced/test
```

> **Note:** This exercise demonstrates the gateway and load-balancer configuration. To observe actual load balancing, multiple instances of the target service (or a service registry such as Eureka) are required.

---

# 📚 Concepts Covered

- Spring Cloud Gateway
- Spring Cloud LoadBalancer
- Client-Side Load Balancing
- Service Routing
- Logical Service Names (`lb://`)
- API Gateway

---

# 🎓 Learning Outcome

After completing this exercise, you will be able to:

- Configure Spring Cloud Gateway.
- Configure Spring Cloud LoadBalancer.
- Route requests using logical service names.
- Understand client-side load balancing.
- Prepare microservices for service discovery integration.

---

# 🚀 Next Exercise

**Exercise 3 – Resilience Patterns in an API Gateway**

Topics Covered:

- Circuit Breaker
- Resilience4J
- Fallback Mechanism
- Fault Tolerance
- API Gateway Resilience

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Sample Microservices Load Balancing Exercises**