package com.xworkz.AccessModifier;

import com.xworkz.AccessModifier.External.Passenger;
import com.xworkz.AccessModifier.Internal.FlightAttendant;
import com.xworkz.AccessModifier.Internal.Pilot;

public class AirlineRunner {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        pilot.display();

        Passenger passenger = new Passenger();
        passenger.display();

        FlightAttendant flightAttendant = new FlightAttendant();
        flightAttendant.assist();
    }
}
