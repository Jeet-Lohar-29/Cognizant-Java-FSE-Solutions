/**
 * Demonstrates Employee Management System.
 */
public class EmployeeManagementDemo {

    public static void main(String[] args) {

        EmployeeManagementSystem system =
                new EmployeeManagementSystem(10);

        system.addEmployee(
                new Employee(101, "Jeet Lohar", "Software Engineer", 85000));

        system.addEmployee(
                new Employee(102, "Rahul Sharma", "QA Engineer", 65000));

        system.addEmployee(
                new Employee(103, "Priya Singh", "Project Manager", 110000));

        system.displayEmployees();

        System.out.println("Searching Employee...\n");

        Employee employee = system.searchEmployee(102);

        if (employee != null)
            System.out.println(employee);
        else
            System.out.println("Employee Not Found.");

        System.out.println();

        system.deleteEmployee(102);

        system.displayEmployees();

    }

}