/*
=========================================================
 Exercise 3 - Stored Procedures
 Scenario 2

 Update employee salary by bonus percentage
 for a given department.
=========================================================
*/

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (

    p_Department      IN VARCHAR2,
    p_BonusPercentage IN NUMBER

)
IS

BEGIN

    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercentage / 100)
    WHERE Department = p_Department;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Employee bonus updated successfully.'
    );

EXCEPTION

    WHEN OTHERS THEN

        ROLLBACK;

        DBMS_OUTPUT.PUT_LINE(
            'Error : ' || SQLERRM
        );

END;
/