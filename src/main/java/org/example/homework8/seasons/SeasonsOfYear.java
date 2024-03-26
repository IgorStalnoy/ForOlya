package org.example.homework8.seasons;

import java.util.Arrays;

public enum SeasonsOfYear {

    WINTER("so cold", 91),
    SPRING("flowers, sun", 90),
    SUMMER("hot", 89),
    AUTUMN("leafs,bore", 90);

    private String description;
    private int countOfDays;

    SeasonsOfYear(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public static void printNextSeason(String inputSeason) {
        var season = validateSeason(inputSeason);
        switch (season.ordinal()) {
            case 0 -> System.out.println(SPRING + " is next season");
            case 1 -> System.out.println(SUMMER + " is next season");
            case 2 -> System.out.println(AUTUMN + " is next season");
            case 3 -> System.out.println(WINTER + " is next season");
            default -> System.out.println("Not a season");
        }
    }

    public static void printSeasonCountOfDays(String inputSeason) {
        System.out.println(validateSeason(inputSeason).countOfDays + " days in " + inputSeason);
    }

    private static SeasonsOfYear validateSeason(String inputSeason) {
        return Arrays.stream(SeasonsOfYear.values()).filter(x -> x.toString().
                equalsIgnoreCase(inputSeason)).findAny().get();          //хз как Optional разрешать
    }

}