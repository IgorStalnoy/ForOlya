package org.example.homework4.task1;

//Создайте переменнную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.

import org.example.homework4.Utils.Utils;

public class Main {

    public static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {

        int[] array = new int[ARRAY_LENGTH];
        Utils.fillArrayWithRandomNumbers(array);
        System.out.println(array[array.length - 1]);

    }

}
