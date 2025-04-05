package com.xworkz.inheritance.internal.animal;

public class Monkey extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Monkey");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Monkey");
    }
    @Override
    public void move() {
        System.out.println("Running move in Monkey");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Monkey");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Monkey");
    }
}