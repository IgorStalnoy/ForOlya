package org.example.homework8.task4;

public class Garage<T extends Vehicle> {

    private final T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicle() {
        return vehicle.toString();
    }
}
