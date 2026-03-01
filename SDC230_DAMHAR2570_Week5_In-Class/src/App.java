/*=======================================================
Name: Damine Harmon
Date: February 27, 2026
Assignment: Week 5 In-Class Assignment 
Description: SDC230 Object-Oriented Programming using Java 
=========================================================*/
public class App {
    public static void main(String[] args) {

        System.out.println("Your Name - Week 5 PA Inheritance and Overriding.\n");

        // Create instances
        Animal a = new Animal("Buddy", "Canine", 4);
        Cat c = new Cat("Whiskers", "Feline", 4, "Meow");

        // Print original values
        System.out.println("Original Values:");
        a.printAnimal();
        c.printAnimal();

        System.out.println("\nUpdated Values:");

        // Update values
        a.setName("Max");
        a.setSpecies("Dolphin");
        a.setLegs(0);

        c.setName("Shadow");
        c.setLegs(4);
        c.setSound("Purr");

        // Print updated values
        a.printAnimal();
        c.printAnimal();
    }
}