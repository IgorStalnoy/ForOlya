package org.example.homework2.task5;

import java.util.Scanner;

public class Utils {
    public static int inputValuesScanning(Scanner scanner, String side) {
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
