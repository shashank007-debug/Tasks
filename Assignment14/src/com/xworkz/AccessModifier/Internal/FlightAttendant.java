package com.xworkz.AccessModifier.Internal;

import com.xworkz.AccessModifier.External.Airline;

public class FlightAttendant {
    Airline airline = new Airline();

    public void assist() {
        airline.airlineName = "Global Airways";
        System.out.println("Flight attendant assisting on: " + airline.airlineName);
        airline.checkFlightStatus();
    }
}
