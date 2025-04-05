package com.xworkz.inheritance.internal.animal;

public class Fish extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Fish");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Fish");
    }
    @Override
    public void move() {
        System.out.println("Running move in Fish");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Fish");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Fish");
    }
}