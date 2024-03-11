package org.example.homework6.task4;


import org.example.homework6.utils.Utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке шеснадцатеричных чисел, записанных по правилам Java, с помощью регулярных выражений.
 * Результат работы метода выведите на экран.
 */

public class Main {

    public static final Pattern HEXADECIMAL_NUMBERS_PATTERN = Pattern.compile("0x[\\dabcdefABCDEF]+");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = Utils.consoleScanner(scanner);
        System.out.println(findHexadecimal(text));

    }

    public static String findHexadecimal(String text) {
        StringBuilder result = new StringBuilder();
        Matcher matcher = HEXADECIMAL_NUMBERS_PATTERN.matcher(text);
        while (matcher.find()) {
            result.append(matcher.group()).append(" ");
        }
        return result.toString();
    }

}

