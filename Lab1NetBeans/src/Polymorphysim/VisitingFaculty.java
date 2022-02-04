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
public class VisitingFaculty extends Faculty {
    private double hours;
    private double salaryPerHr;

    public VisitingFaculty(double hours, double salaryPerHr, int id, String name) {
        super(id, name);
        this.hours = hours;
        this.salaryPerHr = salaryPerHr;
    }

    @Override
    public double calculateSalary() {
        return hours*salaryPerHr; //To change body of generated methods, choose Tools | Templates.
    }

}
