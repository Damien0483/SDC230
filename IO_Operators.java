/*
 * Name: Damien Juaqing Harmon
 * Date: 04 February 2026
 * Assignment: SDC230 Performance Assessment - I/O & Operators
 * Description: Object Oriented Programming Using Java
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Damien Harmon - Week 1 PA IO & Operators\n");

        // ---------------------------------------------------------
        // INTEGER OPERATIONS
        // ---------------------------------------------------------
        System.out.println("=== INTEGER OPERATIONS ===");

        // Requesting input from user
        System.out.print("Enter integer value 1: ");
        int int1 = scanner.nextInt();

        System.out.print("Enter integer value 2: ");
        int int2 = scanner.nextInt();

        // Calculating sum
        int intSum = int1 + int2;

        System.out.println("\nInteger Sum: " + intSum);

        // Integer comparisons
        if (int1 == int2)
            System.out.println(int1 + " is equal to " + int2);
        else
            System.out.println(int1 + " is not equal to " + int2);

        if (int1 > int2)
            System.out.println(int1 + " is greater than " + int2);
        else if (int1 < int2)
            System.out.println(int1 + " is less than " + int2);

        if (int1 >= int2)
            System.out.println(int1 + " is greater than or equal to " + int2);
        if (int1 <= int2)
            System.out.println(int1 + " is less than or equal to " + int2);

        // ---------------------------------------------------------
        // FLOATING POINT OPERATIONS
        // ---------------------------------------------------------
        System.out.println("\n=== FLOATING POINT OPERATIONS ===");

        // Requesting input from user
        System.out.print("Enter floating value 1: ");
        double float1 = scanner.nextDouble();

        System.out.print("Enter floating value 2: ");
        double float2 = scanner.nextDouble();

        // Calculating sum
        double floatSum = float1 + float2;

        System.out.printf("\nFloating Value 1: %.4f%n", float1);
        System.out.printf("Floating Value 2: %.4f%n", float2);
        System.out.printf("Floating Sum: %.4f%n", floatSum);

        // Floating-point comparisons
        if (float1 == float2)
            System.out.printf("%.4f is equal to %.4f%n", float1, float2);
        else
            System.out.printf("%.4f is not equal to %.4f%n", float1, float2);

        if (float1 > float2)
            System.out.printf("%.4f is greater than %.4f%n", float1, float2);
        else if (float1 < float2)
            System.out.printf("%.4f is less than %.4f%n", float1, float2);

        if (float1 >= float2)
            System.out.printf("%.4f is greater than or equal to %.4f%n", float1, float2);
        if (float1 <= float2)
            System.out.printf("%.4f is less than or equal to %.4f%n", float1, float2);

        scanner.close();
    }
}
