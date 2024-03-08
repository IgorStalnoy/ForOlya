package org.example.homework3.task5;

//Для целых чисел, которые делятся на 7 без остатка в диапазоне от 1 до 100, вывести на экран строку "Hope!"

public class Main {

    public final static int FIRST_NUMBER = 1;
    public final static int LAST_NUMBER = 100;
    public final static String TEXT = "Hope!";

    public static void main(String[] args) {

        printTextOfDivisionOnSevenNumbers(FIRST_NUMBER, LAST_NUMBER, TEXT);

    }

    public static void printTextOfDivisionOnSevenNumbers (int firstNumber, int lastNumber, String printingText) {
        do {
            if (firstNumber % 7 == 0) {
                System.out.println("Number " + firstNumber + " - " + printingText);
            }
            firstNumber++;
        } while (firstNumber <= lastNumber);
    }

}
