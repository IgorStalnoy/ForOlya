package org.example.homework4.task3;

//Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
//Найдите максимальный элемент и выведите его индекс.

import org.example.homework4.Utils;

public class Main {
    public static int ARRAY_LENGTH = 10;

    public static void main(String[] args) {

        int[] array = new int[ARRAY_LENGTH];
        Utils.fillArrayWithRandomNumbers(array);
        printArrayMaxNumberIndex(array);

    }

    public static void printArrayMaxNumberIndex(int[] array) {
        int maxNumberIndex = 0;
        int maxNumber = array[0];
        for (int i = 0;i < array.length;i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                maxNumberIndex = i;
            }
        }
        System.out.println("Max number : " + maxNumber + "\nMax number index : " + maxNumberIndex);
    }

}
