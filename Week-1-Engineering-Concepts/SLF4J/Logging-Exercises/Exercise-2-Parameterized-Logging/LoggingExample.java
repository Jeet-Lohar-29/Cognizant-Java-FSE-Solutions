import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        String name = "Jeet Lohar";
        int age = 21;

        logger.info("User Name: {}", name);

        logger.info("User Name: {}, Age: {}", name, age);

    }
}