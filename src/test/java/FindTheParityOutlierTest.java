import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheParityOutlierTest {
    @Test
    public void testExample() {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        assertEquals(3, FindTheParityOutlier.find(exampleTest1));
        assertEquals(206847684, FindTheParityOutlier.find(exampleTest2));
        assertEquals(0, FindTheParityOutlier.find(exampleTest3));
    }

}