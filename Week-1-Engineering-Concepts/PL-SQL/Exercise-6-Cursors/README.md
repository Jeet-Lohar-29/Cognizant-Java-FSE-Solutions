# Exercise 6 - Cursors

## Objective

This exercise demonstrates the use of **explicit cursors** in PL/SQL to process multiple rows one at a time.

---

## Scenarios

### Scenario 1 - Generate Monthly Statements

Retrieve all transactions for the current month and display a statement for each customer.

**File**

- `Scenario-1.sql`

---

### Scenario 2 - Apply Annual Maintenance Fee

Deduct a fixed annual maintenance fee from every account using an explicit cursor.

**File**

- `Scenario-2.sql`

---

### Scenario 3 - Update Loan Interest Rates

Fetch all loan records and update their interest rates according to the new policy.

**File**

- `Scenario-3.sql`

---

## Concepts Covered

- Explicit Cursors
- CURSOR Declaration
- OPEN
- FETCH
- CLOSE
- LOOP
- %NOTFOUND
- UPDATE Statement
- COMMIT
- DBMS_OUTPUT

---

## Prerequisites

Execute:

1. `CreateTables.sql`
2. `InsertSampleData.sql`

before running these scripts.

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