/*===========================================================
 Name: Damien Harmon
 Date: February 23, 2026
 Assignment: Infix to Postfix Converter
 Description: SDC230 Object-Oriented Programming using Java
 ===========================================================*/
import java.util.Stack;
import java.util.Scanner;

public class InfixConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Robust Infix to Postfix Converter ---");

        while (true) {
            System.out.print("\nEnter Infix expression (or 'QUIT' to exit): ");
            String expression = input.nextLine();

            if (expression.equalsIgnoreCase("QUIT")) break;

            try {
                String result = convertToPostfix(expression);
                System.out.println("Postfix Result: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Syntax Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            input.close();
        }
    }

    public static String convertToPostfix(String infix) throws IllegalArgumentException {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        if (infix.trim().isEmpty()) {
            throw new IllegalArgumentException("Expression cannot be empty.");
        }

        String[] tokens = infix.split("\\s+");

        for (String token : tokens) {

            if (isNumeric(token)) {
                output.append(token).append(" ");
                continue;
            }

            if (token.equals("(")) {
                stack.push('(');
                continue;
            }

            if (token.equals(")")) {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop()).append(" ");
                }
                if (stack.isEmpty()) {
                    throw new IllegalArgumentException("Mismatched parentheses.");
                }
                stack.pop(); 
                continue;
            }

            if (token.length() == 1 && "+-*/".indexOf(token.charAt(0)) >= 0) {
                char op = token.charAt(0);

                while (!stack.isEmpty() &&
                       stack.peek() != '(' &&
                       getPrecedence(stack.peek()) >= getPrecedence(op)) {

                    output.append(stack.pop()).append(" ");
                }

                stack.push(op);
                continue;
            }

            throw new IllegalArgumentException("Invalid token: " + token);
        }

        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top == '(') {
                throw new IllegalArgumentException("Mismatched parenthesis.");
            }
            output.append(top).append(" ");
        }
        return output.toString().trim();
    }

    public static int getPrecedence(char op) {
        switch (op) {
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}