import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator( 8, 2 );
    }

    @Test
    public void add() {
        assertEquals(10, calculator.add());
    }

    @Test
    public void subtract() {
        assertEquals(6, calculator.subtract());
    }

    @Test
    public void multiply() {
        assertEquals(16, calculator.multiply());
    }

    @Test
    public void divide() {
        assertEquals(4, calculator.divide());
    }

}
