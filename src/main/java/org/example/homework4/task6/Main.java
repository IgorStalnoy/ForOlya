package org.example.homework4.task6;

//Соаздать двумерный квадратный массив и заполнить его "бабочкой"

public class Main {

    public static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        int[][] matrix = new int[ARRAY_LENGTH][ARRAY_LENGTH];
        fillMatrixWithButterflyMethod(matrix);
        printMatrix(matrix);
    }

    public static void fillMatrixWithButterflyMethod(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length - i; j++) {
                matrix[i][j] = 1;
                matrix[matrix.length - 1 - i][j] = 1;
            }

        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
