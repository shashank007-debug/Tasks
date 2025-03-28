package com.xworkz.encapsulation2;

import com.xworkz.encapsulation.Manufacturer;
import com.xworkz.encapsulation.Showroom;

public class Runner {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.initCar(showroom);
        System.out.println("================================");

        Customer customer = new Customer();
        customer.display(showroom);
        System.out.println("================================");
    }
}
