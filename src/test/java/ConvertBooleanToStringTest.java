import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertBooleanToStringTest {
    @Test
    void testTrue() {
        assertEquals("true", ConvertBooleanToString.convert(true));
    }

    @Test
    void testFalse() {
        assertEquals("false", ConvertBooleanToString.convert(false));
    }

}