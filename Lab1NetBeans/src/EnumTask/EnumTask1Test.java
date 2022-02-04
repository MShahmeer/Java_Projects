/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumTask;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.*;
public class EnumTask1Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Number of Employees : ");
        int empNumber = input.nextInt();
        
        input.nextLine();
        
        Employee[] employees = new Employee[empNumber];
        
        for (int i = 0; i <employees.length ; i++) {
            System.out.printf("\n");
            System.out.println("****Employee "+(i+1)+" information****");
            System.out.printf("\n");
            
            System.out.print("Enter the Name : ");
            String name = input.nextLine();
        
            System.out.print("Enter the ID : ");
            int id = input.nextInt();
        
            input.nextLine();
            System.out.print("Enter the gender : ");
            String gender = input.nextLine();
        
        
            System.out.print("Enter the basic Salary : ");
            double basicSalary = input.nextDouble();
            employees[i] = new Employee(id,name,basicSalary,Gender.valueOf(gender));  
            input.nextLine();
            System.out.print("\n\n");
        }
        
        
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("\n\n");
            System.out.println("<<<<< Employee #"+(i+1)+" Information >>>>>");
            System.out.printf("\n");
            
            System.out.println("---- ID           : "+employees[i].getId());
            System.out.println("---- Name         : "+employees[i].getName());
            System.out.println("---- Basic Salary : "+employees[i].getBasicSalary());
            System.out.println("---- Bonus        : "+employees[i].claculateBonus());
            
        }
        
       
        
    }
}
