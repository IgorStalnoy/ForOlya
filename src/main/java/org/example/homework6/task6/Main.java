package org.example.homework6.task6;

/** Напишите два цикла выполняющих миллион сложений строк вида "aaabbbccc", один с помощью оператора сложения String, а другой с помощью StringBuilder
 *  и метода append. Сравните скорость их выполнения. Выведите сравнение на экран.
 */

public class Main {

    public static final String TEXT_TO_APPEND = "aaabbbccc ";

    public static void main(String[] args) {

        System.out.println(stringAppend() + " milliseconds for String concatenation");
        System.out.println(stringBuilderAppend() + " milliseconds for StringBuilder concatenation");

    }

    public static long stringAppend () {
        long startTime = System.currentTimeMillis();
        String text = "";
        for (int i = 1;i < 1000000;i++) {
            text.concat(TEXT_TO_APPEND);
        }
        return (System.currentTimeMillis() - startTime);
    }

    public static long stringBuilderAppend () {
        long startTime = System.currentTimeMillis();
        StringBuilder text = new StringBuilder();
        text.append(TEXT_TO_APPEND.repeat(999999));
        return (System.currentTimeMillis() - startTime);
    }

}
