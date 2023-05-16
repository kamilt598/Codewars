import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReturningStringsTest {
    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", ReturningStrings.greet("Ryan"));
    }
}