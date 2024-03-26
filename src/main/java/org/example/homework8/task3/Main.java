package org.example.homework8.task3;

import org.example.homework8.seasons.SeasonsOfYear;
import org.example.homework8.utils.Utils;

import java.util.Scanner;

/**
 * Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне. Входной параметр ввести с клавиатуры.
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SeasonsOfYear.printSeasonCountOfDays(Utils.inputSeasonScan(scanner));

    }
}
