package org.example.homework3.task4;

//Найти среди чисел от 50 до 70 второе простое число(число называют простым, если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.

public class Main {

    public static final int FIRST_NUMBER = 50;
    public static final int SECOND_NUMBER = 70;

    public static void main(String[] args) {

        int secondSimpleNumber = findSecondSimpleNumberInInterval(FIRST_NUMBER, SECOND_NUMBER);
        if (secondSimpleNumber == 0) {
            System.out.println("There are no two simple number in interval");
        } else {
            System.out.println("Second simple numbers in interval is " + secondSimpleNumber);
        }

    }

    public static int findSecondSimpleNumberInInterval(int firstNumber, int secondNumber) {
        boolean isSecondSimpleNumberFound = false;
        int secondSimpleNumber = 0;
        for (;firstNumber <= secondNumber; firstNumber++) {
            for (int i = 2; i <= firstNumber; i++) {
                if (i == firstNumber && !isSecondSimpleNumberFound) {
                    isSecondSimpleNumberFound = true;
                    break;
                }
                if (i == firstNumber) {
                    secondSimpleNumber = firstNumber;
                    return secondSimpleNumber;
                }
                if (firstNumber % i == 0) {
                    break;
                }
            }
        }
        return secondSimpleNumber;
    }

}
