import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfDigitsTest {
    @Test
    public void test1() {
        assertEquals(7, SumOfDigits.sum(16));
    }

    @Test
    public void test2() {
        assertEquals(6, SumOfDigits.sum(456));
    }
}