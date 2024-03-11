package org.example.homework6.task5;

/**
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке всех тэгов абзацев,
 * в том числе тех, у которых есть параметры,например <pid="p1">, и замену их на простые тэги абзацев <p>. Результат работы метода выведите на экран.
 */

import org.example.homework6.utils.Utils;

import java.util.Scanner;

public class Main {

    public static final String OPEN_TAG_PATTERN = "<p.{1,10}\">";
    public static final String CLOSE_TAG_PATTERN = "<\\\\.{1,10}>";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = Utils.consoleScanner(scanner);
        System.out.println(tagReplace(text));

    }

    public static String tagReplace(String text) {
        return text.replaceAll(OPEN_TAG_PATTERN, "<p>").replaceAll(CLOSE_TAG_PATTERN, "<\\\\p>");
    }

}
