package org.example.homework2.task6;

//Написать метод, который выводит расписание на неделю.
// Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TasksForScheduler tasksForScheduler = new TasksForScheduler();
        tasksForScheduler.setTasksForScheduler(1, "Сделать Оле Массаж");
        tasksForScheduler.setTasksForScheduler(2, "Секас");
        tasksForScheduler.setTasksForScheduler(3, "Подарить Оле цветы");
        tasksForScheduler.setTasksForScheduler(4, "Принести Оле вкусняшку");
        tasksForScheduler.setTasksForScheduler(5, "Опять секас");
        tasksForScheduler.setTasksForScheduler(6, "Оттянуть Олю от Джавы");
        tasksForScheduler.setTasksForScheduler(7, "Деградируем с заей");

        Scanner scanner = new Scanner(System.in);
        schedulerTasksPrinter(inputValuesScanner(scanner), tasksForScheduler);

    }

    public static void schedulerTasksPrinter(int dayNumber, TasksForScheduler tasksScheduler) {
        System.out.println("Tasks for " + DaysNames.getDayName(dayNumber) + ":");
        System.out.println(tasksScheduler.getTasksForScheduler(dayNumber));
    }

    public static int inputValuesScanner(Scanner scanner) {
        int dayNumber = 0;
        boolean validValue;
        System.out.println("Please enter a day number");
        do {
            validValue = scanner.hasNextInt();
            if (!validValue) {
                System.out.println("Not a number, please input a number");
                scanner.nextLine();
            } else {
                dayNumber = scanner.nextInt();
                if (dayNumber < 1 || dayNumber > 7) {
                    validValue = false;
                    System.out.println("Number should be bigger then 0 and less then 7");
                    scanner.nextLine();
                }
            }
        } while (!validValue);
        return dayNumber;
    }
}
