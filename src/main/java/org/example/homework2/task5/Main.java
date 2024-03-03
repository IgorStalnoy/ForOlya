package org.example.homework2.task5;

//Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещаются ли эти дома на данном участке.
// Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Utils.inputValuesScanning(scanner, "a");
        int b = Utils.inputValuesScanning(scanner, "b");
        int c = Utils.inputValuesScanning(scanner, "c");
        int d = Utils.inputValuesScanning(scanner, "d");
        int e = Utils.inputValuesScanning(scanner, "e");
        int f = Utils.inputValuesScanning(scanner, "f");
        if (buildingPlacementValidating(a, b, c, d, e, f)) {
            System.out.println("Buildings can be placed into the area");
        } else {
            System.out.println("Buildings can not be placed into the area");
        }
    }

    public static boolean buildingPlacementValidating(int a, int b, int c, int d, int e, int f) {
        return (a + c <= e && b + d <= f) || (a + d <= e && b + c <= f) || (b + d <= e && a + c <= f) || (b + c <= e && a + d <= f);
    }

}
