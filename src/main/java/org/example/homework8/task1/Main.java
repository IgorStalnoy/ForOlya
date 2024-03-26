package org.example.homework8.task1;

/**
 * Создать enum, который описывает сезоны года. Добавить поле description в этот enum. Добавить поле countOFDays в этот enum.
 * Вывести на экран все константы сезоны этого года.
 */

import org.example.homework8.seasons.SeasonsOfYear;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(SeasonsOfYear.values()));

    }
}
