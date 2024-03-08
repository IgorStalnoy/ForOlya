package org.example.homework5.task2;

//Создать класс описывающий банкомат. Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20, 50, 100.
//Сделать методы для добавления денег в банкомат. Сделать метод, снимающий деньги. С клавиатуры передаётся сумма денег. На экран - булевское значение (операция
//удалась или нет). При снятии денег метод должен выводить на экран каким количесвтом купюр и какого номинала выдаётся сумма.
//Создать конструктор с тремя параметрами - кол-вом купюр. Прочее - на ваше усмотрение.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CashDispenser cashDispenser = new CashDispenser(0, 0, 0);
        Scanner scanner = new Scanner(System.in);
        cashDispenser.addBanknotesTwenty(10);
        cashDispenser.addBanknotesFifty(10);
        cashDispenser.addBanknotesOneHundred(10);
        System.out.println("Total balance : " + cashDispenser.getTotalBalance());
        System.out.println("100$ banknotes left : " + cashDispenser.getBanknotesOneHundred());
        System.out.println("50$ banknotes left : " + cashDispenser.getBanknotesFifty());
        System.out.println("20$ banknotes left : " + cashDispenser.getBanknotesTwenty() + " ");
        cashDispenser.withdrawMoney(scanner);
        System.out.println("Total balance : " + cashDispenser.getTotalBalance());
        System.out.println("100$ banknotes left : " + cashDispenser.getBanknotesOneHundred());
        System.out.println("50$ banknotes left : " + cashDispenser.getBanknotesFifty());
        System.out.println("20$ banknotes left : " + cashDispenser.getBanknotesTwenty() + " ");

    }
}
