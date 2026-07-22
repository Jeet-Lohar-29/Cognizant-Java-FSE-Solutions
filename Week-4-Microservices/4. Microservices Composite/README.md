# Week 4 - Microservices Composite

This module demonstrates the **Composite Microservice Pattern** using **Spring Boot**, where multiple independent microservices work together to provide a single aggregated response to the client.

The module focuses on splitting business functionality into separate services and then composing them through a dedicated Composite Service. Instead of clients communicating with multiple services individually, the Composite Service gathers data from the backend services using REST APIs and returns a unified response. This approach simplifies client interactions and demonstrates service orchestration in a microservices architecture. :contentReference[oaicite:0]{index=0}

---

# 📖 Module Overview

This module consists of one complete exercise.

### Exercise 1 – Composite Microservice

Implemented Services:

- Account Service
- Loan Service
- Composite Service

The Composite Service consumes both Account and Loan services using **RestTemplate** and combines their responses into a single JSON object.

---

# 🎯 Module Objectives

- Understand the Composite Microservice Pattern.
- Build multiple independent Spring Boot microservices.
- Implement REST APIs.
- Consume REST APIs using RestTemplate.
- Aggregate responses from multiple services.
- Understand service orchestration.

---

# 🛠 Technologies Used

- Java 17
- Spring Boot 4.0.7
- Spring Web
- RestTemplate
- Maven

---

# 📂 Module Structure

```text
4. Microservices Composite
│
├── Exercise-1-Composite-Microservice
│   │
│   ├── account-service
│   ├── loan-service
│   ├── composite-service
│   ├── README.md
│
├── Screenshots
│
└── README.md
```

---

# 📚 Exercise Summary

## Exercise 1 – Composite Microservice

Implemented:

- Account REST Microservice
- Loan REST Microservice
- Composite REST Microservice
- REST API Communication
- Response Aggregation using RestTemplate

---

# 🔄 Application Flow

1. Client sends a request to the Composite Service.
2. Composite Service invokes the Account Service.
3. Composite Service invokes the Loan Service.
4. Responses are fetched from both services.
5. Composite Service combines the responses.
6. A single JSON response is returned to the client.

---

# 🌐 REST APIs

## Account Service

```http
GET /accounts/{number}
```

Example

```text
http://localhost:8080/accounts/00987987973432
```

---

## Loan Service

```http
GET /loans/{number}
```

Example

```text
http://localhost:8081/loans/H00987987972342
```

---

## Composite Service

```http
GET /customer/{accountNumber}/{loanNumber}
```

Example

```text
http://localhost:8082/customer/00987987973432/H00987987972342
```

---

# ▶️ Build

Build each project separately.

```bash
mvn clean install
```

---

# ▶️ Run

Run all three applications in separate terminals.

### Account Service

```bash
mvn spring-boot:run
```

### Loan Service

```bash
mvn spring-boot:run
```

### Composite Service

```bash
mvn spring-boot:run
```

---

# 🧪 Testing

### Account Service

```text
http://localhost:8080/accounts/00987987973432
```

---

### Loan Service

```text
http://localhost:8081/loans/H00987987972342
```

---

### Composite Service

```text
http://localhost:8082/customer/00987987973432/H00987987972342
```

Expected Response

```json
{
  "account": {
    "number": "00987987973432",
    "type": "Savings",
    "balance": 234343.0
  },
  "loan": {
    "number": "H00987987972342",
    "type": "Car",
    "loan": 400000.0,
    "emi": 3258.0,
    "tenure": 18
  }
}
```

---

# 📚 Concepts Covered

- Microservices Architecture
- Composite Microservice Pattern
- REST APIs
- Spring Boot REST Controllers
- RestTemplate
- JSON Serialization
- Service-to-Service Communication
- API Aggregation

---

# 🎓 Learning Outcomes

After completing this module, you will be able to:

- Build multiple independent Spring Boot microservices.
- Design REST APIs for individual services.
- Consume REST APIs using RestTemplate.
- Aggregate multiple service responses into a single response.
- Understand the Composite Microservice Pattern.
- Implement service orchestration in Spring Boot applications.

---

# 🚀 Next Module

**Week 5 – Spring Security / OAuth2 / Advanced Microservices** *(as per the Cognizant Digital Nurture curriculum)*

Topics Covered:

- Spring Security
- OAuth2
- JWT Authentication
- Secure REST APIs
- Authorization

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Microservices Composite**