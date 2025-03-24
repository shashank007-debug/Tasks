package com.xworkz.AccessModifier;

import com.xworkz.AccessModifier.External.Driver;
import com.xworkz.AccessModifier.Internal.Car;
import com.xworkz.AccessModifier.Internal.Mechanic;

public class VehicleRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();

        Driver driver = new Driver();
        driver.display();

        Mechanic mechanic = new Mechanic();
        mechanic.fixVehicle();
    }
}
