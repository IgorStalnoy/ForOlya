package org.example.homework3.task6;

//Задать произвольное целое число и вывести его в бухгалтерском формате, то есть, начиная справа, каждые три позиции отделяются пробелом.
//Например, число 20023143 должно быть выведено как 20 023 143

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = Utils.inputValueScan(scanner);
        System.out.println("Inputted value: " + inputNumber);
        System.out.println(convertNumberToAccountingForm(inputNumber));

    }

    public static String convertNumberToAccountingForm (int number) {
        StringBuilder numberAccountingForm = new StringBuilder();
        int digitsCount = 0;
        do {
            if(digitsCount == 3){
                numberAccountingForm.insert(0, " ");
                digitsCount = 0;
            }
            numberAccountingForm.insert(0, (number % 10));
            digitsCount++;
            number = number / 10;
        } while (number != 0);
            return numberAccountingForm.toString();
    }
}
