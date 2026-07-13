package com.cognizant.hibernateannotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cognizant.hibernateannotation.model.Employee;

public class ManageEmployee {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = null;

        try {

            tx = session.beginTransaction();

            Employee emp = new Employee(
                    "John",
                    "Smith",
                    50000
            );

            session.persist(emp);

            tx.commit();

            System.out.println("=================================");
            System.out.println("Employee inserted successfully!");
            System.out.println("Generated Employee ID : " + emp.getId());
            System.out.println("=================================");

        } catch (Exception e) {

            if (tx != null)
                tx.rollback();

            e.printStackTrace();

        } finally {

            session.close();
            factory.close();

        }

    }

}