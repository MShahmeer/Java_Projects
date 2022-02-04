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
public class DisplayData {
    
    public static void display(double grossSale,double commissionRate,String fName,String lName,String socialSecurityNumber){
        CommissionEmployee commissionEmployee = new CommissionEmployee(grossSale,commissionRate,fName,lName,socialSecurityNumber);
        System.out.println(commissionEmployee);
        System.out.println("Total Earings Are: "+commissionEmployee.earnings());
    }
    
    public static void display(double basicSalary,double grossSale,double commissionRate,String fName,String lName,String socialSecurityNumber){
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(basicSalary,grossSale,commissionRate,fName,lName,socialSecurityNumber);
        System.out.println(basePlusCommissionEmployee);
        System.out.println("Total Earnings Are: "+basePlusCommissionEmployee.earnings());
    }
    
    public static void display(double fixedWeeklySalary,int noOfWeeks,String fName,String lName,String socialSecurityNumber){
        SalariedEmployee salariedEmployee = new SalariedEmployee(fixedWeeklySalary,noOfWeeks,fName,lName,socialSecurityNumber);
        System.out.println(salariedEmployee);
        System.out.println("Total Earnings Are: "+salariedEmployee.earnings());
    }
    
    public static void display(int hours,double wage,String fName,String lName,String socialSecurityNumber){
        HourlyEmployee hourlyEmployee= new HourlyEmployee(hours,wage,fName,lName,socialSecurityNumber);
        System.out.println(hourlyEmployee);
        System.out.println("Total Earnings Are: "+hourlyEmployee.earnings());   
    }
}
