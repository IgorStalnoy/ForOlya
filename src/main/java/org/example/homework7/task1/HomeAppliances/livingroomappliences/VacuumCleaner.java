package org.example.homework7.task1.HomeAppliances.livingroomappliences;

public class VacuumCleaner extends LivingRoomAppliences {

    private int powerConsumption;

    public VacuumCleaner(int price, boolean isNiceForGuests, int powerConsumption) {
        super(price, isNiceForGuests);
        this.powerConsumption = powerConsumption;
    }
}
