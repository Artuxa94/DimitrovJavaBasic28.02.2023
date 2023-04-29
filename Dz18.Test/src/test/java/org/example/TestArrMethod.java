package org.example;


import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class TestArrMethod {
    @Test
    public void testAverege() {
        int[] arr = {5,5,5};
        double expected = 5.0;
        double actual = ArrMethod.averege(arr);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testTrueSquare () {
        int[][] arr = new int[2][2];
        Assert.assertTrue(ArrMethod.itSquare(arr));
    }
    @Test
    public void testFalseSquare() {
        int[][] arr = new int[2][3];
        Assert.assertFalse(ArrMethod.itSquare(arr));
    }
}
