package com.xworkz.AccessModifier.Internal;

import com.xworkz.AccessModifier.External.Library;

public class Librarian {
    Library library = new Library();

    public void display() {
        library.libraryName = "City Central Library";
        System.out.println("Librarian managing: " + library.libraryName);
        library.issueBook();
        System.out.println("====================================");
    }
}
