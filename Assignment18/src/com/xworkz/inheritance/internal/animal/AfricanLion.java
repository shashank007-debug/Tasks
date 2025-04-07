package com.xworkz.inheritance.internal.animal;

public class AfricanLion extends Lion {
    public void specialLionBehavior() {
        System.out.println("AfricanLion leads the pride");
    }
    public void invokeAllLionMethods() {
        eat();
        sleep();
        move();
        breathe();
        makeSound(); }
    public void checkAndCast(Lion lion) {
        if (lion instanceof AfricanLion) {
            AfricanLion al = (AfricanLion) lion;
            System.out.println("Lion is AfricanLion. Casting successful.");
            al.specialLionBehavior();
        } else System.out.println("Lion is not an AfricanLion.");
    }
}