package com.xworkz.AccessModifier.External;

public class Customer {
    Bank bank = new Bank();

    public void display() {
        bank.ifscCode = "BKID0001234";
        System.out.println("Customer visiting bank with IFSC: " + bank.ifscCode);
        bank.audit();
        bank.deposit();
        System.out.println("====================================");
    }
}
