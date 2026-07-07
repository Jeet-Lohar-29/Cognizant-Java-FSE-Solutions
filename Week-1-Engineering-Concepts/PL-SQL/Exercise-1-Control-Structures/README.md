# Exercise 1 - Control Structures

## Objective

This exercise demonstrates the use of PL/SQL control structures such as:

- IF...THEN
- FOR LOOP
- Conditional Statements
- DBMS_OUTPUT
- UPDATE Statements

using the banking database schema provided in the Cognizant Digital Nurture 5.0 Java FSE program.

---

## Scenarios

### Scenario 1 - Loan Interest Discount

Apply a **1% discount** to loan interest rates for customers who are **above 60 years of age**.

**File**

- `Scenario-1.sql`

**Result**

The PL/SQL block executed successfully.

Based on the sample data provided in the exercise, no customer satisfied the condition (Age > 60), therefore no loan records were updated.

---

### Scenario 2 - VIP Customers

Promote customers to **VIP** status if their account balance exceeds the specified threshold.

**File**

- `Scenario-2.sql`

---

### Scenario 3 - Loan Due Reminder

Display reminder messages for customers whose loans are due within the next 30 days.

**File**

- `Scenario-3.sql`

---

## Concepts Covered

- Anonymous PL/SQL Blocks
- Variables
- FOR LOOP
- IF Statement
- Conditional Logic
- UPDATE Statement
- DBMS_OUTPUT.PUT_LINE
- COMMIT

---

## Prerequisites

Before running these scripts:

1. Execute `CreateTables.sql`
2. Execute `InsertSampleData.sql`

located in:

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