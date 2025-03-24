package com.xworkz.AccessModifier.Internal;

import com.xworkz.AccessModifier.External.Bank;

public class Manager {
    Bank bank = new Bank();

    public void oversee() {
        bank.branch = "Main City Branch";
        System.out.println("Manager overseeing: " + bank.branch);
        bank.audit();
    }
}
