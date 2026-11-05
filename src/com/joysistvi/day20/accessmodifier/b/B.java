package com.joysistvi.day20.accessmodifier.b;

import com.joysistvi.day20.accessmodifier.a.Employee;

public class B extends Employee {

    public static void main(String[] args) {
        B b = new B();
        b.printAge();
        System.out.println(b.age);
    }
}
