package com.xworkz.AccessModifier.Internal;

import com.xworkz.AccessModifier.External.Library;

public class Assistant {
    Library library = new Library();

    public void assist() {
        library.libraryName = "Local Community Library";
        System.out.println("Assistant working at: " + library.libraryName);
        library.manageCatalog();
    }
}
