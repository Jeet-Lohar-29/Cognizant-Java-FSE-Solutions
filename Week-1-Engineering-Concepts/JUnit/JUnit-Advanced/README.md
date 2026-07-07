# JUnit Advanced

## Overview

This folder contains the **JUnit Advanced** exercises completed as part of the **Cognizant Digital Nurture 5.0 - Java Full Stack Engineer (Java FSE)** program.

The exercises focus on advanced testing concepts available in **JUnit 5 (Jupiter)**, including parameterized tests, test suites, execution order, exception testing, and timeout/performance testing.

---

## Folder Structure

```text
JUnit-Advanced/
│
├── Exercise-1-Parameterized-Tests/
├── Exercise-2-Test-Suites/
├── Exercise-3-Test-Execution-Order/
├── Exercise-4-Exception-Testing/
├── Exercise-5-Timeout-Testing/
│
└── README.md
```

---

## Exercises

### Exercise 1 – Parameterized Tests

**Objective**

Execute the same test method using multiple input values.

**Concepts Covered**

* `@ParameterizedTest`
* `@ValueSource`
* Parameterized Testing
* Assertions

---

### Exercise 2 – Test Suites

**Objective**

Group multiple test classes into a single executable test suite.

**Concepts Covered**

* `@Suite`
* `@SelectClasses`
* Test Suite Organization

---

### Exercise 3 – Test Execution Order

**Objective**

Control the execution order of test methods.

**Concepts Covered**

* `@TestMethodOrder`
* `@Order`
* Ordered Test Execution

---

### Exercise 4 – Exception Testing

**Objective**

Verify that methods throw the expected exception.

**Concepts Covered**

* `assertThrows()`
* Exception Validation
* Exception Message Verification

---

### Exercise 5 – Timeout and Performance Testing

**Objective**

Ensure methods complete execution within a specified time limit.

**Concepts Covered**

* `assertTimeout()`
* Performance Testing
* `Duration`

---

## Concepts Covered

* JUnit 5 (Jupiter)
* Parameterized Tests
* Test Suites
* Test Execution Order
* Exception Testing
* Timeout Testing
* Unit Testing
* Maven
* Assertions

---

## Technologies Used

* Java 17
* Maven
* JUnit Jupiter 5
* Visual Studio Code

---

## Build and Run

Open the terminal inside any exercise folder and execute:

```bash
mvn clean test
```

A successful execution should display:

```text
BUILD SUCCESS
```

---

## Learning Outcomes

After completing this module, the following skills have been practiced:

* Writing parameterized tests
* Creating and executing test suites
* Controlling test execution order
* Testing expected exceptions
* Performing timeout and performance validation
* Executing automated tests with Maven

---

## Notes

* All exercises follow the requirements provided in the Cognizant Digital Nurture 5.0 program.
* JUnit **Jupiter (JUnit 5)** is used throughout this module because the exercises require annotations such as `@ParameterizedTest`, `@Suite`, `@TestMethodOrder`, and APIs such as `assertThrows()` and `assertTimeout()`.
* Every exercise follows the standard Maven directory layout with production code under `src/main/java` and test code under `src/test/java`.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 5.0 - Java Full Stack Engineer
