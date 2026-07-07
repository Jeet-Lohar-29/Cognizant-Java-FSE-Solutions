# Exercise 2 - Error Handling

## Objective

This exercise demonstrates exception handling in PL/SQL using stored procedures.

The procedures ensure that errors are handled gracefully while maintaining database consistency through transaction management.

---

## Scenarios

### Scenario 1 - Safe Fund Transfer

Transfer funds between two bank accounts.

If:

- insufficient balance
- invalid account
- any unexpected error

the transaction is rolled back and an appropriate error message is displayed.

**File**

- `Scenario-1.sql`

---

### Scenario 2 - Update Employee Salary

Increase an employee's salary by a specified percentage.

If the employee ID does not exist, an exception is raised and handled.

**File**

- `Scenario-2.sql`

---

### Scenario 3 - Add New Customer

Insert a new customer into the Customers table.

If a customer with the same ID already exists, the insertion is prevented and an error message is displayed.

**File**

- `Scenario-3.sql`

---

## Concepts Covered

- Stored Procedures
- Exception Handling
- RAISE_APPLICATION_ERROR
- EXCEPTION Block
- COMMIT
- ROLLBACK
- Transaction Management
- DBMS_OUTPUT

---

## Prerequisites

Execute the following before running these procedures:

1. `CreateTables.sql`
2. `InsertSampleData.sql`

located inside:

```
PL-SQL/
└── Database-Schema/
```

---

## Technologies Used

- Oracle Database 21c Express Edition
- Oracle SQL Developer Extension for VS Code
- SQL
- PL/SQL

---

## Author

**Jeet Lohar**

Cognizant Digital Nurture 5.0 - Java Full Stack Engineer