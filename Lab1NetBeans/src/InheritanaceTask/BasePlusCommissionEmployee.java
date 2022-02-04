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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double basicSalary;

    public BasePlusCommissionEmployee(double basicSalary, double grossSale, double commissionRate, String firstName, String lastName, String socialSecrityNumber) {
        super(grossSale, commissionRate, firstName, lastName, socialSecrityNumber);
        this.basicSalary = basicSalary;
    }
    
    @Override
    public double earnings(){
        double earnings = super.earnings();
        
        return basicSalary * earnings;
    }
    
    public String toString(){
        return String.format(super.toString()," %n%s: %.2f","Basic Salary",basicSalary);
    }
    
}
