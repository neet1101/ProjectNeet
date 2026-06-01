import com.mycompany.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

   @Test
    void testDivideTwoNumbers() {
        Calculator c = new Calculator();
        assertEquals(2.0, c.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        Calculator c = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> c.divide(4, 0));
    }
    @Test
    void testMultiplyTwoNumbers() {
        Calculator c = new Calculator();
        assertEquals(12.0, c.multiply(3, 4));
    }
}