package org.example.homework2.task5;

//Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещаются ли эти дома на данном участке.
// Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = inputValuesScanner(scanner, "a");
        int b = inputValuesScanner(scanner, "b");
        int c = inputValuesScanner(scanner, "c");
        int d = inputValuesScanner(scanner, "d");
        int e = inputValuesScanner(scanner, "e");
        int f = inputValuesScanner(scanner, "f");
        if (buildingPlacementValidator(a,b,c,d,e,f)) {
            System.out.println("Buildings can be placed into the area");
        } else {
            System.out.println("Buildings can not be placed into the area");
        }
    }

    public static boolean buildingPlacementValidator(int a, int b, int c, int d, int e, int f) {
        return (a + c <= e && b + d <= f) || (a + d <= e && b + c <= f) || (b + d <= e && a + c <= f) || (b + c <= e && a + d <= f);
    }

    public static int inputValuesScanner(Scanner scanner, String side) {
        int sideLength = 0;
        boolean validValue;
        System.out.println("Please input length of side " + side);
        do {
            validValue = scanner.hasNextInt();
            if (!validValue) {
                System.out.println("Not a number, please input a number");
                scanner.nextLine();
            } else {
                sideLength = scanner.nextInt();
                if (sideLength < 1) {
                    validValue = false;
                    System.out.println("Number should be bigger then 0");
                    scanner.nextLine();
                }
            }
        } while (!validValue);
        return sideLength;
    }
}
