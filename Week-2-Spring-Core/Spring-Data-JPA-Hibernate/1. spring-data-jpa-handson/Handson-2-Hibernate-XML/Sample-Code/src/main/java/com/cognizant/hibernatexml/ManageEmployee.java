package com.cognizant.hibernatexml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ManageEmployee {

    private static SessionFactory factory;

    public static void main(String[] args) {

        try {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed.");
            throw new ExceptionInInitializerError(ex);
        }

        ManageEmployee me = new ManageEmployee();

        Integer empId1 = me.addEmployee("Zara", "Ali", 1000);
        Integer empId2 = me.addEmployee("Daisy", "Das", 5000);
        Integer empId3 = me.addEmployee("John", "Paul", 10000);

        me.listEmployees();

        me.updateEmployee(empId1, 5000);

        me.deleteEmployee(empId2);

        me.listEmployees();
    }

    public Integer addEmployee(String fname, String lname, int salary) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Employee employee = new Employee();

        employee.setFirstName(fname);
        employee.setLastName(lname);
        employee.setSalary(salary);

        Integer employeeID = (Integer) session.save(employee);

        tx.commit();

        session.close();

        return employeeID;
    }

    public void listEmployees() {

        Session session = factory.openSession();

        List<Employee> employees = session.createQuery("FROM Employee", Employee.class).list();

        for (Employee employee : employees) {

            System.out.println(
                    "First Name: " + employee.getFirstName()
                            + " Last Name: " + employee.getLastName()
                            + " Salary: " + employee.getSalary());

        }

        session.close();
    }

    public void updateEmployee(Integer employeeID, int salary) {

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Employee employee = session.get(Employee.class, employeeID);

        employee.setSalary(salary);

        session.update(employee);

        tx.commit();

        session.close();
    }

    public void deleteEmployee(Integer employeeID) {

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Employee employee = session.get(Employee.class, employeeID);

        session.delete(employee);

        tx.commit();

        session.close();
    }
}