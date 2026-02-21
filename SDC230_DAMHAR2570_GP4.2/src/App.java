/*******************************************************************
* Name: Damien Harmon
* Date: February 20, 2026
* Assignment SDC230 Week 4 GP – System Generated Exceptions
*
* Main application (program) class.
* In this application we will demonstrate the use of exception handling
* to properly process and handle a system-generated exception, allowing
* the program to continue operating after an exception is thrown by the
* system.
**********************************************************************/
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    // demonstrate throwing an exception when a division by zero error occurs
    public static int quotient(int numerator, int denominator)
        throws ArithmeticException {
            return numerator / denominator; // possible division by zero
    }   

    public static void main(String[] args) throws Exception {
    // Print a header line
    System.out.println(
        "DAMHAR2570 - Week 4 GP - System Generated Exceptions");
    System.out.println();

    Scanner scanner = new Scanner(System.in);
    boolean cont = true; //loop control variable
    do {
        try {
            System.out.print("Please enter an integer numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Please enter an integer denominator: ");
            int denominator = scanner.nextInt();

            int res = quotient(numerator, denominator);
            System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, res);
            cont = false;
        } catch (InputMismatchException e) {

            //print the exception that was caught
            System.err.printf("%nException: %s%n", e);
            //discard the input so the user can try again
            scanner.nextLine();
            System.out.println(
                "You must enter integers. Please try again.");
        } catch (ArithmeticException e) {
            //print the exception that was caught
            System.err.printf("%nException: %s%n", e);
            //discard the input so the user can try again
            scanner.nextLine();
            System.out.println(
                "Zero is an invalid denominator. Please try again.");
        }

        } while (cont);

        //Now demonstrate what happens without exception handling
        System.out.println(
            "Here's what would have happened with no Exception Handling:");
        System.out.println();
        System.out.print("Please enter an integer numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Please enter an integer denominator: ");
        int denominator = scanner.nextInt();
        int res = quotient(numerator, denominator);

        //With invalid input, this line will not be reached
        System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, res);
    }
}