package com.xworkz.encapsulation;

public class Manufacturer {
    public static String name;
    public void initCar(Showroom showroom){
        System.out.println("Running initCar manufacturer");
        showroom.setKey(2);
        showroom.setCarDesign("Jaguar");
        System.out.println("==================================");
    }
    static {
        name = "Detail Mafia";
        System.out.println("Name of Manufacturer is : "+name);
        System.out.println("Running static block in Manufacturer invoked by JVM");
    }

}
