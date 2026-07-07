/*
=========================================================
 Exercise 2 - Error Handling
 Scenario 1

 Transfer funds safely between two accounts.
=========================================================
*/

CREATE OR REPLACE PROCEDURE SafeTransferFunds (

    p_FromAccount   IN NUMBER,
    p_ToAccount     IN NUMBER,
    p_Amount        IN NUMBER

)
IS

    v_Balance NUMBER;

BEGIN

    -- Get current balance
    SELECT Balance
    INTO v_Balance
    FROM Accounts
    WHERE AccountID = p_FromAccount;

    -- Check sufficient balance
    IF v_Balance < p_Amount THEN

        RAISE_APPLICATION_ERROR(
            -20001,
            'Insufficient Funds.'
        );

    END IF;

    -- Debit source account
    UPDATE Accounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_FromAccount;

    -- Credit destination account
    UPDATE Accounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_ToAccount;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Fund Transfer Successful.'
    );

EXCEPTION

    WHEN OTHERS THEN

        ROLLBACK;

        DBMS_OUTPUT.PUT_LINE(
            'Transfer Failed : '
            || SQLERRM
        );

END;
/