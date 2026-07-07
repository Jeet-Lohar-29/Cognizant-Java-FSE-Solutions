import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    Calculator calculator = new Calculator();

    @Test
    @Order(1)
    void testAddition() {

        assertEquals(15, calculator.add(10, 5));

    }

    @Test
    @Order(2)
    void testSubtraction() {

        assertEquals(5, calculator.subtract(10, 5));

    }

    @Test
    @Order(3)
    void testAnotherAddition() {

        assertEquals(20, calculator.add(15, 5));

    }

}