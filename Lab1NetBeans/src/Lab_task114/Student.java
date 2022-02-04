/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_task114;

/**
 *
 * @author Muhammad Shameer
 */
public class Student {
    private String studentName;
    private String studentEmail;
    private String studentCnic;
    private Course[] course;
    private Adress[] adress;

    public Student(String studentName, String studentCnic, Adress[] adress) {
        this.studentName = studentName;
        this.studentCnic = studentCnic;
        this.adress = adress;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setCourse(Course[] course) {
        this.course = course;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentCnic() {
        return studentCnic;
    }

    public Course[] getCourse() {
        return course;
    }

    public Adress[] getAdress() {
        return adress;
    }
        
}
