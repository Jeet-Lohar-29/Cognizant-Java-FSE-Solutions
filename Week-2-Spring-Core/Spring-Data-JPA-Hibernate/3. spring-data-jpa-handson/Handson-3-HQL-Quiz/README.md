# Handson-3: Fetch Quiz Attempt Details using HQL

## Objective

Implement a complex **Hibernate Query Language (HQL)** query to retrieve the complete details of a quiz attempt made by a user.

The application should fetch:

- User details
- Attempt details
- Questions attempted
- Available options for each question
- Correct answers
- Scores
- User selected options

using a single optimized HQL query with `JOIN FETCH`.

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- MySQL 8
- Maven

---

## Project Structure

```text
orm-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.ormlearn
│   │   │       ├── model
│   │   │       │     User.java
│   │   │       │     Attempt.java
│   │   │       │     Question.java
│   │   │       │     Option.java
│   │   │       │     AttemptQuestion.java
│   │   │       │     AttemptOption.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │     AttemptRepository.java
│   │   │       │
│   │   │       ├── service
│   │   │       │     AttemptService.java
│   │   │       │
│   │   │       └── OrmLearnApplication.java
│   │   │
│   │   └── resources
│   │         application.properties
│   │
├── pom.xml
└── README.md
```

---

## HQL Query

The repository uses a custom HQL query with multiple `JOIN FETCH` clauses to retrieve the complete quiz attempt in a single query.

Example:

```java
@Query("""
SELECT a
FROM Attempt a
JOIN FETCH a.user
JOIN FETCH a.attemptQuestions aq
JOIN FETCH aq.question
JOIN FETCH aq.attemptOptions ao
JOIN FETCH ao.option
WHERE a.user.id = :userId
AND a.id = :attemptId
""")
```

`JOIN FETCH` ensures that related entities are loaded together, reducing additional SQL queries and preventing lazy-loading issues. Spring Data JPA supports defining such custom JPQL/HQL queries with the `@Query` annotation. :contentReference[oaicite:0]{index=0}

---

## Repository Layer

Implemented:

- AttemptRepository

Method:

```java
Attempt getAttempt(int userId, int attemptId);
```

---

## Service Layer

Implemented:

```java
public Attempt getAttempt(int userId, int attemptId)
```

The service delegates the request to the repository.

---

## Application Flow

The application executes:

```java
testGetAttempt();
```

The method displays:

- Username
- Attempt Date
- Question
- Available Options
- Correct Answer
- Marks
- Selected Answer

---

## Build

```bash
mvn clean compile
```

---

## Run

```bash
mvn spring-boot:run
```

---

## Expected Output

```text
Start

Username : John

Attempt Date : 2024-10-01

Question :
What is HTML?

1) .xhtm
Score : 0
Selected : false

2) .html
Score : 1
Selected : true

...

End
```

---

## Concepts Covered

- Hibernate Query Language (HQL)
- JOIN
- JOIN FETCH
- One-To-Many Mapping
- Many-To-One Mapping
- Entity Relationships
- Fetch Strategies
- Spring Data JPA
- Repository Pattern

---

## Learning Outcomes

After completing this hands-on, you will understand:

- Writing complex HQL queries
- Using `JOIN FETCH` for eager loading
- Retrieving nested entity relationships
- Avoiding the N+1 query problem
- Displaying hierarchical data efficiently

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer