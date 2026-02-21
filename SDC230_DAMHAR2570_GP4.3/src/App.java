/*******************************************************************
* Name: Damien Harmon
* Date: February 20, 2026
* Assignment SDC230 Week 4 GP – User Generated Exceptions
*
* Main application (program) class.
* In this application we will demonstrate the use of exception handling
* to generate and properly handle both a user-generated and a system-
* generated exception, allowing the program to continue operating after
* an exception is thrown.
**********************************************************************/
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    // demonstrate generating an exception when division by zero is detected
    public static int quotient(int numerator, int denominator)
            throws Exception {
        if (denominator == 0) {
            //throw an exception with a custom message - generating your own
            //exception allows you to be specific rather than getting an
            //ArithmeticException and assuming the issue is a zero denominator
            throw new DivisionByZeroException("Division by zero is not allowed!");
        }
        
        //if the exception is thrown, the code will never reach this line,
        //avoiding the system generating an error
        return numerator / denominator;
    }   

    public static void main(String[] args) throws Exception {
        // Print a header line
        System.out.println(
            "DAMHAR2570 - Week 4 GP - User Generated Exceptions");      
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
            } catch (Exception e) {
                //print the exception that was caught
                System.err.printf("%nUser-Generated Exception: %s%n", e);
                //discard the input so the user can try again
                scanner.nextLine();
                System.out.printf("%s Please try again.%n", e);
            }
        } while (cont);
    scanner.close();}
}