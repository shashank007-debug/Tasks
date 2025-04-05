package com.xworkz.inheritance.internal.animal;

public class Bear extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Bear");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Bear");
    }
    @Override
    public void move() {
        System.out.println("Running move in Bear");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Bear");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Bear");
    }
}
