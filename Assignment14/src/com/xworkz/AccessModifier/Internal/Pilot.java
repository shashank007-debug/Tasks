package com.xworkz.AccessModifier.Internal;

import com.xworkz.AccessModifier.External.Airline;

public class Pilot {
    Airline airline = new Airline();

    public void display() {
        airline.airlineName = "Sky Airlines";
        System.out.println("Pilot flying for: " + airline.airlineName);
        airline.boardFlight();
        System.out.println("====================================");
    }
}
