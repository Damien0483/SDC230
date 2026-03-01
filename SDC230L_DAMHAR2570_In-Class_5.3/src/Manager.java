/*================================================================
Name: Damien Harmon
Date: February 28, 2026
Assignment: In-Class 5.3 Multilevel Inheritance
Description: SDC230L Object-Oriented Programming using Java Lab
=================================================================*/
public class Manager extends SalariedEmployee {
    
    private double bonus;

    // Constructor
    public Manager(String name, int employeeId, double annualSalary, double bonus) {
        super(name, employeeId, annualSalary); // Call the constructor of the SalariedEmployee class
        this.bonus = bonus;
    }

    // Getter for bonus
    public double getBonus() {
        return bonus;
    }

    // Setter for bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Override displayInfo to include bonus information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the SalariedEmployee class
        System.out.println("Bonus: $" + bonus);
    }
    public double getBonusAmount() {
        return bonus;
    }

    // Setter for bonus
    public void setBonusAmount(double bonus) {
        this.bonus = bonus;
    }

     @Override
    public double calculateBiWeeklyPay() {
        return (getAnnualSalary() + bonus) / 26; // Include bonus in bi-weekly pay calculation
    }
    
}
