import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CalculatorTests {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(6, 4);
        assertEquals(10, result);
    }

    @Test
    public void testSum2() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(22, 2);
        assertEquals(20, result);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(10, 3);
        assertEquals(30, result);
    }

    @Test
    public void testDivison() {
        try {
            Calculator calculator = new Calculator();
            int result = calculator.divison(80, 2);
            assertEquals(40, result);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Test(expected = Exception.class)
    public void testDivisionException() throws Exception {
        Calculator calculator = new Calculator();
        calculator.divison(10, 0);
    }
}
