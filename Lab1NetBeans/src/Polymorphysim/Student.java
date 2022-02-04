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
public class Student {
    
    private String program;
    private int year;
    private double fee;

    public Student(String program, int year, double fee) {
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return ("Student [ "+super.toString()+" ,Program"+getProgram()+",Year "+getYear()+", "+getFee()+" ]"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
