/*****************************************************************************
 * Your Name: Damien Harmon
 * Date of development: February 7, 2026
 * Assignment: SDC230_Performance_Assessment_1.9
 * Description: This class models an Employee with first name, last name,
 *              and monthly salary. Includes constructor, getters, setters,
 *              and salary validation.
 ****************************************************************************/

public class Employee {

    // Private instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Only set salary if >= 1000
        if (monthlySalary >= 1000) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 1000) {
            this.monthlySalary = monthlySalary;
        }
        // If invalid, ignore the update
    }
}