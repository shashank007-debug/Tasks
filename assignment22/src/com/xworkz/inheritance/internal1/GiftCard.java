package com.xworkz.inheritance.internal1;

public class GiftCard extends PaymentMethod {
    public void checkBalance() {
        System.out.println("Checking gift card balance");
    }

    public void applyDiscount() {
        System.out.println("Applying gift card discount");
    }
}