package com.xworkz.inheritance.internal.animal;

public class Dolphin extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Dolphin");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Dolphin");
    }
    @Override
    public void move() {
        System.out.println("Running move in Dolphin");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Dolphin");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Dolphin");
    }
}
