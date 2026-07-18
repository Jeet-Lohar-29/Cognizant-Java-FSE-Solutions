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