package com.xworkz.AccessModifier.External;

public class Driver {
    Vehicle vehicle = new Vehicle();

    public void display() {
        vehicle.type = "SUV";
        System.out.println("Display method in Driver: Vehicle type is " + vehicle.type);
        vehicle.repair();
        vehicle.drive();
        System.out.println("==================================================");
    }
}
