import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MultiplesOf3And5Test {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3And5().solution(10));
    }

}