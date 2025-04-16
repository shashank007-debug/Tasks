package com.xworkz.abstraction.internal;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is running makeSound method which is overridden from the Animal");
    }
}
