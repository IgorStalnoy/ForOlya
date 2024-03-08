package org.example.homework5.task1;

//Создать класс описывающий промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного кол-ва секунд в объекте, сравнения двух объектов (метод должен работать аналогично CompareTo в строках).
//Создать 2 конструктора:
// - Получающий общее кол-во секунд.
// - Получающий часы, минуты, секунды по отдельности.

public class Main {
    public static void main(String[] args) {

        TimeLine timeLine1 = new TimeLine(53159);
        TimeLine timeLine2 = new TimeLine(12, 66, 5999);
        System.out.println(timeLine2.getHours());
        System.out.println(timeLine2.getMinutes());
        System.out.println(timeLine2.getSeconds());
        System.out.println(timeLine2.getSecondsTotal());
        System.out.println(timeLine1.getHours());
        System.out.println(timeLine1.getMinutes());
        System.out.println(timeLine1.getSeconds());
        System.out.println(timeLine1.getSecondsTotal());
        System.out.println(timeLine1.equals(timeLine2));

    }
}
