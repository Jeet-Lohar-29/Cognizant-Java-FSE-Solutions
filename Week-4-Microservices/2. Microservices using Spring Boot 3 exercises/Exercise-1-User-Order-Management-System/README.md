# Week 4 - Microservices using Spring Boot 3

# Exercise 1 - User and Order Management System

This project demonstrates a basic **Microservices Architecture** using **Spring Boot 3**, where two independent microservices (**User Service** and **Order Service**) communicate with each other using **Spring Cloud OpenFeign**.

The application follows the microservices approach by separating user management and order management into individual services while enabling inter-service communication through REST APIs.

---

# 📖 Exercise Overview

This exercise introduces the fundamentals of Microservices Architecture by building two independent Spring Boot applications.

- **User Service** – Manages user information.
- **Order Service** – Manages customer orders.
- **OpenFeign Client** – Enables communication between the Order Service and the User Service.

---

# 🎯 Objective

- Build independent Spring Boot microservices.
- Implement REST APIs.
- Connect multiple microservices using OpenFeign.
- Configure MySQL with Spring Data JPA.
- Understand service-to-service communication.

---

# 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Web
- Spring Cloud OpenFeign
- MySQL
- Maven

---

# 📂 Project Structure

```text
Exercise-1-User-Order-Management-System
│
├── user-service
│   │
│   ├── src
│   ├── pom.xml
│   ├── mvnw
│   └── application.properties
│
├── order-service
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

1. User requests are handled by the **User Service**.
2. Order requests are handled by the **Order Service**.
3. The Order Service communicates with the User Service through **OpenFeign**.
4. User details are fetched automatically before processing the request.

---

# 🌐 REST APIs

## User Service

### Create User

```http
POST /users
```

### Get All Users

```http
GET /users
```

### Get User by ID

```http
GET /users/{id}
```

---

## Order Service

### Create Order

```http
POST /orders
```

### Get All Orders

```http
GET /orders
```

### Fetch User using OpenFeign

```http
GET /orders/user/{id}
```

---

# ▶️ Build

### User Service

```bash
mvn clean install
```

### Order Service

```bash
mvn clean install
```

---

# ▶️ Run

Run **User Service**

```bash
mvn spring-boot:run
```

Run **Order Service**

```bash
mvn spring-boot:run
```

---

# 🧪 Testing

### User Service

```text
POST http://localhost:8081/users
GET  http://localhost:8081/users
GET  http://localhost:8081/users/1
```

### Order Service

```text
POST http://localhost:8082/orders
GET  http://localhost:8082/orders
GET  http://localhost:8082/orders/user/1
```

---

# 📚 Concepts Covered

- Microservices Architecture
- Spring Boot REST APIs
- Spring Data JPA
- MySQL Integration
- OpenFeign
- Inter-Service Communication
- Dependency Injection
- Layered Architecture

---

# 🎓 Learning Outcomes

After completing this exercise, you will be able to:

- Build multiple Spring Boot microservices.
- Configure REST APIs.
- Use Spring Data JPA with MySQL.
- Implement service-to-service communication using OpenFeign.
- Understand the fundamentals of distributed applications.

---

# 🚀 Next Exercise

**Exercise 2 – Inventory Management System with Service Discovery**

Topics Covered:

- Inventory Service
- Service Discovery
- Eureka Server
- Eureka Client
- Microservice Registration

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Microservices using Spring Boot 3**