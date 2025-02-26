import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TipCalculatorTest {
    @Test
    void calculateTip() {
        TipCalculator test = new TipCalculator();
        double result = test.calculateTip(100,20);
        assertEquals(20,result);
    }

    @Test
    void calculateTip2() {
        TipCalculator test = new TipCalculator();
        double result = test.calculateTip(50,50);
        assertEquals(25,result);
    }
}
