/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author Muhammad Shameer
 */
public class Student {
    private int id;
    private String name;
    private int[] marks;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    
    int sum =0;
    private double calculateAverageMarks(){
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        
        return sum/marks.length;
    }
}
