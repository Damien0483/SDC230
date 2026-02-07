/******************************************************************************
 * Your Name: Damien Harmon
 * Date: February 7, 2026
 * Assignment: SDC230_Performance_Assessment_1.9
 * Description: Main application class that creates Employee objects,
 *              displays their information, updates values, and prints again.
 *****************************************************************************/

public class App {

    public static void main(String[] args) {

        // Required printed line
        System.out.println("Your Name - Week 1 PA Classes\n");

        // Create 2 Employee objects
        Employee emp1 = new Employee("Spike", "Spiegel", 2500);
        Employee emp2 = new Employee("Jet", "Black", 500); // invalid salary

        // Print initial employee information
        System.out.println("Initial Employee Information:");
        System.out.println("-----------------------------");
        System.out.println("NAME: " + emp1.getFirstName() + " " + emp1.getLastName() + "\n" + 
                           "Monthly Salary: $" + emp1.getMonthlySalary());
        System.out.println("NAME: " + emp2.getFirstName() + " " + emp2.getLastName() + "\n" +
                           "Monthly Salary: $" + emp2.getMonthlySalary());

        // Update employee information
        emp1.setLastName("Lee");   // update last name
        emp2.setFirstName("Bruce");    // update first name
        emp1.setMonthlySalary(3200);   // valid update
        emp2.setMonthlySalary(1500);   // now valid

        // Print updated employee information
        System.out.println("\nUpdated Employee Information:");
        System.out.println("-----------------------------");
        System.out.println("Name: " + emp1.getFirstName() + " " + emp1.getLastName() + "\n" +
                           "Monthly Salary: $" + emp1.getMonthlySalary());
        System.out.println("Name: " + emp2.getFirstName() + " " + emp2.getLastName() + "\n" + 
                           "Monthly Salary: $" + emp2.getMonthlySalary());
    }
}