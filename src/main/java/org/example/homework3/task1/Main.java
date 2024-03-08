package org.example.homework3.task1;

//Вычислить факториал целых чисел от 0 до 10 с помощью цикла while

public class Main {
    public static final int MAX_NUMBER_FACTORIAL = 10;

    public static void main(String[] args) {

        printFactorialCalculation(MAX_NUMBER_FACTORIAL);

    }

    public static void printFactorialCalculation(int maxNumberFactorial) {
        int number = 1;
        System.out.println("0! = 1");
        while (number <= maxNumberFactorial) {
            int i = 1;
            int factorial = 1;
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }
            System.out.println(number + "! = " + factorial);
            number++;
        }
    }
}