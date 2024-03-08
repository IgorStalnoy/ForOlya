package org.example.homework3.task2;

//Вычислить поризведение числдео от 1 до 25 с помощью do while

public class Main {

    public static final long FIRST_NUMBER = 1L;
    public static final long LAST_NUMBER = 25L;

    public static void main(String[] args) {

        System.out.println(multiplicationFromAndUntilInputtedNumbers(FIRST_NUMBER, LAST_NUMBER));

    }

    public static long multiplicationFromAndUntilInputtedNumbers(long firstNumber, long lastNumber) {
        long result = 1L;
        do {
            result = result * firstNumber;
            firstNumber++;
        } while (firstNumber <= lastNumber);
        return result;
    }


}
