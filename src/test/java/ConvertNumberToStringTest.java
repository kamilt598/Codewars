import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertNumberToStringTest {
    @Test
    public void tests() {
        assertEquals("67", ConvertNumberToString.numberToString(67));
        assertEquals("123", ConvertNumberToString.numberToString(123));
        assertEquals("999", ConvertNumberToString.numberToString(999));
    }

}