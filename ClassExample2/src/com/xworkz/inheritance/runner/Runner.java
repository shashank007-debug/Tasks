package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.internal.ArmyVehicle;
import com.xworkz.inheritance.internal.MRFTyre;
import com.xworkz.inheritance.internal.Rubber;
import com.xworkz.inheritance.internal.Tyre;

public class Runner {
    public static void main(String[] args) {
        Rubber rubber = new Tyre();
        ArmyVehicle armyVehicle = new ArmyVehicle();
        Rubber rubber1 = new Rubber();
        Rubber rubber2 = new MRFTyre();
        armyVehicle.wheel(rubber1);
        armyVehicle.wheel(rubber);
        armyVehicle.wheel(rubber2);
    }
}
