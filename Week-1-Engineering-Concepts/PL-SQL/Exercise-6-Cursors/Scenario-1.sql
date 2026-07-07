/*
=========================================================
 Exercise 6 - Cursors
 Scenario 1

 Generate monthly statements for customers.
=========================================================
*/

DECLARE

    CURSOR GenerateMonthlyStatements IS

        SELECT
            c.CustomerID,
            c.Name,
            t.TransactionID,
            t.TransactionDate,
            t.Amount,
            t.TransactionType

        FROM Customers c
        JOIN Accounts a
            ON c.CustomerID = a.CustomerID
        JOIN Transactions t
            ON a.AccountID = t.AccountID

        WHERE EXTRACT(MONTH FROM t.TransactionDate) = EXTRACT(MONTH FROM SYSDATE)
        AND EXTRACT(YEAR FROM t.TransactionDate) = EXTRACT(YEAR FROM SYSDATE);

    v_Record GenerateMonthlyStatements%ROWTYPE;

BEGIN

    OPEN GenerateMonthlyStatements;

    LOOP

        FETCH GenerateMonthlyStatements INTO v_Record;

        EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(

            'Customer : ' || v_Record.Name ||
            ' | Transaction : ' || v_Record.TransactionID ||
            ' | Amount : ' || v_Record.Amount ||
            ' | Type : ' || v_Record.TransactionType

        );

    END LOOP;

    CLOSE GenerateMonthlyStatements;

END;
/