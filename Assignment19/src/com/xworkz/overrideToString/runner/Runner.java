package com.xworkz.overrideToString.runner;

import com.xworkz.overrideToString.internal.*;

public class Runner {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker("Keurig", "K-Elite", 12);
        System.out.println(coffeeMaker.toString());
        System.out.println("====================================================================");
        Guitar guitar = new Guitar("Fender", "Stratocaster", 6);
        System.out.println(guitar.toString());
        System.out.println("====================================================================");
        Skateboard skateboard = new Skateboard("Element", "Pro", 8.0);
        System.out.println(skateboard.toString());
        System.out.println("====================================================================");
        Drone drone = new Drone("DJI", "Mavic 3", 4);
        System.out.println(drone.toString());
        System.out.println("====================================================================");
        Headphones headphones = new Headphones("Sony", "WH-1000XM5", true);
        System.out.println(headphones.toString());
        System.out.println("====================================================================");
        Backpack backpack = new Backpack("North Face", "Borealis", 28);
        System.out.println(backpack.toString());
        System.out.println("====================================================================");
        Watch watch = new Watch("Rolex", "Submariner", "Automatic");
        System.out.println(watch.toString());
        System.out.println("====================================================================");
        Camera camera = new Camera("Canon", "EOS R5", 45);
        System.out.println(camera.toString());
        System.out.println("====================================================================");
        Plant plant = new Plant("Monstera", "Deliciosa", "Indoor");
        System.out.println(plant.toString());
        System.out.println("====================================================================");
        Basketball basketball = new Basketball("Spalding", "NBA Official", 29.5);
        System.out.println(basketball.toString());

    }
}
