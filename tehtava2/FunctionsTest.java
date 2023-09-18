package koodauskoe.tehtava2;

import org.junit.Assert;
import org.junit.jupiter.api.*;

public class FunctionsTest {

    @Test
    void testGetShortestGapWithEmptyArray() {
        int[] array = new int[0];
        Assert.assertEquals(0, Functions.getShortestGap(array));
    }

    @Test
    void testGetShortestGapWithSingleNumberArray() {
        int[] array = new int[1];
        array[0] = 5;
        Assert.assertEquals(0, Functions.getShortestGap(array));
    }

    @Test
    void testGetShortestGapWithMultipleNumbersArray() {
        int[] array = new int[3];
        array[0] = 4;
        array[1] = 10;
        array[2] = 1;
        Assert.assertEquals(2, Functions.getShortestGap(array));
    }

    @Test
    void testGetShortestGapWithSimilarGapsArray() {
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 5;
        array[2] = 1;
        Assert.assertEquals(1, Functions.getShortestGap(array));
    }

    
}
