package com.cognizant.singleton;

/**
 * Demonstrates the Singleton Design Pattern.
 */
public class SingletonDemo {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in.");

        System.out.println();
        System.out.println("Logger 1 HashCode : " + logger1.hashCode());
        System.out.println("Logger 2 HashCode : " + logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("\nBoth logger objects refer to the same instance.");
        } else {
            System.out.println("\nDifferent Logger instances created.");
        }
    }
}