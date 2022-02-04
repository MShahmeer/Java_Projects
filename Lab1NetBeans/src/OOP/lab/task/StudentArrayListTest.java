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
import java.util.*;

public class StudentArrayListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<StudentArrayList> student = new ArrayList<>();
        StudentArrayList s1 = new StudentArrayList("Ali", "sp19-bse-010");
        StudentArrayList s2 = new StudentArrayList("Ahmad", "sp19-bse-001");
        StudentArrayList s3 = new StudentArrayList("Talha", "sp19-bse-002");
        student.add(s1);
        student.add(s2);
        student.add(s3);
        System.out.println("<<<<<<After adding first 3 objects>>>>>>");
        display(student);
        System.out.println("\n\n");

        StudentArrayList s4 = new StudentArrayList("Waleed", "sp19-bse-020");
        student.add(0, s4);
        System.out.println("<<<<<<After adding Waleed objects>>>>>>");
        display(student);
        System.out.println("\n\n");

        
        StudentArrayList s5 = new StudentArrayList("Maha", "sp19-bse-002");
        System.out.println("<<<<<<After adding Maha object>>>>>>");
        student.add(s5);
        display(student);
        System.out.println("\n\n");

        
        System.out.println("<<<<<<After removing second object by index>>>>>>");
        student.remove(1);
        display(student);
        System.out.println("\n\n");

        
        System.out.println("<<<<<<After removing first object by object reference>>>>>>");
        student.remove(s1);
        display(student);
        System.out.println("\n\n");

        
        System.out.println("<<<<<<After replacing 1st student with new student>>>>>>");
        student.add(0, new StudentArrayList("Shahmeer","135"));
        display(student);
        System.out.println("\n\n");

        
    }

    static void display(ArrayList<StudentArrayList> students) {
        for (StudentArrayList student : students) {
            System.out.println("Name: "+student.getName());
            System.out.println("ID: "+student.getId());
        }
    }

}
