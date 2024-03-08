package org.example.homework3.utils;

import java.util.Scanner;

public class Utils {
    public static int inputValueScan(Scanner scanner) {
        int inputNumber = 0;
        boolean validValue;
        System.out.println("Please input a sum to withdraw");
        do {
            validValue = scanner.hasNextInt();
            if (!validValue) {
                System.out.println("Not a number, please input a number");
                scanner.nextLine();
            } else {
                inputNumber = scanner.nextInt();
            }
        } while (!validValue);
        return inputNumber;
    }
}
