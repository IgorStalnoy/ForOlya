package org.example.homework7.task1;

import org.example.homework7.task1.HomeAppliances.bathroomappliences.HairDryer;
import org.example.homework7.task1.HomeAppliances.bathroomappliences.WashingMachine;
import org.example.homework7.task1.HomeAppliances.kitchenappliances.Mixer;
import org.example.homework7.task1.HomeAppliances.kitchenappliances.Toaster;
import org.example.homework7.task1.HomeAppliances.livingroomappliences.Iron;
import org.example.homework7.task1.HomeAppliances.livingroomappliences.VacuumCleaner;

/**
 * Создать цепочку наследования ( минимум 3 звена) классов, описывающих бытовую технику. Создать несколько объектов описанных классов,
 * часть из них включить в розетку. Иерархия должна иметь хотя бы 3 уровня.
 */

public class Main {

    public static void main(String[] args) {

        HairDryer hairDryer = new HairDryer(40, false, 800);
        WashingMachine washingMachine = new WashingMachine(1000, true, 600);
        Mixer mixer = new Mixer(60, true, 300);
        Toaster toaster = new Toaster(200, false, 2);
        Iron iron = new Iron(90, false, 300);
        VacuumCleaner vacuumCleaner = new VacuumCleaner(400, false, 1000);
        mixer.changeState();
        iron.changeState();
        hairDryer.changeState();
        iron.changeState();


    }

}
