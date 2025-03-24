package com.xworkz.country;

public class Ward {
    int wardNo;
    String areaName;
    int population;
    String representative;

    Ward(int wardNo, String areaName, int population, String representative) {
        this.wardNo = wardNo;
        this.areaName = areaName;
        this.population = population;
        this.representative = representative;
    }

    void display() {
        System.out.println("Ward No: " + this.wardNo);
        System.out.println("Area Name: " + this.areaName);
        System.out.println("Population: " + this.population);
        System.out.println("Representative: " + this.representative);
        System.out.println("=====================================================================================");
    }
}