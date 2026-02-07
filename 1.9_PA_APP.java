/**
 * Your Name
 * Date of development: February 2026
 * Assignment: SDC230 Performance Assessment - Classes
 * Description: Main application class that creates Employee objects,
 *              displays their information, updates values, and prints again.
 */

public class App {

    public static void main(String[] args) {

        // Required printed line
        System.out.println("Your Name - Week 1 PA Classes\n");

        // Create 2 Employee objects
        Employee emp1 = new Employee("John", "Smith", 2500);
        Employee emp2 = new Employee("Mary", "Jones", 500); // invalid salary

        // Print initial employee information
        System.out.println("Initial Employee Information:");
        System.out.println("-----------------------------");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                           " - Salary: $" + emp1.getMonthlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                           " - Salary: $" + emp2.getMonthlySalary());

        // Update employee information
        emp1.setLastName("Johnson");   // update last name
        emp2.setFirstName("Sarah");    // update first name
        emp1.setMonthlySalary(3200);   // valid update
        emp2.setMonthlySalary(1500);   // now valid

        // Print updated employee information
        System.out.println("\nUpdated Employee Information:");
        System.out.println("-----------------------------");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
                           " - Salary: $" + emp1.getMonthlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
                           " - Salary: $" + emp2.getMonthlySalary());
    }
}
