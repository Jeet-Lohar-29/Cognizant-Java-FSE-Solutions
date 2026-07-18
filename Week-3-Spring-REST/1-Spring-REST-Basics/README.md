# Week 3 - Spring REST

## Module 1 - Spring REST Basics

---

# Hands-on 1
Create a Spring Web Project using Maven.

## Technologies Used

- Java 17
- Spring Boot
- Maven
- Spring Web
- Spring Boot DevTools

## Project Name

spring-learn

## How to Run

```bash
mvn spring-boot:run
```

## Build

```bash
mvn clean install
```

## Status

✔ Completed

---

# Hands-on 2

## Title

Load SimpleDateFormat from Spring Configuration XML

## Objective

- Create Spring XML Configuration.
- Define a SimpleDateFormat bean.
- Load the bean using ApplicationContext.
- Parse a date using the configured bean.

## Bean

Pattern:

dd/MM/yyyy

## Technologies

- Java 17
- Spring Boot
- Spring Core
- Maven

## Run

```bash
mvn spring-boot:run
```

## Expected Output

```
Mon Dec 31 00:00:00 IST 2018
```

## Status

Completed

---

# Hands-on 3

## Title

Spring Core - Incorporate Logging

## Objective

- Configure Spring Boot logging.
- Replace console printing with SLF4J logging.
- Log START and END of the method.
- Log parsed date using DEBUG level.

## Technologies

- Java 17
- Spring Boot
- SLF4J
- Logback
- Maven

## Run

```bash
mvn spring-boot:run
```

## Expected Output

- START log
- Parsed date in DEBUG log
- END log

## Status

Completed

---

# Hands-on 4

## Title

Spring Core - Load Country from Spring Configuration XML

## Objective

- Create a Country bean using Spring XML configuration.
- Load the bean using ApplicationContext.
- Display Country details using logging.
- Understand Spring Bean configuration using XML.

## Technologies

- Java 17
- Spring Boot
- Spring Core
- Spring XML Configuration
- SLF4J
- Maven

## Run

```bash
mvn spring-boot:run
```

## Expected Output

- START log for displayDate()
- Parsed Date in DEBUG log
- END log
- START log for displayCountry()
- Country Constructor invoked
- Setter methods invoked
- Country details displayed
- END log

## Status

✔ Completed

---

# Hands-on 5

## Title

Spring Core - Demonstration of Singleton Scope and Prototype Scope

## Objective

- Demonstrate Singleton Scope.
- Demonstrate Prototype Scope.
- Understand the difference between Singleton and Prototype beans.

## Technologies

- Java 17
- Spring Boot
- Spring Core
- Spring Bean Scope
- SLF4J
- Maven

## Run

```bash
mvn spring-boot:run
```

## Expected Output

### Singleton Scope

- Constructor called only once.
- Same bean instance returned by Spring.

### Prototype Scope

- Constructor called twice.
- New bean instance created for every `getBean()` call.

## Status

✔ Completed

---

# Hands-on 6

## Title

Spring Core - Load List of Countries from Spring Configuration XML

## Objective

- Create multiple Country beans using Spring XML.
- Create an ArrayList of Country objects.
- Load the list using ApplicationContext.
- Display the list of countries using logging.

## Technologies

- Java 17
- Spring Boot
- Spring Core
- Spring XML Configuration
- Spring Collections
- SLF4J
- Maven

## Run

```bash
mvn spring-boot:run
```

## Expected Output

- START log
- List of four Country objects
- END log

## Status

✔ Completed