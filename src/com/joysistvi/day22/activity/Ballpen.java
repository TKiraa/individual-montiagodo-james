package com.joysistvi.day22.activity;

public class Ballpen extends Pen{

    private double pointSize;

    public Ballpen(String brand, String color, double pointSize, double weightInGrams) {
        super(brand, color, weightInGrams);
        this.pointSize = pointSize;
    }

    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }

    // String representation of object
    @Override
    public String toString() {
        return "Type: Ballpen\n"
               + super.toString() + "\n"
               + "Point size: " + pointSize;
    }
}
