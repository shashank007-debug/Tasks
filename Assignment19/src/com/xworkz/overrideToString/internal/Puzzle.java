package com.xworkz.overrideToString.internal;

public class Puzzle {
    private String brand;
    private String theme;
    private int pieces;

    public Puzzle(String brand, String theme, int pieces) {
        this.brand = brand;
        this.theme = theme;
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return "Puzzle [brand=" + brand + ", theme=" + theme + ", pieces=" + pieces + "]";
    }
}
