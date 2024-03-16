package org.example.homework6.task2;

import org.example.homework6.utils.Utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Введите с клавиатуры текст. Подсчитать кол-во слов в тексте. Учесть, что слова могут разделяться несколькими пробелами,
 * в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */

public class Main {

    public final static String WORDS_COUNT_PATTERN = "(\\w+'\\w)|(\\w+)";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = Utils.consoleScanner(scanner);
        Pattern pattern = Pattern.compile(WORDS_COUNT_PATTERN);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        System.out.println();
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            count++;
        }
        System.out.println("\n There are " + count + " words in the text.");
    }

}
