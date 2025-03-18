package com.xworkz.nonPrimitiveTypes;

class Space {
    void explore(Rocket rocket) {
        if (rocket != null) {
            rocket.launch();
            System.out.println("Exploring space.");
        } else {
            System.out.println("No rocket available for space exploration.");
        }
    }


    void measureDistance() {
        System.out.println("Measuring distance between planets.");
    }
}
