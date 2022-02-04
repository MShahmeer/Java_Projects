/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanaceTask;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.Scanner;
public class Task3Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String fName = input.nextLine();
        
        System.out.print("Enter Second Name: ");
        String lName = input.nextLine();
        
        System.out.print("Enter Social Security Number: ");
        String socialSecurityNumber = input.nextLine();
        
        System.out.println("<<<< Select the catergory of Employee >>>>");
        System.out.printf("(a): Commission Employee\n(b): BasePlusCommission Employee\n(c): Salaried Employee\n(d): Hourly Employee\nPlease Enter: ");
        String select  = input.nextLine();
        
        if ((select.equals("A") || select.equals("a")) || (select.equals("B") || select.equals("b"))) {
            System.out.print("Enter Commission Rate: ");
            double commissionRate = input.nextDouble();
            
            System.out.print("Enter the Gross Sales: ");
            double grossSale = input.nextDouble(); 
            
            if ((select.equals("A") || select.equals("a"))) {
                DisplayData.display(grossSale,commissionRate,fName,lName,socialSecurityNumber);
            }
            
            if ((select.equals("B") || select.equals("b"))) {
                System.out.print("Enter Basic Salary: ");
                double basicSalary = input.nextDouble();

                DisplayData.display(basicSalary,grossSale,commissionRate,fName,lName,socialSecurityNumber);
            }
            
        }
        
        if (select.equals("C") || select.equals("c")) {
            System.out.print("Enter Fixed Weekly Salary: ");
            double fixedWeeklySalary = input.nextDouble();
            
            System.out.print("Enter number of weeks: ");
            int noOfWeeks = input.nextInt();
         
            DisplayData.display(fixedWeeklySalary,noOfWeeks,fName,lName,socialSecurityNumber);
            
        }
        
        if (select.equals("D") || select.equals("d")) {
            System.out.print("Enter the Wage: ");
            double wage = input.nextDouble();
            
            System.out.print("Enter the hours: ");
            int hours = input.nextInt();
                        
            DisplayData.display(hours,wage,fName,lName,socialSecurityNumber);
        }
        
    }
    
}
