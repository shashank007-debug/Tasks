package com.xworkz.inheritance.internal1;

public class PayPal extends PaymentMethod {
    public void authorizePayPal() {
        System.out.println("Authorizing PayPal account");
    }

    public void checkBalance() {
        System.out.println("Checking PayPal balance");
    }
}