package org.example.homework4.task4;

//Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
//Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
//Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.

import org.example.homework4.utils.Utils;

public class Main {
    public static int ARRAY_LENGTH = 10;

    public static void main(String[] args) {

        int[] array = new int[ARRAY_LENGTH];
        Utils.fillArrayWithRandomNumbers(array);
        printSumOfMaxAndMinArrayIndexes(array);

    }

    public static void printSumOfMaxAndMinArrayIndexes(int[] array) {
        int minValue = array[0];
        int[] minValueIndexes = new int[array.length];
        int minValuePosition = 0;
        int minValuesCount = 0;
        int maxValue = array[0];
        int[] maxValueIndexes = new int[array.length];
        int maxValueIndexesPosition = 0;
        int maxValuesCount = 0;
        for (int j : array) {
            if (j > maxValue) {
                maxValue = j;
            }
            if (j < minValue) {
                minValue = j;
            }
        }
        for (int i = 0;i < array.length;i++) {
            if (array[i] == maxValue) {
                maxValueIndexes[maxValueIndexesPosition] = i;
                maxValueIndexesPosition++;
                maxValuesCount++;
            }
            if (array[i] == minValue) {
                minValueIndexes[minValuePosition] = i;
                minValuePosition++;
                minValuesCount++;
            }
        }
        int maxValuesMaxIndex = maxValueIndexes[maxValuesCount -1];
        int maxValuesMinIndex = maxValueIndexes[0];
        int minValuesMaxIndex = minValueIndexes[minValuesCount - 1];
        int minValuesMinIndex = minValueIndexes[0];
        int maxValueEdgePosition;
        int minValueEdgePosition;
        if (maxValuesMaxIndex - minValuesMinIndex >= minValuesMaxIndex - maxValuesMinIndex) {
            maxValueEdgePosition = maxValuesMaxIndex;
            minValueEdgePosition = minValuesMinIndex;
        } else {
            maxValueEdgePosition = minValuesMaxIndex;
            minValueEdgePosition = maxValuesMinIndex;
        }
        int sumOfDigits = 0;
        if (Math.abs(maxValueEdgePosition - minValueEdgePosition) >= 1) {
            for (int i = Math.min(maxValueEdgePosition, minValueEdgePosition) + 1;i < Math.max(maxValueEdgePosition, minValueEdgePosition);i++) {
                sumOfDigits = sumOfDigits + array[i];
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\nSum of digits between edge values : " + sumOfDigits);

    }

}
