package org.example.homework4.Utils;

public class Utils {

    public static void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
    }

}
