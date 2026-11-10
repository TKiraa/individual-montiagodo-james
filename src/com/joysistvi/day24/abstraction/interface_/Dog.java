package com.joysistvi.day24.abstraction.interface_;

// Don't Repeat Yourself Principle
public class Dog extends Animal implements Pet, Swimmer {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // method overriding: Dog has its own version of makeSound()
    // implementing the abstract method for the Animals
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }

    // a method that only Dog has
    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " plays fetch.");
    }

    @Override
    public void showAffection() {
        System.out.println(getName() + " wags its tail happily.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims in the river.");
    }

    @Override
    public String toString() {
        return "Type: Dog\n"
                + super.toString() + "\n"
                + "Breed: " + breed;
    }
}
