import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorModelTest {
    private CalculatorModel model;

    @BeforeEach
    void setUp() {
        model = new CalculatorModel();
    }

    @Test
    void testAddDigits() {
        model.addDigit(1);
        model.addDigit(2);
        assertEquals("12", model.getDisplay().replaceAll("\\.0$", ""));
    }

    @Test
    void testSum() {
        model.addDigit(5);
        model.setOperationSum();
        model.addDigit(3);
        model.calculateResult();
        assertEquals("8", model.getDisplay().replaceAll("\\.0$", ""));
    }

    // Otros tests: factorial, potencia, circunferencia, etc.
}