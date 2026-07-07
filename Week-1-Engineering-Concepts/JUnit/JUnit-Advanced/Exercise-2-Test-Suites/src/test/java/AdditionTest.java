import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {

        assertEquals(15, calculator.add(10, 5));

    }

}