/*******************************************************************
* Name: Damien Harmon
* Date: February 27, 2026
* Assignment SDC230 Week 5 GP2 – First Inheritance
*
* Rectangle class.
* This is the subclass (or derived class) that provides the specific
* information for a rectangle. In this case, the specific information
* we care about is the rectangle's length and width. Note that because
* this is a subclass of Shape, it also has access to the superclass's
* public functions.
*/
public class Rectangle extends Shape {
    // Class properties
    private int Length;
    private int Width;

    // Constructor - note that the parameter Color is used to call the
    // superclass's constructor via the keyword "super"
    public Rectangle(String color, int length, int width) {
        super(color);
        Length = length;
        Width = width;
    }
    
    // Functions to set and get class properties
    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    // Function to print the Rectangle's information
    public void printRectangle() {
        // Print the Rectangle's information - use the superclass function
        // "getColor" to print the inherited color information
        System.out.printf(
    "This is a Rectangle.%n Color: %s%n Length: %d%n Width: %d%n%n",
            getColor(), Length, Width);
    }
}
