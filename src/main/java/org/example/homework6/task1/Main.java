package org.example.homework6.task1;

/**
 * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их кол-во.
 */

import org.example.homework6.utils.Utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public final static Pattern PUNCTUATION_MARKS_PATTERN = Pattern.compile(("\\p{P}"));

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = Utils.consoleScanner(scanner);
        Matcher matcher = PUNCTUATION_MARKS_PATTERN.matcher(text);
        int count = 0;
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            count++;
        }
        System.out.println("\nThere are " + count + " matches.");
    }

}

