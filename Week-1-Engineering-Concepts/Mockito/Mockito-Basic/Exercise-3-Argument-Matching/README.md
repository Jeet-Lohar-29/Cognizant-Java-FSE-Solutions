# Exercise 3 - Argument Matching

## Objective

Learn how to verify method calls using Mockito Argument Matchers.

---

## Scenario

A service calls an external API by passing a category. Instead of verifying one exact value, Mockito Argument Matchers are used to verify that the method is called with a valid string argument.

---

## Files

- pom.xml
- ExternalApi.java
- MyService.java
- MyServiceTest.java

---

## Concepts Covered

- Mockito
- Argument Matchers
- anyString()
- verify()
- Interaction Verification
- JUnit 5

---

## Technologies Used

- Java 17
- Maven
- JUnit 5
- Mockito

---

## Expected Output

```
Tests run: 1
Failures: 0
Errors: 0

BUILD SUCCESS
```

---

## Author

**Jeet Lohar**

Cognizant Digital Nurture 5.0 – Java FSE