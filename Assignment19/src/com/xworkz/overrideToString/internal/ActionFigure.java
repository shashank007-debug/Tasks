package com.xworkz.overrideToString.internal;

public class ActionFigure {
    private String franchise;
    private String character;
    private double height;

    public ActionFigure(String franchise, String character, double height) {
        this.franchise = franchise;
        this.character = character;
        this.height = height;
    }

    @Override
    public String toString() {
        return "ActionFigure [franchise=" + franchise + ", character=" + character + ", height=" + height + "in]";
    }
}
