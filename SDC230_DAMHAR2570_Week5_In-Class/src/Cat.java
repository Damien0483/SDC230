/*=======================================================
Name: Damine Harmon
Date: February 27, 2026
Assignment: Week 5 In-Class Assignment 
Description: SDC230 Object-Oriented Programming using Java 
=========================================================*/
public class Cat extends Animal {
    private String sound;

    // Constructor
    public Cat(String name, String species, int legs, String sound) {
        super(name, species, legs);
        this.sound = sound;
    }

    // Getter and Setter
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // Overridden print method
    @Override
    public void printAnimal() {
        System.out.println("The Cat's name is " + getName() + ", it has " + getLegs() + " legs, and the sound it makes is " + sound);
    }
}