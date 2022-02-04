/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author Muhammad Shameer
 */
public class Student2 {
    private int id;
    private String name;

    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String toString(){
        return("Student Name: "+getName()+" Student Id: "+getId());
    }
}
