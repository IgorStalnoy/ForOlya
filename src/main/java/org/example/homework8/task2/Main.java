package org.example.homework8.task2;

import org.example.homework8.seasons.SeasonsOfYear;
import org.example.homework8.utils.Utils;

import java.util.Scanner;

/**
 * Написать метод, который выводит следующий сезон от заданного во входном параметре. Входной параметр ввести с клавиатуры.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SeasonsOfYear.printNextSeason(Utils.inputSeasonScan(scanner));

    }
}
