package com.xworkz.inheritance.internal.animal;

public class Kangaroo extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Kangaroo");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Kangaroo");
    }
    @Override
    public void move() {
        System.out.println("Running move in Kangaroo");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Kangaroo");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Kangaroo");
    }
}