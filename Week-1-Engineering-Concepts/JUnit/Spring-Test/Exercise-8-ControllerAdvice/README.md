# Exercise 8 - Test Controller Exception Handling

## Objective

Test a global exception handler using `@ControllerAdvice`.

---

## Scenario

The service throws a `NoSuchElementException` when a user is not found. The global exception handler catches the exception and returns **HTTP 404** with the message **"User not found"**.

---

## Files

* pom.xml
* SpringTestApplication.java
* User.java
* UserService.java
* UserController.java
* GlobalExceptionHandler.java
* UserControllerExceptionTest.java

---

## Concepts Covered

* Spring Boot Testing
* @ControllerAdvice
* @ExceptionHandler
* @WebMvcTest
* MockMvc
* @MockBean
* Exception Handling
* JUnit 5

---

## Technologies Used

* Java 17
* Spring Boot 3.3.2
* Maven
* MockMvc
* Mockito
* JUnit 5

---

## Author

**Jeet Lohar**

Cognizant Digital Nurture 5.0 - Java FSE
