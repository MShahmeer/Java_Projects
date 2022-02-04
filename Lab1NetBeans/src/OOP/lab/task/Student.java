/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.lab.task;

/**
 *
 * @author Muhammad Shameer
 */
public class Student {
    
    public int id;
    private String name;
    private String cgpa;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    } 
      
    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getCgpa() {
        return cgpa;
    }
    
    
}
