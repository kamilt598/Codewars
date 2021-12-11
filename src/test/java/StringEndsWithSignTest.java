import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringEndsWithSignTest {
    @Test
    public void stringEnds() throws Exception {
        assertEquals(true, StringEndsWithSign.stringEnds("abc", "bc"));
        assertEquals(false, StringEndsWithSign.stringEnds("abc", "d"));
    }

}