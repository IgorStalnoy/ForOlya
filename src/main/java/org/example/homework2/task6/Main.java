package org.example.homework2.task6;

//Написать метод, который выводит расписание на неделю.
// Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.

import org.example.homework2.homework2utils.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TasksContainer tasksContainer = new TasksContainer();
        tasksContainer.addTask(1, "Сделать Оле Массаж");
        tasksContainer.addTask(2, "Секас");
        tasksContainer.addTask(3, "Подарить Оле цветы");
        tasksContainer.addTask(4, "Принести Оле вкусняшку");
        tasksContainer.addTask(5, "Опять секас");
        tasksContainer.addTask(6, "Оттянуть Олю от Джавы");
        tasksContainer.addTask(7, "Деградируем с заей");

        Scanner scanner = new Scanner(System.in);
        printSchedulerTasks(Utils.inputDaysScan(scanner), tasksContainer);

    }
    public static void printSchedulerTasks(int dayNumber, TasksContainer tasksScheduler) {
        System.out.println("Tasks for " + DaysNames.getDay(dayNumber) + ":");
        System.out.println(tasksScheduler.getTasks(dayNumber));
    }

}
