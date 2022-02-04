package com.bitspedia.inheritance1;

public class Student extends Person {
    private String courseName;

    public Student(int ID, String courseName) {
        this.ID = ID;
        this.courseName = courseName;
    }

    public void m2(){
        System.out.println("m2 called ... ");
        m1();
    }
}