/*
=========================================================
 Exercise 6 - Cursors
 Scenario 2

 Apply annual maintenance fee.
=========================================================
*/

DECLARE

    CURSOR ApplyAnnualFee IS

        SELECT
            AccountID,
            Balance

        FROM Accounts;

    v_Account ApplyAnnualFee%ROWTYPE;

    v_Fee NUMBER := 500;

BEGIN

    OPEN ApplyAnnualFee;

    LOOP

        FETCH ApplyAnnualFee INTO v_Account;

        EXIT WHEN ApplyAnnualFee%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - v_Fee
        WHERE AccountID = v_Account.AccountID;

    END LOOP;

    CLOSE ApplyAnnualFee;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Annual maintenance fee applied successfully.'
    );

END;
/