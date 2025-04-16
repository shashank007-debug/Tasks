package com.xworkz.inheritance.internal1;

public class BankTransfer extends PaymentMethod {
    public void validateAccount() {
        System.out.println("Validating bank account details");
    }

    public void processRoutingNumber() {
        System.out.println("Processing bank routing number");
    }
}
