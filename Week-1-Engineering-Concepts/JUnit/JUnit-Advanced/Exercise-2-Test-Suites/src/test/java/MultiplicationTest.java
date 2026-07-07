import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {

    Calculator calculator = new Calculator();

    @Test
    void testMultiplication() {

        assertEquals(30, calculator.multiply(5, 6));

    }

}