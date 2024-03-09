package org.example.homework3.task4;

//Найти среди чисел от 50 до 70 второе простое число(число называют простым, если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.

public class Main {

    public static final int FIRST_NUMBER = 50;
    public static final int SECOND_NUMBER = 70;

    public static void main(String[] args) {

        int secondSimpleNumber = findSecondSimpleNumberInInterval(FIRST_NUMBER, SECOND_NUMBER);
        System.out.println(secondSimpleNumber == 0 ? "There are no two simple number in interval" : "Second simple numbers in interval is " + secondSimpleNumber);

    }

    public static int findSecondSimpleNumberInInterval(int firstNumber, int secondNumber) {
        boolean isFirstResultFound = false;
        int result = 0;
        while (firstNumber <= secondNumber) {
            for (int i = 2; i <= firstNumber; i++) {
                if (i == firstNumber && !isFirstResultFound) {
                    isFirstResultFound = true;
                    break;
                }
                if (i == firstNumber) {
                    return firstNumber;
                }
                if (firstNumber % i == 0) {
                    break;
                }
            }
            firstNumber++;
        }
        return result;
    }

}
