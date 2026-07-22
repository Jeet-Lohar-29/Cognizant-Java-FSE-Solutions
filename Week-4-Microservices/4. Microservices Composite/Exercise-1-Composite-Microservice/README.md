# Week 4 - Microservices Composite

# Exercise 1 - Composite Microservice

This project demonstrates the **Composite Microservice Pattern** using **Spring Boot**, where a dedicated Composite Service aggregates data from multiple independent microservices into a single response.

The application consists of three independent Spring Boot services:

- **Account Service** – Provides account details.
- **Loan Service** – Provides loan details.
- **Composite Service** – Calls both services using `RestTemplate` and combines their responses into a single JSON object. This illustrates the composite microservice pattern for aggregating data from multiple backend services. :contentReference[oaicite:0]{index=0}

---

# 📖 Exercise Overview

This exercise demonstrates communication between multiple microservices using REST APIs.

The Composite Service consumes:

- Account Service
- Loan Service

and returns a combined response to the client.

---

# 🎯 Objective

- Build independent Spring Boot microservices.
- Implement REST APIs.
- Consume REST APIs using RestTemplate.
- Aggregate multiple service responses.
- Understand the Composite Microservice Pattern.

---

# 🛠 Technologies Used

- Java 17
- Spring Boot 4.0.7
- Spring Web
- RestTemplate
- Maven

---

# 📂 Project Structure

```text
Exercise-1-Composite-Microservice
│
├── account-service
│   │
│   ├── src
│   ├── pom.xml
│   └── application.properties
│
├── loan-service
│   │
│   ├── src
│   ├── pom.xml
│   └── application.properties
│
├── composite-service
│   │
│   ├── src
│   ├── pom.xml
│   └── application.properties
│
├── Screenshots
└── README.md
```

---

# 🔄 Application Flow

1. Client sends a request to the Composite Service.
2. Composite Service invokes the Account Service.
3. Composite Service invokes the Loan Service.
4. Responses are received from both services.
5. Composite Service merges the responses.
6. A single JSON response is returned to the client.

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

---

## Composite Service

### Get Customer Details

```http
GET /customer/{accountNumber}/{loanNumber}
```

Example

```text
http://localhost:8082/customer/00987987973432/H00987987972342
```

Sample Response

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

# ▶️ Build

Build each project individually.

### Account Service

```bash
mvn clean install
```

### Loan Service

```bash
mvn clean install
```

### Composite Service

```bash
mvn clean install
```

---

# ▶️ Run

Run all three services in separate terminals.

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

### Loan Service

```text
http://localhost:8081/loans/H00987987972342
```

### Composite Service

```text
http://localhost:8082/customer/00987987973432/H00987987972342
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

---

# 🎓 Learning Outcomes

After completing this exercise, you will be able to:

- Build multiple independent Spring Boot microservices.
- Consume REST APIs using RestTemplate.
- Aggregate responses from multiple services.
- Design a Composite Microservice.
- Understand service orchestration in a microservices architecture.

---

# 🚀 Next Exercise

**Exercise 2 – Composite Microservice Enhancement**

Topics Covered:

- Advanced Service Composition
- Inter-service Communication
- API Aggregation
- Microservice Integration

---

## 👨‍💻 Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

**Cognizant Digital Nurture 5.0**

**Week 4 – Microservices Composite**