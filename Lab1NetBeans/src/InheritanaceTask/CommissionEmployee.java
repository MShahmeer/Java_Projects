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
public class CommissionEmployee extends Employee {
    private double grossSale;
    private final double commissionRate;
    private double bonus;

    public CommissionEmployee(double grossSale, double commissionRate, String firstName, String lastName, String socialSecrityNumber) {
        super(firstName, lastName, socialSecrityNumber);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    
    @Override
    public String toString(){
        return String.format(super.toString(),"%n%s: %f%n%s: %.2f","Gross Sale ",grossSale,"Commission Rate ",commissionRate);   
    }
    
    public double earnings(){
        double commission = commissionRate * grossSale;
        if(commission>=10000 || commission>=20000){
            bonus = 5000;
            commission = commission+bonus;
        }
        else if(commission>=20000 || commission>=50000){
            bonus = 10000;
            commission = commission+bonus;
        }
        else if(commission>50000){
            bonus = 20000;
            commission = commission+bonus;
        }
        return commission;   
    }
}
