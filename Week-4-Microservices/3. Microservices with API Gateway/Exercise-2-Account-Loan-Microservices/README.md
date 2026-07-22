# Week 4 - Microservices with API Gateway

# Exercise 2 - Account and Loan Microservices

This project demonstrates a simple **Microservices Architecture** using **Spring Boot**, where two independent microservices (**Account Service** and **Loan Service**) expose REST APIs that return dummy account and loan information.

The objective of this exercise is to understand how multiple microservices can be developed and deployed independently while exposing REST endpoints.

---

# 📖 Exercise Overview

This exercise consists of two independent Spring Boot applications.

- **Account Service** – Provides account details.
- **Loan Service** – Provides loan details.

Both services are standalone applications and communicate through REST APIs.

---

# 🎯 Objective

- Build independent Spring Boot microservices.
- Implement REST APIs.
- Return JSON responses.
- Understand the basics of Microservices Architecture.
- Deploy multiple services on different ports.

---

# 🛠 Technologies Used

- Java 17
- Spring Boot 4.0.7
- Spring Web
- Maven

---

# 📂 Project Structure

```text
Exercise-2-Account-Loan-Microservices
│
├── account
│   │
│   ├── src
│   ├── pom.xml
│   ├── mvnw
│   └── application.properties
│
├── loan
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

1. Client sends a request.
2. Request reaches the respective microservice.
3. The controller creates a dummy object.
4. Spring Boot automatically converts the Java object into JSON.
5. JSON response is returned to the client. :contentReference[oaicite:0]{index=0}

---

# 🌐 REST APIs

## Account Service

### Get Account Details

```http
GET /accounts/{number}
```

Example

```text
http://localhost:8080/accounts/00987987973432
```

Sample Response

```json
{
  "number": "00987987973432",
  "type": "Savings",
  "balance": 234343.0
}
```

---

## Loan Service

### Get Loan Details

```http
GET /loans/{number}
```

Example

```text
http://localhost:8081/loans/H00987987972342
```

Sample Response

```json
{
  "number": "H00987987972342",
  "type": "Car",
  "loan": 400000.0,
  "emi": 3258.0,
  "tenure": 18
}
```

---

# ▶️ Build

## Account Service

```bash
mvn clean install
```

## Loan Service

```bash
mvn clean install
```

---

# ▶️ Run

## Account Service

```bash
mvn spring-boot:run
```

## Loan Service

```bash
mvn spring-boot:run
```

---

# 🧪 Testing

### Account Service

```text
http://localhost:8080/accounts/00987987973432
```

### Loan Service

```text
http://localhost:8081/loans/H00987987972342
```

---

# 📚 Concepts Covered

- Microservices Architecture
- Spring Boot REST APIs
- JSON Response
- REST Controller
- Maven Project Structure
- Layered Architecture

---

# 🎓 Learning Outcomes

After completing this exercise, you will be able to:

- Build independent Spring Boot microservices.
- Develop REST APIs using Spring Boot.
- Return JSON responses from controllers.
- Deploy multiple microservices on different ports.
- Understand the basics of distributed application architecture.

---

# 🚀 Next Exercise

**Exercise 3 – API Gateway Integration**

Topics Covered:

- Spring Cloud Gateway
- Request Routing
- API Gateway
- Global Logging Filter
- Service Routing

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Microservices with API Gateway**