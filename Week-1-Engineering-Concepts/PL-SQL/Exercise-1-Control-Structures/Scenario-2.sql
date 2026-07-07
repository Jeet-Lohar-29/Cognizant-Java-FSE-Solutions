/*
=========================================================
 Exercise 1 - Control Structures
 Scenario 2

 Mark customers as VIP
 if balance exceeds 10000.
=========================================================
*/

BEGIN

    FOR customer_rec IN (
        SELECT CustomerID,
               Name,
               Balance
        FROM Customers
    )
    LOOP

        IF customer_rec.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = customer_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                customer_rec.Name ||
                ' promoted to VIP.'
            );

        END IF;

    END LOOP;

    COMMIT;

END;
/