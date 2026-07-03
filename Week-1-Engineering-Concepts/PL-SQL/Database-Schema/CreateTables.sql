/*
=========================================================
 Cognizant Digital Nurture 5.0
 Java FSE - PL/SQL Hands-on

 Database Schema Creation Script

 Author : Jeet Lohar
=========================================================
*/

---------------------------------------------------------
-- Drop Existing Tables (Ignore errors if first execution)
---------------------------------------------------------

DROP TABLE Transactions CASCADE CONSTRAINTS;
DROP TABLE Loans CASCADE CONSTRAINTS;
DROP TABLE Accounts CASCADE CONSTRAINTS;
DROP TABLE Employees CASCADE CONSTRAINTS;
DROP TABLE Customers CASCADE CONSTRAINTS;

---------------------------------------------------------
-- Customers Table
---------------------------------------------------------

CREATE TABLE Customers (

    CustomerID      NUMBER PRIMARY KEY,

    Name            VARCHAR2(100) NOT NULL,

    DOB             DATE,

    Balance         NUMBER(12,2),

    LastModified    DATE

);

---------------------------------------------------------
-- Accounts Table
---------------------------------------------------------

CREATE TABLE Accounts (

    AccountID       NUMBER PRIMARY KEY,

    CustomerID      NUMBER NOT NULL,

    AccountType     VARCHAR2(30),

    Balance         NUMBER(12,2),

    LastModified    DATE,

    CONSTRAINT FK_Account_Customer
    FOREIGN KEY(CustomerID)
    REFERENCES Customers(CustomerID)

);

---------------------------------------------------------
-- Transactions Table
---------------------------------------------------------

CREATE TABLE Transactions (

    TransactionID   NUMBER PRIMARY KEY,

    AccountID       NUMBER NOT NULL,

    TransactionDate DATE,

    Amount          NUMBER(12,2),

    TransactionType VARCHAR2(20),

    CONSTRAINT FK_Transaction_Account
    FOREIGN KEY(AccountID)
    REFERENCES Accounts(AccountID)

);

---------------------------------------------------------
-- Loans Table
---------------------------------------------------------

CREATE TABLE Loans (

    LoanID          NUMBER PRIMARY KEY,

    CustomerID      NUMBER NOT NULL,

    LoanAmount      NUMBER(12,2),

    InterestRate    NUMBER(5,2),

    StartDate       DATE,

    EndDate         DATE,

    CONSTRAINT FK_Loan_Customer
    FOREIGN KEY(CustomerID)
    REFERENCES Customers(CustomerID)

);

---------------------------------------------------------
-- Employees Table
---------------------------------------------------------

CREATE TABLE Employees (

    EmployeeID      NUMBER PRIMARY KEY,

    Name            VARCHAR2(100),

    Position        VARCHAR2(60),

    Salary          NUMBER(12,2),

    Department      VARCHAR2(60),

    HireDate        DATE

);

---------------------------------------------------------
-- Verify Tables
---------------------------------------------------------

SELECT table_name
FROM user_tables
ORDER BY table_name;