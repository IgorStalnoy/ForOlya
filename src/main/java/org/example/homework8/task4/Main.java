package org.example.homework8.task4;

/**
 * Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle. Создать поле name в классе Vehicle и проинициализировать
 * его через конструктора. Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
 * Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран имя хранимого транспортного средства.
 */

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 40);
        Motorcycle motorcycle = new Motorcycle("Harley", false);
        Garage<Vehicle> garage1 = new Garage<>(car);
        Garage<Vehicle> garage2 = new Garage<>(motorcycle);
        System.out.println(garage1.getVehicle());
        System.out.println(garage2.getVehicle());

    }
}
