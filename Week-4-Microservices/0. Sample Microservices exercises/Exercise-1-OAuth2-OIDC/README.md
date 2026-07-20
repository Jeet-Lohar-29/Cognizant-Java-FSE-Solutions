# Week 4 - Sample Microservices Exercises

# Exercise 1 - Implementing Centralized Authentication using OAuth2.1 / OpenID Connect (OIDC)

This project demonstrates how to implement centralized authentication in a Spring Boot application using **OAuth2.1** and **OpenID Connect (OIDC)** with **Google Sign-In**.

The application uses **Spring Security** and **OAuth2 Client** to authenticate users through Google and securely access protected resources.

---

## 📖 Exercise Overview

This exercise introduces OAuth2 authentication in Spring Boot using Google as the Identity Provider.

Instead of implementing username/password authentication, users authenticate through Google. Once authenticated, Spring Security establishes a secure session and provides access to protected endpoints.

---

## 🎯 Objective

- Configure Spring Security.
- Configure OAuth2 Client.
- Integrate Google OAuth Login.
- Authenticate users using OpenID Connect.
- Access authenticated user information.

---

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Security
- OAuth2 Client
- OpenID Connect (OIDC)
- Maven

---

## 📂 Project Structure

```text
Exercise-1-OAuth2-OIDC
│
├── oauth2-client
│   │
│   ├── src
│   │   ├── main
│   │   │
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── oauth2_client
│   │   │               │
│   │   │               ├── OAuth2ClientApplication.java
│   │   │               │
│   │   │               ├── config
│   │   │               │      └── SecurityConfig.java
│   │   │               │
│   │   │               └── controller
│   │   │                      └── UserController.java
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

1. User accesses the secured endpoint.
2. Spring Security redirects the user to Google Login.
3. User authenticates using their Google account.
4. Google redirects back to the application.
5. Spring Security creates an authenticated session.
6. User details become available through the `/user` endpoint.

---

## 🌐 REST Endpoints

### Home

```http
GET /
```

### Authenticated User

```http
GET /user
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

Open your browser:

```text
http://localhost:8080/user
```

Expected Flow:

- Redirect to Google Login
- Authenticate with Google
- Redirect back to application
- Display authenticated user details

---

## 📚 Concepts Covered

- OAuth2
- OpenID Connect (OIDC)
- Spring Security
- OAuth2 Client
- Google Authentication
- SecurityFilterChain
- Protected REST APIs

---

## 🎓 Learning Outcome

After completing this exercise, you will be able to:

- Configure OAuth2 authentication in Spring Boot.
- Integrate Google Sign-In.
- Secure REST APIs using Spring Security.
- Understand centralized authentication.
- Retrieve authenticated user information using OpenID Connect.

---

## 🚀 Next Exercise

**Exercise 2 - Configuring Authorization Server and Resource Server**

Topics Covered:

- OAuth2 Resource Server
- JWT Validation
- Securing REST APIs
- Authorization Server Configuration

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

Week 4 - Sample Microservices Exercises