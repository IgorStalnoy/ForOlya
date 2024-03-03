package org.example.homework3.task6;

//Задать произвольное целое число и вывести его в бухгалтерском формате, то есть, начиная справа, каждые три позиции отделяются пробелом.
//Например, число 20023143 должно быть выведено как 20 023 143

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = Utils.inputValueScanning(scanner);
        System.out.println("Inputted value: " + inputNumber);
        System.out.println(convertNumberToAccountingForm(inputNumber));

    }

    public static String convertNumberToAccountingForm (int number) {
        String numberAccountingForm = "";
        int digitsCount = 0;
        do {
            if(digitsCount == 3){
                numberAccountingForm = " " + numberAccountingForm;
                digitsCount = 0;
            }
            numberAccountingForm = (number % 10) + numberAccountingForm;
            digitsCount++;
            number = number / 10;
        } while (number != 0);
            return numberAccountingForm;
    }
}
