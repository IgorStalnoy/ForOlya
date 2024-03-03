package org.example.homework3.task3;

//Посчитать сумму цифр числа 7893823445 с помощью цикла do while

public class Main {
    public static final long NUMBER = 7893823445L;

    public static void main(String[] args) {

        System.out.println("Sum of digits of " + NUMBER + " = " + calculatingSumOfDigits(NUMBER));

    }

    public static long calculatingSumOfDigits(long number) {
        long sum = 0;
        if (number / 10 == 0) {
            return number % 10;
        } else {
            do {
                sum = sum + number % 10;
                number = number / 10;
            } while (number != 0);
        } return sum;
    }
}
