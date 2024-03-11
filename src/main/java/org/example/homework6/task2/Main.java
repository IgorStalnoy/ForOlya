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

    public static Pattern WORDS_COUNT_PATTERN = Pattern.compile("(\\w+'\\w)|(\\w+)");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = Utils.consoleScanner(scanner);
        Matcher matcher = WORDS_COUNT_PATTERN.matcher(text);
        int count = 0;
        System.out.println();
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            count++;
        }
        System.out.println("\n There are " + count + " words in the text.");
    }

}
