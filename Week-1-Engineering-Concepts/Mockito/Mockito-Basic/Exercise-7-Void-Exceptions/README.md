# Exercise 7 - Handling Void Methods with Exceptions

## Objective

Learn how to test void methods that throw exceptions using Mockito.

---

## Scenario

A service invokes a void method of an external API. The mocked method is configured to throw an exception, and the test verifies both the exception and the interaction.

---

## Files

- pom.xml
- ExternalApi.java
- MyService.java
- MyServiceTest.java

---

## Concepts Covered

- Mockito
- doThrow()
- Void Methods
- Exception Testing
- assertThrows()
- verify()

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