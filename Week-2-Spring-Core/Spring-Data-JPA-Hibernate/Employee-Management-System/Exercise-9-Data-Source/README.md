# Exercise 9: Employee Management System - Customizing Data Source Configuration

## Objective

Configure multiple data sources in a Spring Boot application using external configuration properties.

This exercise demonstrates how Spring Boot auto-configures the primary datasource while allowing additional datasources to be configured manually using Java configuration.

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- H2 Database
- Spring Web
- Lombok
- Maven

---

## Project Structure

```text
employee-management-system
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.ems
│   │   │       ├── config
│   │   │       │   └── SecondaryDataSourceConfig.java
│   │   │       ├── controller
│   │   │       ├── dto
│   │   │       ├── entity
│   │   │       ├── projection
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       └── EmployeeManagementSystemApplication.java
│   │   │
│   │   └── resources
│   │         └── application.properties
│   │
├── pom.xml
└── README.md
```

---

## Primary DataSource

The primary datasource is configured using Spring Boot's default properties.

```properties
spring.datasource.url=jdbc:h2:mem:primarydb
spring.datasource.username=sa
spring.datasource.password=password
spring.datasource.driver-class-name=org.h2.Driver
```

---

## Secondary DataSource

A secondary datasource is configured using a custom property prefix.

```properties
app.datasource.jdbc-url=jdbc:h2:mem:secondarydb
app.datasource.username=sa
app.datasource.password=password
app.datasource.driver-class-name=org.h2.Driver
```

> If `DataSourceBuilder` creates a Hikari datasource, `jdbc-url` should be used instead of `url`, or `DataSourceProperties` should be used to perform the URL-to-jdbcUrl translation automatically.

---

## SecondaryDataSourceConfig

A separate configuration class creates the secondary datasource.

```java
@Configuration
public class SecondaryDataSourceConfig {

    @Bean(name = "secondaryDataSource")
    @ConfigurationProperties(prefix = "app.datasource")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().build();
    }
}
```

---

## H2 Console

```properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

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
Started EmployeeManagementSystemApplication
```

The application starts successfully with the primary datasource managed by Spring Boot and the secondary datasource registered as a custom bean.

---

## Concepts Covered

- Spring Boot Auto Configuration
- Multiple DataSources
- DataSourceBuilder
- ConfigurationProperties
- H2 Database
- Externalized Configuration
- Java Configuration

---

## Learning Outcomes

After completing this exercise, you will understand:

- Configuring multiple datasources.
- Using `@ConfigurationProperties`.
- Creating custom datasource beans.
- Externalizing database configuration.
- Using Spring Boot auto-configuration together with manual datasource configuration.

---

## Author

**Jeet Lohar**

B.Tech Computer Science & Engineering

Lovely Professional University

Cognizant Digital Nurture 4.0 – Java Full Stack Engineer