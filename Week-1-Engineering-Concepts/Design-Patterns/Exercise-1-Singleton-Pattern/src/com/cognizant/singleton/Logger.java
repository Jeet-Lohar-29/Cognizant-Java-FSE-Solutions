package com.cognizant.singleton;

/**
 * Logger class implemented using the Singleton Design Pattern.
 * Ensures that only one instance of Logger exists throughout
 * the application lifecycle.
 */
public class Logger {

    // Static variable to hold the single instance
    private static Logger instance;

    /**
     * Private constructor prevents direct instantiation.
     */
    private Logger() {
        System.out.println("Logger instance created.");
    }

    /**
     * Returns the single instance of Logger.
     *
     * @return Logger instance
     */
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    /**
     * Logs a message to the console.
     *
     * @param message Message to be logged
     */
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}