/*
=========================================================
 Exercise 2 - Error Handling
 Scenario 2

 Update employee salary with exception handling.
=========================================================
*/

CREATE OR REPLACE PROCEDURE UpdateSalary (

    p_EmployeeID   IN NUMBER,
    p_Percentage   IN NUMBER

)
IS

    v_Count NUMBER;

BEGIN

    SELECT COUNT(*)
    INTO v_Count
    FROM Employees
    WHERE EmployeeID = p_EmployeeID;

    IF v_Count = 0 THEN

        RAISE_APPLICATION_ERROR(
            -20002,
            'Employee ID does not exist.'
        );

    END IF;

    UPDATE Employees
    SET Salary = Salary + (Salary * p_Percentage / 100)
    WHERE EmployeeID = p_EmployeeID;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Salary updated successfully.'
    );

EXCEPTION

    WHEN OTHERS THEN

        ROLLBACK;

        DBMS_OUTPUT.PUT_LINE(
            'Error : ' || SQLERRM
        );

END;
/