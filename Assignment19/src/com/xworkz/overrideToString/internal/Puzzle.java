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

    @Override
    public int hashCode() {
        return 63;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Puzzle) {
                Puzzle other = (Puzzle) obj;
                return this.brand.equals(other.brand) && this.theme.equals(other.theme) && this.pieces == other.pieces;
            }
        }
        return false;
    }
}
