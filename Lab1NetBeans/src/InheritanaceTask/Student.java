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
public class Student extends Person {
    private String program;
    private int fee;
    private int year;

    public Student(String program, int fee, int year, String name, Adress adress) {
        super(name, adress);
        this.program = program;
        this.fee = fee;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public int getFee() {
        return fee;
    }

    public int getYear() {
        return year;
    }
    
}
