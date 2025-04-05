package com.xworkz.inheritance.internal.animal;


public class Elephant extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Elephant");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Elephant");
    }
    @Override
    public void move() {
        System.out.println("Running move in Elephant");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Elephant");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Elephant");
    }
}