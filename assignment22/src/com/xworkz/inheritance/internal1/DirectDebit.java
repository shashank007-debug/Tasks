package com.xworkz.inheritance.internal1;

public class DirectDebit extends PaymentMethod {
    public void verifyBankDetails() {
        System.out.println("Verifying bank account for direct debit");
    }

    public void setupMandate() {
        System.out.println("Setting up direct debit mandate");
    }
}