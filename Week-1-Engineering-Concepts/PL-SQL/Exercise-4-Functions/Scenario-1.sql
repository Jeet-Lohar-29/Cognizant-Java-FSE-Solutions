/*
=========================================================
 Exercise 4 - Functions
 Scenario 1

 Calculate customer age.
=========================================================
*/

CREATE OR REPLACE FUNCTION CalculateAge (

    p_DOB IN DATE

)
RETURN NUMBER
IS

    v_Age NUMBER;

BEGIN

    v_Age := FLOOR(MONTHS_BETWEEN(SYSDATE, p_DOB) / 12);

    RETURN v_Age;

END;
/