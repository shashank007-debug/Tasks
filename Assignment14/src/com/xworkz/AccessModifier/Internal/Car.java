package com.xworkz.AccessModifier.Internal;

import com.xworkz.AccessModifier.External.Vehicle;

public class Car {
    Vehicle vehicle = new Vehicle();

    public void display() {
        System.out.println("Display method in Car");
        vehicle.model = "Sedan";
        System.out.println("Initializing vehicle model: " + vehicle.model);
        vehicle.drive();
        System.out.println("=================================================");
    }
}
