/*
=========================================================
 Exercise 4 - Functions
 Scenario 3

 Check sufficient account balance.
=========================================================
*/

CREATE OR REPLACE FUNCTION HasSufficientBalance (

    p_AccountID IN NUMBER,
    p_Amount    IN NUMBER

)
RETURN BOOLEAN
IS

    v_Balance NUMBER;

BEGIN

    SELECT Balance
    INTO v_Balance
    FROM Accounts
    WHERE AccountID = p_AccountID;

    IF v_Balance >= p_Amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;

EXCEPTION

    WHEN NO_DATA_FOUND THEN
        RETURN FALSE;

END;
/