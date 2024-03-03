package org.example.homework1.task1;

public class Main {
    //Вывести на экран значения переменных ниже
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;

        System.out.println("byte b = " + b +
                "\nshort s = " + s +
                "\nint i = " + i +
                "\nlong l = " + l +
                "\nchar c  = " + c +
                "\nfloat f = " + f +
                "\ndouble d = " + d +
                "\nboolean bool = " + bool);
    }
}
