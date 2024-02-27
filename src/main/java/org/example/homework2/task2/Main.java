package org.example.homework2.task2;

//Имеется прямоугольное отверстие размерами a и b, где a и b - целые числа. Определить, можно ли его полностью закрыть картонкой радиусом r (тоже целое число).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, r;
        Scanner in = new Scanner(System.in);
        System.out.print("Please, input a rectangle first side: ");
        a = in.nextInt();
        System.out.print("Please, input a rectangle second side: ");
        b = in.nextInt();
        System.out.print("Please, input a circle radius: ");
        r = in.nextInt();
        System.out.println("Does the circle cover the rectangle? - " + isCircleCoverRectangle(a,b,r));

    }

    public static boolean isCircleCoverRectangle(int a, int b, int r) {
        double hypotenuse = Math.sqrt((a * a) + (b * b));
        return hypotenuse <= r;
    }
}
