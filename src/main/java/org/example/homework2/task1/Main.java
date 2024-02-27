package org.example.homework2.task1;

//Создайте метод с одним целочисленным параметром. Метод должен определить, является ли последняя цифра числа семёркой и вернуть boolean значение.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please, input a number: ");
        System.out.println(isLastDigitSeven(in.nextInt()));

    }

    public static boolean isLastDigitSeven(int inputNumber) {
        return Math.abs(inputNumber) % 10 == 7;
    }

}
