import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {

        Calculator calculator = new Calculator();

        assertEquals(10, calculator.add(4, 6));

    }

}