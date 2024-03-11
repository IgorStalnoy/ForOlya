package org.example.homework6.utils;

import java.util.Scanner;

public final class Utils {

    private Utils() {
    }

    public static String consoleScanner(Scanner scanner) {
        StringBuilder stringBuilder = new StringBuilder();
        String text2 = " ";
        while (text2.length() > 0) {
            text2 = scanner.nextLine();
            stringBuilder.append(text2).append("\n");
        }
        return stringBuilder.toString();
    }
}