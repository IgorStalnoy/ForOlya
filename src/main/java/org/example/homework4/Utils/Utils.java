package org.example.homework4.Utils;

import java.util.Random;

public final class Utils {
    public final static Random RANDOM = new Random();

    private Utils() {
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(100) + 1;
        }
    }

}
