package org.example.homework2.task3;

//Задать целое число в виде переменной, это число - сумма денег в рублях. Вывести это число на экран, добавив к нему слово "рублей" в правильном падеже.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please, input a money sum: ");
        int sum = in.nextInt();
        System.out.println(sum + generateCorrectCaseOfRoubleCurrency(sum));
    }

    public static String generateCorrectCaseOfRoubleCurrency(int sum) {
        if (sum % 10 == 0 || sum % 100 >= 5 && sum % 100 <= 20 || sum % 10 >= 5) {
            return " рублей";
        } else if (sum % 10 == 1) {
            return " рубль";
        } else {
            return " рубля";
        }
    }
}
