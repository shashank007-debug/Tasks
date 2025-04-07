package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.internal.ArmyVehicle;
import com.xworkz.inheritance.internal.Rubber;
import com.xworkz.inheritance.internal.Tyre;

public class Runner {
    public static void main(String[] args) {
        Rubber rubber = new Tyre();
        ArmyVehicle armyVehicle = new ArmyVehicle();
        armyVehicle.wheel(rubber);
    }
}
