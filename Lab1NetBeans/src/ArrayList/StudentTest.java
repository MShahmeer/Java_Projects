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
import java.util.*;
public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the total Students: ");
        int students = input.nextInt();
        input.nextLine();
        ArrayList<Student> student = new ArrayList<>();
        
        for (int i = 0; i < students; i++) {
            System.out.print("Enter the "+(i+1)+" Student Name");
            String name = input.nextLine();
            
            System.out.print("Enter the "+(i+1)+" Student Id");
            int id = input.nextInt();
            
            Student s = new Student(id,name);
            System.out.print("Enter the total subjects of "+(i+1)+" Student");
            int subjects = input.nextInt();
            
            s.setMarks(new int[subjects]);
            for (int j = 0; j < s.getMarks().length; j++) {
                System.out.print("Enter marks of Student "+(i+1)+" in "+(j+1)+" Subject");
                s.getMarks()[j] = input.nextInt();
            }
            input.nextLine();
            
            student.add(s);
        }
        
        for (int i = 0; i < student.size(); i++) {
            System.out.println("Student "+(i+1)+" Name: "+student.get(i).getName());
            System.out.println("Student "+(i+1)+"Id: "+student.get(i).getId());
            for (int j = 0; j < student.get(i).getMarks().length; j++) {
                System.out.println("Subject "+(j+1)+"Marks "+student.get(i).getMarks()[j]);


            }
        }
    }
}
