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
import java.util.*;
public class SectionAQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Students: ");
        int students = input.nextInt();
        
        ArrayList<Student2> student = new ArrayList<>();
        
        for (int i = 0; i < students; i++) {
            System.out.print("Enter the id of "+i+1+" student: ");
            int id = input.nextInt();
            input.nextLine();
            
            System.out.print("Enter the name of "+i+1+" student: ");
            String name = input.nextLine();
            
            student.add(new Student2(id, name));
            
        }
        
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).toString()); 
        }
        
        
        
    }
}
