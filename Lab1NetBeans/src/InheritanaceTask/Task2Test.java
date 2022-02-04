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
import java.util.*;
public class Task2Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Information");
        
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter City: ");
        String city = input.nextLine();
        
        System.out.print("Enter Country: ");
        String country = input.nextLine();
        
        System.out.print("Enter Program: ");
        String program = input.nextLine();
        
        System.out.print("Enter Year: ");
        int year = input.nextInt();
        
        System.out.print("Enter fee: ");
        int fee = input.nextInt();
        
        input.nextLine();
        System.out.print("\n\n");
        System.out.println("Enter Staff Information");
        
        System.out.print("Enter Name: ");
        String sname = input.nextLine();
        
        System.out.print("Enter City: ");
        String scity = input.nextLine();
        
        System.out.print("Enter Country: ");
        String scountry = input.nextLine();
        
        System.out.print("Enter Pay: ");
        int pay = input.nextInt();
        
        Student student = new Student(program, fee, year, name,new Adress(city,country));
        
        Staff staff = new Staff(pay, sname, new Adress(scity,scountry));
        
        System.out.println("Student information is given below:");
        System.out.println("Name: "+student.getName());
        System.out.println("Adress: "+student.getAdress().getCity()+" "+student.getAdress().getCountry());
        System.out.println("Program: "+student.getProgram());
        System.out.println("Year: "+student.getYear());
        System.out.println("Fee: "+student.getFee());
        
        System.out.println("Staff information is given below:");
        System.out.println("Name: "+staff.getName());
        System.out.println("Adress: "+staff.getAdress().getCity()+" "+staff.getAdress().getCountry());
    }
}
