package org.example.homework4.task5;

//Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа. Выведите на экран, переверните и снова
//выведите на экран(при переворачивании нежелательно создавать ещё один массив).

import org.example.homework4.Utils.Utils;

public class Main {

    public static int ARRAY_LENGTH = 10;

    public static void main(String[] args) {

        int[] array = new int[ARRAY_LENGTH];
        Utils.fillArrayWithRandomNumbers(array);
        printInvertedArray(array);

    }

    public static void printInvertedArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

}
