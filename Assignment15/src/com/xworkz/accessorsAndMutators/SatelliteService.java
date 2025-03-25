package com.xworkz.accessorsAndMutators;

public class SatelliteService {
    public void processSatellite(Satellite satellite) {
        System.out.println("Processing Satellite...");
        System.out.println("Type: " + satellite.getType());
        System.out.println("Cost: $" + satellite.getCost());
        System.out.println("Weight: " + satellite.getWeight() + " kg");
        System.out.println("Load Capacity: " + satellite.getLoadCapacity() + " kg");
        System.out.println("==============================================");
    }
    public void initSatelliteLocally() {
        Satellite satellite = new Satellite();
        satellite.setType(SatelliteType.COMMUNICATION);
        satellite.setCost(2000000.50);
        satellite.setWeight(800.75);
        satellite.setLoadCapacity(300.60);

        processSatellite(satellite);
    }

}
