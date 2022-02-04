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
public class HourlyEmployee extends Employee{
    private int hours;
    private double wage;

    public HourlyEmployee(int hours, double wage, String firstName, String lastName, String socialSecrityNumber) {
        super(firstName, lastName, socialSecrityNumber);
        setHours(hours);
        setWage(wage);
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(int hours) {
        if(hours>=1 || hours<=168){
            this.hours = hours;
        }
    }

    public void setWage(double wage) {
        if(wage>=0){
            this.wage = wage;
        } 
    }
    
    public double earnings(){
        return hours*wage;
    }
    
    @Override
    public String toString(){
        return String.format(super.toString(),"%n%s: %.2f%n%s: %.2f","Hours ",hours,"Wage ",wage);
    }   
}
