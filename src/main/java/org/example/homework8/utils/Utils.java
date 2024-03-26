package org.example.homework8.utils;

import org.example.homework8.seasons.SeasonsOfYear;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    public static String inputSeasonScan(Scanner scanner) {
        System.out.println("Please input a season");
        String inputSeason = scanner.nextLine();
        boolean validValue = validSeasonCheck(inputSeason);
        while (!validValue) {
            System.out.println("Not a season, please input one seasons :\n" + Arrays.toString(SeasonsOfYear.values()));
            inputSeason = scanner.nextLine();
            validValue = validSeasonCheck(inputSeason);
        }
        return inputSeason.toUpperCase();
    }

    private static boolean validSeasonCheck(String season) {
        return SeasonsOfYear.AUTUMN.toString().equalsIgnoreCase(season) || SeasonsOfYear.WINTER.toString().equalsIgnoreCase(season) ||
                SeasonsOfYear.SPRING.toString().equalsIgnoreCase(season) || SeasonsOfYear.SUMMER.toString().equalsIgnoreCase(season);
    }

}

