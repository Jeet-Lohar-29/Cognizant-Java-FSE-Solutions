# Week 4 - Sample Microservices Exercises

# Exercise 3 - JWT Authentication

This project demonstrates how to implement **JWT (JSON Web Token) Authentication** in a Spring Boot application using **Spring Security**.

The application generates JWT tokens for authenticated users and validates them before allowing access to protected REST endpoints.

---

## 📖 Exercise Overview

This exercise introduces JWT-based authentication and authorization using Spring Boot.

JSON Web Tokens provide a stateless authentication mechanism where the server generates a signed token after successful authentication. The client sends this token with every protected request using the HTTP Authorization header.

---

## 🎯 Objective

- Configure JWT Authentication.
- Generate JWT Tokens.
- Validate JWT Tokens.
- Secure REST APIs.
- Protect endpoints using Spring Security.

---

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Security
- JSON Web Token (JJWT)
- Maven

---

## 📂 Project Structure

```text
Exercise-3-JWT-Authentication
│
├── jwt-authentication
│   │
│   ├── src
│   │   ├── main
│   │   │
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── jwt_authentication
│   │   │               │
│   │   │               ├── JwtAuthenticationApplication.java
│   │   │               │
│   │   │               ├── config
│   │   │               │      └── JwtConfig.java
│   │   │               │
│   │   │               ├── controller
│   │   │               │      └── AuthController.java
│   │   │               │
│   │   │               └── security
│   │   │                      ├── JwtAuthenticationFilter.java
│   │   │                      ├── JwtTokenProvider.java
│   │   │                      └── SecurityConfig.java
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

1. User requests a JWT token.
2. Server generates and signs the JWT.
3. Client stores the JWT.
4. Client sends the JWT in the Authorization header.
5. Spring Security validates the token.
6. Protected endpoints become accessible after successful validation.

---

## 🌐 REST Endpoints

### Home

```http
GET /
```

### Generate JWT

```http
GET /token?username={username}
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

### Home

```text
http://localhost:8082/
```

### Generate Token

```text
http://localhost:8082/token?username=jeet
```

### Protected API

```text
GET /secure
```

Header

```text
Authorization: Bearer <JWT_TOKEN>
```

---

## 📚 Concepts Covered

- JSON Web Tokens (JWT)
- Spring Security
- Token Generation
- Token Validation
- Authentication Filter
- Protected REST APIs
- Stateless Authentication

---

## 🎓 Learning Outcome

After completing this exercise, you will be able to:

- Generate JWT tokens.
- Validate JWT tokens.
- Protect REST APIs using JWT.
- Configure Spring Security with JWT.
- Understand stateless authentication.

---

## ✅ Module Completion

Module-0 – Sample Microservices Exercises Completed

Exercises Completed:

- Exercise 1 – OAuth2 / OpenID Connect
- Exercise 2 – Authorization Server & Resource Server
- Exercise 3 – JWT Authentication

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

Week 4 – Sample Microservices Exercises