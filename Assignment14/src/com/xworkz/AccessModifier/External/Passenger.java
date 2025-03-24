package com.xworkz.AccessModifier.External;

public class Passenger {
    Airline airline = new Airline();

    public void display() {
        airline.destination = "New York";
        System.out.println("Passenger heading to: " + airline.destination);
        airline.checkFlightStatus();
        airline.boardFlight();
        System.out.println("====================================");
    }
}
