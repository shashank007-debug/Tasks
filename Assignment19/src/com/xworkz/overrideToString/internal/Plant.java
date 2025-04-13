package com.xworkz.overrideToString.internal;

public class Plant {
    private String commonName;
    private String scientificName;
    private String type;

    public Plant(String commonName, String scientificName, String type) {
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant [commonName=" + commonName + ", scientificName=" + scientificName + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        return 58;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Plant) {
                Plant other = (Plant) obj;
                return this.commonName.equals(other.commonName) && this.scientificName.equals(other.scientificName);
            }
        }
        return false;
    }
}
