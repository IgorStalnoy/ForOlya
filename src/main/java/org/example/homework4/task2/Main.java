package org.example.homework4.task2;

//Создайте переменную для массива из 10 элементов(другим способом).
//Заполните его произвольными значениями целочисленного типа и выведите на экран элементы, стоящие на чётных позициях.

import org.example.homework4.Utils;

public class Main {

    public static void main(String[] args) {

        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Utils.fillArrayWithRandomNumbers(array);
        printArrayEvenElements(array);

    }

    public static void printArrayEvenElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

}
