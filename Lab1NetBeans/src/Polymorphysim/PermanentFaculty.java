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
public class PermanentFaculty extends Faculty {
    private double salary;

    public PermanentFaculty(double salary, int id, String name) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary; //To change body of generated methods, choose Tools | Templates.
    }

    
}
