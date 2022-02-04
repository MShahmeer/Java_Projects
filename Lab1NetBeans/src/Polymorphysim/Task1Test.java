/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphysim;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.Scanner;
public class Task1Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of members: ");
        int number = input.nextInt();
        
        Faculty[] faculty = new Faculty[number];
        
        
        System.out.println("Enter 1 for "+"Permanent Faculty "+"Enter 2 for "+"Visiting Faculty");
        int choice;
        for (int i = 0; i < faculty.length; i++) {
            
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            
            System.out.print("Enter Employee id: ");
            int id = input.nextInt();
            input.nextLine();
            
            System.out.print("Enter Employee Name: ");
            String employeeName = input.nextLine();
            
            
            if(choice == 1){
                System.out.print("Enter the Salary: ");
                Double salary = input.nextDouble();
                
                faculty[i] = new PermanentFaculty(salary,id,employeeName);
            }
            
            else if(choice == 2){
                System.out.print("Enter employee Hour: ");
                double hour = input.nextDouble();
                
                System.out.print("Enter salary per/hr: ");
                double salaryPerHr = input.nextDouble();
                
                faculty[i] = new VisitingFaculty(hour,salaryPerHr,id,employeeName);
            }
        }
        
        double permanentSalary = 0;
        double visitingSalary = 0;
        double permanentUpDatedSalary = 0;
        for (int i = 0; i < faculty.length; i++) {
            
            if (faculty[i] instanceof PermanentFaculty) {
                PermanentFaculty permanentFaculty = (PermanentFaculty) faculty[i];
                permanentSalary = permanentSalary + permanentFaculty.calculateSalary();
                
                permanentUpDatedSalary += (permanentFaculty.calculateSalary()*10)/100;
            }
            
            else if (faculty[i] instanceof VisitingFaculty) {
                VisitingFaculty visitingFaculty = (VisitingFaculty) faculty[i];
                visitingSalary += visitingFaculty.calculateSalary();
            } 
        }
        
        System.out.println("Salary of Permanent Faculty is: "+permanentSalary);
        System.out.println("Salary of Visiting Faculty is: "+visitingSalary);
        
        System.out.println("Increased Salary Of Permanent Faculty: "+(permanentUpDatedSalary+permanentSalary));
    }
}
