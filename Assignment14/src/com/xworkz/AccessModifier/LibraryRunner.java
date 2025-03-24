package com.xworkz.AccessModifier;

import com.xworkz.AccessModifier.External.Reader;
import com.xworkz.AccessModifier.Internal.Assistant;
import com.xworkz.AccessModifier.Internal.Librarian;

public class LibraryRunner {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        librarian.display();

        Reader reader = new Reader();
        reader.display();

        Assistant assistant = new Assistant();
        assistant.assist();
    }
}
