/**
* Name: Nilan C. Karunaratne
* Date: February 14, 2026
* Description: Demonstrates Stack LIFO behavior using a standard for-loop
* and charAt() to reverse a string for a palindrome check.
*/
import java.util.Scanner;
import java.util.Stack;
public class StackPalindrome {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Nilan C. Karunaratne - Stack Demonstration: Palindrome
Checker");
System.out.print("\nEnter a word to check: ");
String original = input.nextLine();
// Data Cleaning
String cleaned = original.replaceAll("\\s+", "").toLowerCase();
Stack<Character> stack = new Stack<>();
for (int i = 0; i < cleaned.length(); i++) {
char c = cleaned.charAt(i);
stack.push(c);
System.out.println("Pushed: " + c);
}
String reversed = "";
while (!stack.isEmpty()) {
reversed += stack.pop();
}
// Output Results
System.out.println("\n-------------------------");
System.out.println("Cleaned Original: " + cleaned);
System.out.println("Reversed Result: " + reversed);
if (cleaned.equals(reversed)) {
System.out.println("RESULT: PALINDROME");
} else {
System.out.println("RESULT: NOT A PALINDROME");
}
input.close();
}
}
