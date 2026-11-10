package com.joysistvi.day24.abstraction.activity;

public class Activity17_Montiagodo {

    public static void main(String[] args) {
          // error: Pen is abstract; cannot be instantiated
          // Pen is an abstract class.
//        Pen pen2 = new Pen("Generic Brand", "Navy Blue", 15);
//        pen2.write();
//        pen2.refill();

        Ballpen ballpen = new Ballpen("Pilot", "Black",1, 20);

        Highlighter highlighter = new Highlighter("Stabilo", "Pink", 25, "Neon");


        System.out.println("=== testPen() ===");
        testPen(ballpen);
        System.out.println();

        testPen(highlighter);
        System.out.println();

        System.out.println("=== testRefillable() ===");
        testRefillable(ballpen);
        System.out.println();

        testRefillable(highlighter);
        System.out.println();

        System.out.println("=== testClickable() ===");
        testClickable(ballpen);

          // error: Highlighter cannot be converted Clickable
          // because Highlighter implements only Refillable
//        testClickable(highlighter);
//        System.out.println();


    }

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.store();
    }

    public static void testRefillable(Refillable refillable) {
        refillable.refill();
        System.out.println("Maximum refills: "+ Refillable.MAX_REFILLS);

    }

    public static void testClickable(Clickable clickable) {
        clickable.click();

    }
}

/*
    Takeaway:

    Abstract class uses extends to inherit common properties and methods
    Interface uses implements to add required methods.
    A class can extend one class but implement many interfaces.
 */