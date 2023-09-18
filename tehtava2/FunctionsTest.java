package koodauskoe.tehtava2;

import org.junit.Assert;
import org.junit.jupiter.api.*;

public class FunctionsTest {

    @Test
    void testGetShortestGapWithEmptyArray() {
        int[] array = new int[0];
        Assert.assertEquals(0, Functions.getShortestGap(array));
    }

    
}
