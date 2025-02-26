import static org.junit.jupiter.api.Assertions.*;

public class SumNumbersTest {
    @org.junit.jupiter.api.Test
    void sumIsEven() {
        SumNumbers test = new SumNumbers();
        int result = test.sumIsEven(1,1);
        assertEquals(1,result);
    }

    @org.junit.jupiter.api.Test
    void sumIsEven2() {
        SumNumbers test = new SumNumbers();
        int result = test.sumIsEven(1,2);
        assertEquals(0,result);
    }
}
