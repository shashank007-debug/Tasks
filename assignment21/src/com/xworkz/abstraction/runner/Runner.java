package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.internal.*;

public class Runner {
    public static void main(String[] args) {
        System.out.println("=== Testing Vehicle and Car ===");
        Car myCar = new Car();
        myCar.startEngine();

        System.out.println("=== Testing Animal and Dog ===");
        Dog myDog = new Dog();
        myDog.makeSound();

        System.out.println("=== Testing ElectronicDevice and Smartphone ===");
        Smartphone myPhone = new Smartphone();
        myPhone.powerOn();
        myPhone.showBrand("Apple");

        System.out.println("=== Testing Building and House ===");
        House myHouse = new House(2, 150.5, "123 Main St");
        myHouse.displayInfo();

        System.out.println("=== Testing Computer and Laptop ===");
        Laptop myLaptop = new Laptop("Intel i7", 16, 512, "Dell", 15.6);
        myLaptop.displaySpecs();
    }
}
