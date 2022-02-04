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
public class StudentArrayList {
    
    private String name;
    private String id;
    private String cgpa;

    public StudentArrayList(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCgpa() {
        return cgpa;
    }

    
}
