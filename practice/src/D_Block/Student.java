/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Block;

/**
 *
 * @author Muhammad Shameer
 */
import Quiz.Student2;
import java.util.*;
public class Student extends Student2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int students = input.nextInt();
        
        
        Student2[][] student = new Student2[students][];
        
        for (int i = 0; i < student.length; i++) {
            System.out.print("Enter the name of"+(i+1)+" Student: ");
            String name = input.nextLine();
            System.out.print("Enter the id of "+(i+1)+"Student: ");
            int id = input.nextInt();
            System.out.println("Enter the marks of "+(i+1)+"Student: ");
            int marks = input.nextInt();
            
            student[i] = new Student2[marks];
            
            student[i] = 
            
        }
    }

    public Student(int id, String name) {
        super(id, name);
    }
    
}
