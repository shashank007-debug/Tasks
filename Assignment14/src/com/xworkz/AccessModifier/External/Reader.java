package com.xworkz.AccessModifier.External;

public class Reader {
    Library library = new Library();

    public void display() {
        library.section = "Fiction";
        System.out.println("Reader visiting section: " + library.section);
        library.manageCatalog();
        library.issueBook();
        System.out.println("====================================");
    }
}
