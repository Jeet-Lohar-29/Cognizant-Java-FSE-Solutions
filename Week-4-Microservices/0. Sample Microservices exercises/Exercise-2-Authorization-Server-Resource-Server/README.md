# Week 4 - Sample Microservices Exercises

# Exercise 2 - Configuring Authorization Server and Resource Server

This project demonstrates how to configure a **Spring Boot OAuth2 Resource Server** using **Spring Security**.

The application secures REST endpoints using JWT-based authentication. Public endpoints can be accessed without authentication, while protected endpoints require a valid Bearer Token.

---

## 📖 Exercise Overview

This exercise introduces OAuth2 Resource Server configuration in Spring Boot.

A Resource Server is responsible for protecting APIs and validating JWT access tokens issued by an Authorization Server.

In this exercise, the application secures REST endpoints using Spring Security and JWT configuration.

---

## 🎯 Objective

- Configure Spring Security.
- Configure OAuth2 Resource Server.
- Protect REST endpoints.
- Validate JWT Bearer Tokens.
- Understand Resource Server architecture.

---

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Security
- OAuth2 Resource Server
- Maven

---

## 📂 Project Structure

```text
Exercise-2-Authorization-Server-Resource-Server
│
├── resource-server
│   │
│   ├── src
│   │   ├── main
│   │   │
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── resource_server
│   │   │               │
│   │   │               ├── ResourceServerApplication.java
│   │   │               │
│   │   │               ├── config
│   │   │               │      └── ResourceServerConfig.java
│   │   │               │
│   │   │               └── controller
│   │   │                      └── SecureController.java
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

## 🔐 Authentication Flow

1. Client sends a request to the Resource Server.
2. Public endpoints are accessible without authentication.
3. Protected endpoints require a JWT Bearer Token.
4. Spring Security validates the JWT.
5. If the token is valid, access is granted.
6. Otherwise, HTTP 401 Unauthorized is returned.

---

## 🌐 REST Endpoints

### Public Endpoint

```http
GET /
```

### Protected Endpoint

```http
GET /secure
```

---

## ▶️ Running the Application

### Build

```bash
mvn clean install
```

### Run

```bash
mvn spring-boot:run
```

---

## 🧪 Testing

### Public Endpoint

```text
http://localhost:8081/
```

**Output**

```text
Resource Server is Running
```

### Protected Endpoint

```text
http://localhost:8081/secure
```

**Output**

```text
HTTP 401 Unauthorized
```

This confirms that Spring Security is protecting the endpoint correctly.

---

## 📚 Concepts Covered

- OAuth2
- Resource Server
- JWT Authentication
- Spring Security
- SecurityFilterChain
- Protected REST APIs
- HTTP 401 Unauthorized

---

## 🎓 Learning Outcome

After completing this exercise, you will be able to:

- Configure an OAuth2 Resource Server.
- Protect REST APIs using Spring Security.
- Configure JWT validation.
- Understand how Resource Servers validate Bearer Tokens.
- Differentiate between public and secured endpoints.

---

## 🚀 Next Exercise

**Exercise 3 – Using JSON Web Tokens (JWT) for Secure Communication**

Topics Covered:

- JWT Generation
- JWT Validation
- JWT Filter
- Token Authentication
- Securing REST APIs using JWT

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

Week 4 – Sample Microservices Exercises