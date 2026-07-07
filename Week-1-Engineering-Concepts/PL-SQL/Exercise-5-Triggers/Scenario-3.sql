/*
=========================================================
 Exercise 5 - Triggers
 Scenario 3

 Enforce business rules on deposits
 and withdrawals.
=========================================================
*/

CREATE OR REPLACE TRIGGER CheckTransactionRules

BEFORE INSERT
ON Transactions

FOR EACH ROW

DECLARE

    v_Balance NUMBER;

BEGIN

    SELECT Balance
    INTO v_Balance
    FROM Accounts
    WHERE AccountID = :NEW.AccountID;

    IF :NEW.TransactionType = 'Withdrawal' THEN

        IF :NEW.Amount > v_Balance THEN

            RAISE_APPLICATION_ERROR(
                -20005,
                'Withdrawal amount exceeds account balance.'
            );

        END IF;

    ELSIF :NEW.TransactionType = 'Deposit' THEN

        IF :NEW.Amount <= 0 THEN

            RAISE_APPLICATION_ERROR(
                -20006,
                'Deposit amount must be positive.'
            );

        END IF;

    END IF;

END;
/