/*=======================================================
Name: Damine Harmon
Date: February 27, 2026
Assignment: Week 5 In-Class Assignment 
Description: SDC230 Object-Oriented Programming using Java 
=========================================================*/
public class Animal {
    private String name;
    private String species;
    private int legs;

    // Constructor
    public Animal(String name, String species, int legs) {
        this.name = name;
        this.species = species;
        this.legs = legs;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    // Print method
    public void printAnimal() {
        System.out.println("The animal's name is " + name + ". It is a " + species + ", and it has " + legs + " legs.");
    }
}