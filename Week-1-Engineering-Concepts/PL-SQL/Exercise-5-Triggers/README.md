# Exercise 5 - Triggers

## Objective

This exercise demonstrates the implementation of PL/SQL triggers to automate database operations and enforce business rules.

---

## Scenarios

### Scenario 1 - Update Customer Last Modified

Automatically update the `LastModified` column whenever a customer record is updated.

**File**

- `Scenario-1.sql`

---

### Scenario 2 - Transaction Audit Log

Automatically insert an audit record whenever a new transaction is added.

**File**

- `Scenario-2.sql`

---

### Scenario 3 - Transaction Validation

Validate deposits and withdrawals before inserting a transaction.

Business Rules:

- Withdrawal amount must not exceed account balance.
- Deposit amount must be greater than zero.

**File**

- `Scenario-3.sql`

---

## Concepts Covered

- BEFORE Trigger
- AFTER Trigger
- Row-Level Trigger
- :NEW Pseudorecord
- Business Rule Enforcement
- Audit Logging
- RAISE_APPLICATION_ERROR

---

## Prerequisites

Execute:

1. `CreateTables.sql`
2. `InsertSampleData.sql`

before running these trigger scripts.

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