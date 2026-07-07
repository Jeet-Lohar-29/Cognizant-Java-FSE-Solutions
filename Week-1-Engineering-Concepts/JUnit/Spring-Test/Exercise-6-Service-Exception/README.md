# Exercise 6 - Test Service Exception Handling

## Objective

Test how a service handles a missing user by verifying that it throws the expected exception.

---

## Scenario

The service retrieves a user from the repository. If the user does not exist, it throws a `RuntimeException`.

---

## Files

* pom.xml
* SpringTestApplication.java
* User.java
* UserRepository.java
* UserService.java
* UserServiceTest.java

---

## Concepts Covered

* JUnit 5
* Mockito
* Mock Repository
* @Mock
* @InjectMocks
* assertThrows()
* Exception Testing
* Service Layer Testing

---

## Technologies Used

* Java 17
* Spring Boot 3.3.2
* Maven
* Mockito
* JUnit 5

---

## Author

**Jeet Lohar**

Cognizant Digital Nurture 5.0 - Java FSE
