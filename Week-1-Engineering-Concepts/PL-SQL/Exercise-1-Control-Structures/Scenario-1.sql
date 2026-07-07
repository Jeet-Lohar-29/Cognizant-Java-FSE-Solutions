/*
=========================================================
 Exercise 1 - Control Structures
 Scenario 1

 Apply a 1% discount to loan interest rates
 for customers above 60 years of age.
=========================================================
*/

DECLARE

    v_age NUMBER;

BEGIN

    FOR customer_rec IN (
        SELECT CustomerID, Name, DOB
        FROM Customers
    )
    LOOP

        -- Calculate age
        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, customer_rec.DOB) / 12);

        -- Check if customer is above 60
        IF v_age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                customer_rec.Name ||
                ' (Age: ' || v_age ||
                ') received a 1% interest discount.'
            );

        END IF;

    END LOOP;

    COMMIT;

END;
/