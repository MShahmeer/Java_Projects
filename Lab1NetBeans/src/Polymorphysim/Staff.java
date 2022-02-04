/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphysim;

/**
 *
 * @author Muhammad Shameer
 */
public class Staff {
    
    private String school;
    private double pay;

    public Staff(String school, double pay) {
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return ("Staff ["+super.toString()+", School "+getSchool()+" Pay "+getPay()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
