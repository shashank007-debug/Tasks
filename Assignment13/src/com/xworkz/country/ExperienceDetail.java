package com.xworkz.country;

public class ExperienceDetail {
    String role;
    int years;
    double salary;
    Company company;

    ExperienceDetail(String role, int years, double salary, Company company) {
        this.role = role;
        this.years = years;
        this.salary = salary;
        this.company = company;
    }

    void display() {
        System.out.println("Role: " + this.role);
        System.out.println("Years of Experience: " + this.years);
        System.out.println("Salary: " + this.salary);
        System.out.println("=====================================================================================");
        if (company != null) {
            company.display();
            System.out.println("=====================================================================================");
        }
    }
}
