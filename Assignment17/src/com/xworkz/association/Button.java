package com.xworkz.association;

class Button {
    private String color;
    private boolean isPressed;
    private Manufacturer manufacturer;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    void press() {
        System.out.println(color + " button by " + manufacturer.getName() + " is " + (isPressed ? "pressed" : "not pressed"));
    }
}

