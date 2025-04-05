package com.xworkz.inheritance.internal.animal;

public class Giraffe extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Giraffe");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Giraffe");
    }
    @Override
    public void move() {
        System.out.println("Running move in Giraffe");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Giraffe");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Giraffe");
    }
}