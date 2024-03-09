package org.example.homework3.task2;

//Вычислить произведение чисел от 1 до 25 с помощью do while

import java.math.BigInteger;

public class Main {

    public static final BigInteger FIRST_NUMBER = new BigInteger("1");
    public static final BigInteger LAST_NUMBER = new BigInteger("25");
    public static final BigInteger STEP_SIZE = new BigInteger("1");

    public static void main(String[] args) {

        System.out.println(multiplicationFromAndUntilInputtedNumbers(FIRST_NUMBER, LAST_NUMBER));

    }

    public static BigInteger multiplicationFromAndUntilInputtedNumbers(BigInteger firstNumber, BigInteger lastNumber) {
        BigInteger result = new BigInteger("1");
        do {
            result = result.multiply(firstNumber);
            firstNumber = firstNumber.add(STEP_SIZE);
        } while (!firstNumber.equals(lastNumber));
        return result;
    }


}
