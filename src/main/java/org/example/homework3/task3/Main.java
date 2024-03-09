package org.example.homework3.task3;

//Посчитать сумму цифр числа 7893823445 с помощью цикла do while

public class Main {
    public static final long NUMBER = 4;

    public static void main(String[] args) {

        System.out.println("Sum of digits of " + NUMBER + " = " + calculateSumOfDigits(NUMBER));

    }

    public static long calculateSumOfDigits(long number) {
        long sum = 0;
        do {
            sum = sum + number % 10;
            number = number / 10;
        } while (number != 0);
        return sum;
    }
}
