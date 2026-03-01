/*================================================================
Name: Damien Harmon
Date: February 28, 2026
Assignment: In-Class 5.3 Multilevel Inheritance
Description: SDC230L Object-Oriented Programming using Java Lab
=================================================================*/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" DAMHAR2570 - Week5 Lab Multilevel Inheritance");

        SalariedEmployee alice = new SalariedEmployee("Alice Cullen", 101, 52000);
        Manager robert = new Manager("Robert Howell", 102, 75000, 13000);

        // Initial output
        System.out.println("Initial Information:");
        alice.displayInfo();
        System.out.println();
       
        robert.displayInfo();
        System.out.println();
    

        // Update the manager's bonus and display info again
        System.out.println("Updated Information:");
        robert.setBonus(15000);
        robert.displayInfo();
        System.out.println();

        // Update the salaried employee's name, then display info again
        alice.setName("Alice Smith");    
        alice.displayInfo();
    }



}
