package com.joysistvi.day22.activity;

public class Highlighter extends Pen{

    private String inkType;

    public Highlighter(String name, String color, double weightInGrams, String inkType) {
        super(name, color, weightInGrams);
        this.inkType = inkType;
    }

    public String getInkType() {
        return inkType;
    }

    public void setInkType() {
        this.inkType = inkType;
    }

    @Override
    public void write() {
        System.out.println("Highlighting important text.");
    }

    @Override
    public String toString() {
        return "Type: Highlighter\n"
                + super.toString() + "\n"
                + "Ink type:" + inkType;
    }
}
