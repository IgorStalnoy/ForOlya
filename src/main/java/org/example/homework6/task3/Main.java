package org.example.homework6.task3;

import org.example.homework6.utils.Utils;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Введите с клавиатуры текст. Выведите на экран текст, составленный их последних букв всех слов из исходного текста.
 */

public class Main {

    public final static String LAST_LETTERS_PATTERN = "\\w\\b";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = Utils.consoleScanner(scanner);
        Pattern pattern = Pattern.compile(LAST_LETTERS_PATTERN);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
