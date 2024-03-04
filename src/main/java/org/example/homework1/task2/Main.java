package org.example.homework1.task2;

//Написать какой то там метод с математикой
public class Main {

    public static final int FIRST_NUMBER = 7;
    public static final int SECOND_NUMBER = 4;

    public static void main(String[] args) {

        System.out.println(calculateSumOfSumAndMultiplication(FIRST_NUMBER, SECOND_NUMBER));
    }

    public static int calculateSumOfSumAndMultiplication(int a, int b) {
        return (a + b) + (a * b);
    }
}
