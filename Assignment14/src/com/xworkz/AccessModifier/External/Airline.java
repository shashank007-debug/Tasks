package com.xworkz.AccessModifier.External;

public class Airline {
    public String airlineName;
    String destination;
    private int passengers;

    public void boardFlight() {
        this.passengers = 150;
        System.out.println("Boarding passengers: " + this.passengers);
    }

    public void checkFlightStatus() {
        this.checkWeather();
        System.out.println("Flight is on schedule.");
    }

    private void checkWeather() {
        System.out.println("Checking weather conditions for flight.");
    }
}
