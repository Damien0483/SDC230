/*================================================================
Name: Damien Harmon
Date: February 28, 2026
Assignment: In-Class 5.3 Multilevel Inheritance
Description: SDC230L Object-Oriented Programming using Java Lab
=================================================================*/
public class SalariedEmployee extends Employee {
    
    private double annualSalary;

    // Constructor
    public SalariedEmployee(String name, int employeeId, double annualSalary) {
        super(name, employeeId); // Call the constructor of the Employee class
        this.annualSalary = annualSalary;
    }

    // Getter for annual salary
    public double getAnnualSalary() {
        return annualSalary;
    }

    // Setter for annual salary
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    // Override displayInfo to include salary information
    @Override
    public void displayInfo() {
        String formattedPay = String.format("%.2f", calculateBiWeeklyPay());
        super.displayInfo(); // Call the displayInfo method of the Employee class
        System.out.println("Annual Salary: $" + annualSalary);
        System.out.println("Bi-Weekly Pay: $" + formattedPay);
    }

    public double calculateBiWeeklyPay() {
        return annualSalary / 26; // Assuming 26 bi-weekly periods in a year
    }
    
}
