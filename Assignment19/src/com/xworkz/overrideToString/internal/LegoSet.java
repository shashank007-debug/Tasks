package com.xworkz.overrideToString.internal;

public class LegoSet {
    private String theme;
    private String name;
    private int pieces;

    public LegoSet(String theme, String name, int pieces) {
        this.theme = theme;
        this.name = name;
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return "LegoSet [theme=" + theme + ", name=" + name + ", pieces=" + pieces + "]";
    }

    @Override
    public int hashCode() {
        return 51;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof LegoSet) {
                LegoSet other = (LegoSet) obj;
                return this.theme.equals(other.theme) && this.pieces == other.pieces;
            }
        }
        return false;
    }
}
