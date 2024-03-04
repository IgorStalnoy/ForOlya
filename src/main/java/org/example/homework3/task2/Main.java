package org.example.homework3.task2;

//Вычислить поризведение числдео от 1 до 25 с помощью do while

public class Main {

    public static final int FIRST_NUMBER = 1;
    public static final int LAST_NUMBER = 25;

    public static void main(String[] args) {

        System.out.println(multiplicationFromAndUntilInputtedNumbers(FIRST_NUMBER, LAST_NUMBER));

    }

    public static int multiplicationFromAndUntilInputtedNumbers(int firstNumber, int lastNumber) {
        int result = 1;
        do {
            result = result * firstNumber;
            firstNumber++;
        } while (firstNumber <= lastNumber);
        return result;
    }

}
