/*
=========================================================
 Exercise 3 - Stored Procedures
 Scenario 3

 Transfer funds between two accounts.
=========================================================
*/

CREATE OR REPLACE PROCEDURE TransferFunds (

    p_FromAccount   IN NUMBER,
    p_ToAccount     IN NUMBER,
    p_Amount        IN NUMBER

)
IS

    v_Balance NUMBER;

BEGIN

    SELECT Balance
    INTO v_Balance
    FROM Accounts
    WHERE AccountID = p_FromAccount;

    IF v_Balance < p_Amount THEN

        RAISE_APPLICATION_ERROR(
            -20004,
            'Insufficient balance.'
        );

    END IF;

    UPDATE Accounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_FromAccount;

    UPDATE Accounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_ToAccount;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Fund transfer completed successfully.'
    );

EXCEPTION

    WHEN OTHERS THEN

        ROLLBACK;

        DBMS_OUTPUT.PUT_LINE(
            'Error : ' || SQLERRM
        );

END;
/