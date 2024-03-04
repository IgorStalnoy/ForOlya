package org.example.homework2.task5;

//Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещаются ли эти дома на данном участке.
// Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Utils.inputValuesScan(scanner, "a");
        int b = Utils.inputValuesScan(scanner, "b");
        int c = Utils.inputValuesScan(scanner, "c");
        int d = Utils.inputValuesScan(scanner, "d");
        int e = Utils.inputValuesScan(scanner, "e");
        int f = Utils.inputValuesScan(scanner, "f");
        if (isBuildingPlacementPossible(a, b, c, d, e, f)) {
            System.out.println("Buildings can be placed into the area");
        } else {
            System.out.println("Buildings can not be placed into the area");
        }
    }

    public static boolean isBuildingPlacementPossible(int a, int b, int c, int d, int e, int f) {
        return (a + c <= e && b + d <= f) || (a + d <= e && b + c <= f) || (b + d <= e && a + c <= f) || (b + c <= e && a + d <= f);
    }

}
