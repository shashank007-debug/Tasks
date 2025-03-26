package com.xworkz.accessorsAndMutators;

public class JailService {
    public void processJail(Jail jail) {  // Jail as a parameter
        System.out.println("Processing Jail...");
        System.out.println("Jail Name: " + jail.getName());
        System.out.println("Location: " + jail.getLocation());
        System.out.println("Jailer Name: " + jail.getJailerName());
        System.out.println("Total Cells: " + jail.getTotalCells());
        System.out.println("==============================================");
    }

    public void initJailLocally() {
        Jail jail = new Jail();
        jail.setName("Ballari Central Prison");
        jail.setLocation("Ballari");
        jail.setJailerName("Nikhil");
        jail.setTotalCells(38);

        processJail(jail);  // Passing the local reference to another method
    }
}
