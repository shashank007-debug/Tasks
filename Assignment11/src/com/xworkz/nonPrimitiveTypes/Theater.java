    package com.xworkz.nonPrimitiveTypes;

    public class Theater {
        void show(Poster poster) {
            if (poster != null) {
                System.out.println("Running show in Theater");
                poster.showInfo();
            } else {
                System.out.println("No poster available to display show information.");
            }
        }


    }
