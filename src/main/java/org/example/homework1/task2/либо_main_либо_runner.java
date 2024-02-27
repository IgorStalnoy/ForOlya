package org.example.homework1.task2;

//Написать какой то там метод с математикой
public class либо_main_либо_runner {

    public static void main(String[] args) {

        final int FIRST_NUMBER = 7;
        final int SECOND_NUMBER = 4;

        System.out.println(sumOfSumAndMultiplication(FIRST_NUMBER, SECOND_NUMBER));
    }

    public static int sumOfSumAndMultiplication(int a, int b) {
        return (a + b) + (a * b);
    }
}
