/**
 * Logger class implemented using Singleton Design Pattern.
 * Only one object of this class can be created.
 */
public class Logger {

    // Stores the only instance of Logger
    private static Logger instance;

    // Private constructor prevents object creation using 'new'
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Returns the single Logger instance
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}