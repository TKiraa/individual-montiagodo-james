package com.joysistvi.day22.activity;

public class Activity15_Montiagodo {

    public static void main(String[] args) {
        Pen pen = new Pen("Generic Brand", "Navy Blue", 15);
        Ballpen ballpen = new Ballpen("Pilot", "Black",1, 20);
        Highlighter highlighter = new Highlighter("Stabilo", "Pink", 25, "Neon");

        System.out.println("=== Ballpen ===");
        System.out.println(ballpen);
        ballpen.write();

        System.out.println("\n=== Highlighter ===");
        System.out.println(highlighter);
        highlighter.write();
    }
}
