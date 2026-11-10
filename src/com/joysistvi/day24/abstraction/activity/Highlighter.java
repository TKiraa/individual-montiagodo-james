package com.joysistvi.day24.abstraction.activity;

public class Highlighter extends Pen implements Refillable {

    private String inkType;

    public Highlighter(String name, String color, double weightInGrams, String inkType) {
        super(name, color, weightInGrams);
        this.inkType = inkType;
    }

    public String getInkType() {
        return inkType;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    @Override
    public void write() {
        System.out.println("Highlighting important text.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the highlighter ink.");
    }

    @Override
    public String toString() {
        return "Type: Highlighter\n"
                + super.toString() + "\n"
                + "Ink type: " + inkType;
    }
}
