package com.xworkz.AccessModifier.Internal;

import com.xworkz.AccessModifier.External.Vehicle;

public class Mechanic {
    Vehicle vehicle = new Vehicle();

    public void fixVehicle() {
        vehicle.model = "Truck";
        System.out.println("Mechanic is fixing the vehicle: " + vehicle.model);
        vehicle.repair();
    }
}
