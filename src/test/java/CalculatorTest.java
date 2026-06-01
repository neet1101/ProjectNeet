import com.mycompany.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testDivideNumbers() {
        Calculator c = new Calculator();

        assertEquals(2, c.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        Calculator c = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            c.divide(4, 0);
        });
    }
}