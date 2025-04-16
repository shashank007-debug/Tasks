package com.xworkz.inheritance.internal1;

public class LoyaltyPoints extends PaymentMethod {
    public void checkPointsBalance() {
        System.out.println("Checking loyalty points balance");
    }

    public void convertPoints() {
        System.out.println("Converting points to currency");
    }
}