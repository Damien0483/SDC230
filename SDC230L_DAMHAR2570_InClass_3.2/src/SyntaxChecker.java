/*=========================================================
Name: Damien Harmon
Date: February 14, 2026
Assignment: In Class 3.2 - Syntax Checker
Description: SDC230L Object oriented Programming with Java 
===========================================================*/
import java.util.Scanner;
import java.util.Stack;

public class SyntaxChecker {

    public static void main(String[] args) {

        System.out.println("Damien Harmon - In Class 3.2 Syntax Checker\n");

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter an expression (or type EXIT to quit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("EXIT")) {
                System.out.println("Program terminated.");
                break;
            }

            boolean result = isBalanced(input);

            if (result) {
                System.out.println("Result: The expression is balanced.\n");
            } else {
                System.out.println("Result: The expression is unbalanced.\n");
            }
        }

        scanner.close();
    }

    // Checks if the expression has balanced (), [], and {}
    public static boolean isBalanced(String expression) {

        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {

            // Opening symbols → push
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // Closing symbols → validate
            else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    System.out.println("Illegal Character found: '" + ch + "' has no matching opener.");
                    return false;
                }

                char top = stack.pop();

                if (!isMatch(top, ch)) {
                    System.out.println("Illegal Character found: '" + ch + "' does not match '" + top + "'");
                    return false;
                }
            }

            else {
                System.out.println("Illegal Character found: '" + ch + "' is not a valid character.");
                return false;
            }
        }

        // Final check: stack must be empty
        if (stack.isEmpty()) {
            return true;
        } else {
            System.out.println("Illegal Character found: leftover opening symbol(s) remain.");
            return false;
        }
    }

    // Returns true if open/close are a valid matching pair
    public static boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}