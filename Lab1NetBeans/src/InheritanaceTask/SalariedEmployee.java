/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanaceTask;

/**
 *
 * @author Muhammad Shameer
 */
public class SalariedEmployee extends Employee {
    private final double fixedWeeklySalary;
    private int noOfWeeks;

    public SalariedEmployee(double fixedWeeklySalary, int noOfWeeks, String firstName, String lastName, String socialSecrityNumber) {
        super(firstName, lastName, socialSecrityNumber);
        this.fixedWeeklySalary = fixedWeeklySalary;
        this.noOfWeeks = noOfWeeks;
    }
    
    public double earnings(){
        return fixedWeeklySalary*noOfWeeks;
    }
    
    @Override
    public String toString(){
        return String.format(super.toString(),"%n%s: %.2f","Fixed Weekly Salary ",fixedWeeklySalary);
    }
    
    
}
