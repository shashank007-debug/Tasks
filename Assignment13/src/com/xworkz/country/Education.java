package com.xworkz.country;

public class Education {
    String degree;
    String university;
    int passingYear;
    double percentage;

    Education(String degree, String university, int passingYear, double percentage) {
        this.degree = degree;
        this.university = university;
        this.passingYear = passingYear;
        this.percentage = percentage;
    }

    void display() {
        System.out.println("Degree: " + this.degree);
        System.out.println("University: " + this.university);
        System.out.println("Passing Year: " + this.passingYear);
        System.out.println("Percentage: " + this.percentage);
        System.out.println("=====================================================================================");
    }
}