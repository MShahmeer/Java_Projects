/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradeBookTask;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       GradeBookTask obj1 = new GradeBookTask();
       
       System.out.print("Enter the number of Students :");
       int noOfStudents = input.nextInt();
       
       obj1.setGrades(new int[noOfStudents][]);
       
       for(int i=0; i<obj1.getGrades().length ;i++){
           System.out.print("Enter the number of Test of Student "+(i+1)+" : ");
           int test = input.nextInt();
           System.out.println("Student with maximum test is at : "+obj1.getMaximumMarks(test));
           
           obj1.getAverageMaximumMarks(test);
           
           
           
       }
    }
}
