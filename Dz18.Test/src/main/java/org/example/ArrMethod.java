package org.example;

public class ArrMethod {

    public static double averege (int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
           sum += array[i];
        }
        return sum / array.length;
    }
    public static boolean itSquare (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array.length) {
                return false;
            }
        }
        return true;
    }
}
