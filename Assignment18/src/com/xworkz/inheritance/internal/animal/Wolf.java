package com.xworkz.inheritance.internal.animal;

public class Wolf extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Wolf");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Wolf");
    }
    @Override
    public void move() {
        System.out.println("Running move in Wolf");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Wolf");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Wolf");
    }
}