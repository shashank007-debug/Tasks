package com.xworkz.AccessModifier;

import com.xworkz.AccessModifier.External.Customer;
import com.xworkz.AccessModifier.Internal.Accountant;
import com.xworkz.AccessModifier.Internal.Manager;

public class BankRunner {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        accountant.display();

        Customer customer = new Customer();
        customer.display();

        Manager manager = new Manager();
        manager.oversee();
    }
}
