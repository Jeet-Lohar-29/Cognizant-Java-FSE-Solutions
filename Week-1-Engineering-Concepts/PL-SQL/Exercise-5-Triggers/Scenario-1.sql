/*
=========================================================
 Exercise 5 - Triggers
 Scenario 1

 Update LastModified automatically whenever
 a customer record is updated.
=========================================================
*/

CREATE OR REPLACE TRIGGER UpdateCustomerLastModified

BEFORE UPDATE
ON Customers

FOR EACH ROW

BEGIN

    :NEW.LastModified := SYSDATE;

END;
/