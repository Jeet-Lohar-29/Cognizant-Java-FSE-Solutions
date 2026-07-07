/*
=========================================================
 Exercise 3 - Stored Procedures
 Scenario 1

 Process monthly interest for all savings accounts.
=========================================================
*/

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS

    v_InterestRate NUMBER := 0.01;

BEGIN

    UPDATE Accounts
    SET Balance = Balance + (Balance * v_InterestRate)
    WHERE AccountType = 'Savings';

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Monthly interest processed successfully.'
    );

EXCEPTION

    WHEN OTHERS THEN

        ROLLBACK;

        DBMS_OUTPUT.PUT_LINE(
            'Error : ' || SQLERRM
        );

END;
/