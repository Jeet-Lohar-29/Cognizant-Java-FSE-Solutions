/*
=========================================================
 Cognizant Digital Nurture 5.0
 Java FSE - PL/SQL Hands-on

 Sample Data Insertion Script

 Author : Jeet Lohar
=========================================================
*/

---------------------------------------------------------
-- CUSTOMERS
---------------------------------------------------------

INSERT ALL
INTO Customers VALUES (101, 'Amit Sharma', TO_DATE('15-03-1985','DD-MM-YYYY'), 85000, SYSDATE)
INTO Customers VALUES (102, 'Priya Verma', TO_DATE('22-07-1990','DD-MM-YYYY'), 125000, SYSDATE)
INTO Customers VALUES (103, 'Rahul Mehta', TO_DATE('10-11-1982','DD-MM-YYYY'), 95000, SYSDATE)
INTO Customers VALUES (104, 'Sneha Patel', TO_DATE('18-01-1995','DD-MM-YYYY'), 45000, SYSDATE)
INTO Customers VALUES (105, 'Vikram Singh', TO_DATE('09-09-1988','DD-MM-YYYY'), 180000, SYSDATE)
INTO Customers VALUES (106, 'Neha Kapoor', TO_DATE('28-05-1992','DD-MM-YYYY'), 72000, SYSDATE)
INTO Customers VALUES (107, 'Arjun Nair', TO_DATE('13-12-1987','DD-MM-YYYY'), 56000, SYSDATE)
INTO Customers VALUES (108, 'Pooja Desai', TO_DATE('30-04-1993','DD-MM-YYYY'), 134000, SYSDATE)
INTO Customers VALUES (109, 'Rohit Jain', TO_DATE('17-06-1984','DD-MM-YYYY'), 210000, SYSDATE)
INTO Customers VALUES (110, 'Kiran Joshi', TO_DATE('25-08-1996','DD-MM-YYYY'), 38000, SYSDATE)
SELECT * FROM dual;

---------------------------------------------------------
-- ACCOUNTS
---------------------------------------------------------

INSERT ALL
INTO Accounts VALUES (1001,101,'Savings',85000,SYSDATE)
INTO Accounts VALUES (1002,102,'Current',125000,SYSDATE)
INTO Accounts VALUES (1003,103,'Savings',95000,SYSDATE)
INTO Accounts VALUES (1004,104,'Savings',45000,SYSDATE)
INTO Accounts VALUES (1005,105,'Current',180000,SYSDATE)
INTO Accounts VALUES (1006,106,'Savings',72000,SYSDATE)
INTO Accounts VALUES (1007,107,'Savings',56000,SYSDATE)
INTO Accounts VALUES (1008,108,'Current',134000,SYSDATE)
INTO Accounts VALUES (1009,109,'Savings',210000,SYSDATE)
INTO Accounts VALUES (1010,110,'Savings',38000,SYSDATE)
SELECT * FROM dual;

---------------------------------------------------------
-- TRANSACTIONS
---------------------------------------------------------

INSERT ALL
INTO Transactions VALUES (1,1001,SYSDATE-20,5000,'Deposit')
INTO Transactions VALUES (2,1002,SYSDATE-18,3000,'Withdrawal')
INTO Transactions VALUES (3,1003,SYSDATE-16,7500,'Deposit')
INTO Transactions VALUES (4,1004,SYSDATE-14,2500,'Withdrawal')
INTO Transactions VALUES (5,1005,SYSDATE-12,10000,'Deposit')
INTO Transactions VALUES (6,1006,SYSDATE-10,4500,'Deposit')
INTO Transactions VALUES (7,1007,SYSDATE-9,2200,'Withdrawal')
INTO Transactions VALUES (8,1008,SYSDATE-8,6500,'Deposit')
INTO Transactions VALUES (9,1009,SYSDATE-7,12000,'Deposit')
INTO Transactions VALUES (10,1010,SYSDATE-6,1800,'Withdrawal')
INTO Transactions VALUES (11,1001,SYSDATE-5,3500,'Deposit')
INTO Transactions VALUES (12,1002,SYSDATE-4,6000,'Deposit')
INTO Transactions VALUES (13,1003,SYSDATE-3,1500,'Withdrawal')
INTO Transactions VALUES (14,1004,SYSDATE-2,8000,'Deposit')
INTO Transactions VALUES (15,1005,SYSDATE-1,2500,'Withdrawal')
SELECT * FROM dual;

---------------------------------------------------------
-- LOANS
---------------------------------------------------------

INSERT ALL
INTO Loans VALUES (501,101,500000,8.5,DATE '2022-01-01',DATE '2027-01-01')
INTO Loans VALUES (502,103,750000,9.2,DATE '2021-06-15',DATE '2028-06-15')
INTO Loans VALUES (503,105,1200000,7.8,DATE '2020-03-10',DATE '2030-03-10')
INTO Loans VALUES (504,108,450000,8.1,DATE '2023-02-20',DATE '2028-02-20')
INTO Loans VALUES (505,109,900000,9.0,DATE '2019-11-05',DATE '2029-11-05')
SELECT * FROM dual;

---------------------------------------------------------
-- EMPLOYEES
---------------------------------------------------------

INSERT ALL
INTO Employees VALUES (201,'Rajesh Kumar','Manager',85000,'Operations',DATE '2018-04-10')
INTO Employees VALUES (202,'Anjali Gupta','Cashier',42000,'Banking',DATE '2020-06-15')
INTO Employees VALUES (203,'Suresh Iyer','Loan Officer',65000,'Loans',DATE '2019-08-12')
INTO Employees VALUES (204,'Meena Shah','HR Executive',58000,'HR',DATE '2021-01-20')
INTO Employees VALUES (205,'Vivek Rao','Accountant',62000,'Finance',DATE '2017-10-18')
INTO Employees VALUES (206,'Deepa Nair','IT Support',70000,'IT',DATE '2022-05-09')
INTO Employees VALUES (207,'Kunal Arora','Relationship Manager',76000,'Customer Service',DATE '2020-09-14')
INTO Employees VALUES (208,'Shweta Mishra','Branch Manager',98000,'Management',DATE '2016-12-01')
SELECT * FROM dual;

---------------------------------------------------------
-- Commit
---------------------------------------------------------

COMMIT;

---------------------------------------------------------
-- Verify Data
---------------------------------------------------------

SELECT 'CUSTOMERS' AS TABLE_NAME, COUNT(*) AS TOTAL_RECORDS FROM Customers
UNION ALL
SELECT 'ACCOUNTS', COUNT(*) FROM Accounts
UNION ALL
SELECT 'TRANSACTIONS', COUNT(*) FROM Transactions
UNION ALL
SELECT 'LOANS', COUNT(*) FROM Loans
UNION ALL
SELECT 'EMPLOYEES', COUNT(*) FROM Employees;