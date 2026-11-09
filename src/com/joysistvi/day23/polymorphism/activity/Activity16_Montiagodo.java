package com.joysistvi.day23.polymorphism.activity;

import com.joysistvi.day20.accessmodifier.b.B;

public class Activity16_Montiagodo {

    public static void main(String[] args) {
        // Runtime Polymorphism
        System.out.println("=== Calling methods on Pen references ===");
        System.out.println("--- Pen ---");
        Pen pen2 = new Pen("Generic Brand", "Navy Blue", 15);
        pen2.write();
        pen2.refill();

        System.out.println("\n--- Ballpen ---");
        Pen ballpen2 = new Ballpen("Pilot", "Black",1, 20);
        ballpen2.write();
        ballpen2.refill();

        System.out.println("\n--- Highlighter ---");
        Pen highlighter2 = new Highlighter("Stabilo", "Pink", 25, "Neon");
        highlighter2.write();
        highlighter2.refill();

        System.out.println("\n=== testPen() ===");
        testPen(pen2);
        System.out.println();

        testPen(ballpen2);
        System.out.println();

        testPen(highlighter2);
        System.out.println( );

        System.out.println("=== Overloading ===");
        highlighter2.write("Hello");
        highlighter2.write("Hello", 3);

    }

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.refill();
    }
}

/*
    Takeaway:

    Method overloading (compiler-time)
    - Uses the same method name but has different parameters.
    - The compiler chooses which method to use based on the given arguments.
    - If there is no matching method, a compile error will happen.

    Method overriding (runtime)
    - Uses the same method name and parameters in the parent and child classes.
    - The program chooses which method to run while it is running.
    - The method used depends on the actual object, not the variable type.
 */