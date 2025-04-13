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

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof ActionFigure){
                ActionFigure actionFigure1 = this;
                ActionFigure actionFigue2 = (ActionFigure)obj;
                return (actionFigure1.franchise.equals(actionFigue2.franchise));
            }
        }
        return false;
    }
}
