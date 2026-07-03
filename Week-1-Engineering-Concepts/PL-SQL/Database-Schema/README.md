# Database Schema

## Overview

This folder contains the database schema and sample data used for the **PL/SQL Hands-on Exercises** of the **Cognizant Digital Nurture 5.0 - Java Full Stack Engineer (Java FSE)** program.

The schema is designed to simulate a simple banking system and will be reused across all PL/SQL exercises.

---

## Files

### CreateTables.sql

Creates the required database tables with appropriate:

- Primary Keys
- Foreign Keys
- Constraints
- Relationships

### InsertSampleData.sql

Populates the database with realistic sample data for testing and practicing PL/SQL concepts.

---

## Database Tables

| Table | Description |
|--------|-------------|
| Customers | Stores customer information |
| Accounts | Stores customer account details |
| Transactions | Stores account transactions |
| Loans | Stores customer loan details |
| Employees | Stores employee information |

---

## Records Inserted

| Table | Records |
|--------|---------|
| Customers | 10 |
| Accounts | 10 |
| Transactions | 15 |
| Loans | 5 |
| Employees | 8 |

---

## Execution Order

Run the scripts in the following order:

1. `CreateTables.sql`
2. `InsertSampleData.sql`

---

## Purpose

This schema serves as the common database for all PL/SQL exercises, including:

- Control Structures
- Exception Handling
- Stored Procedures
- Functions
- Triggers
- Cursors
- Packages

---

## Technologies Used

- Oracle Database 21c Express Edition (XE)
- Oracle SQL Developer Extension for VS Code
- SQL
- PL/SQL

---

## Author

**Jeet Lohar**

Cognizant Digital Nurture 5.0 - Java FSE