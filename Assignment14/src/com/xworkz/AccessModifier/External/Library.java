package com.xworkz.AccessModifier.External;

public class Library {
    public String libraryName;
    String section;
    private int books;

    public void issueBook() {
        this.books = 500;
        System.out.println("Issuing books, total available: " + this.books);
    }

    public void manageCatalog() {
        this.rearrangeBooks();
        System.out.println("Managing library catalog.");
    }

    private void rearrangeBooks() {
        System.out.println("Rearranging books on the shelves.");
    }
}
