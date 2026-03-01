/*******************************************************************
* Name: Damien Harmon
* Date: February 27, 2026
* Assignment SDC230 Week 5 GP2 – First Inheritance
*
* Main application (program) class.
* In this application we will demonstrate the concept of inheritance
* by instantiating Shape and Rectangle objects and demonstrating the
* use of superclass methods in a subclass instantiated object.
*/
public class App {
    public static void main(String[] args) throws Exception {
        // Print a header line
        System.out.println("DAMHAR2570 - Week 5 GP - First Inheritance");
        System.out.println();

        // Instantiate Shape and Rectangle objects
        Shape s = new Shape("Blue");
        Rectangle r = new Rectangle("Orange", 5, 10);

        // Print each object's properties
        s.printShape();
        r.printRectangle();

        // Demonstrate calling a superclass method from a subclass object
        r.printShape();

        // Update the objects' properties
        s.setColor("Green");
        r.setColor("Red"); // Superclass method
        r.setLength(2);
        r.setWidth(4);

        // Print each object's properties
        s.printShape();
        r.printRectangle();
    }
}
