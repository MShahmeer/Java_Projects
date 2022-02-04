/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_task114;

/**
 *
 * @author Muhammad Shameer   LAB TASK 11.4 ARRAYS
 */
import java.util.*;
public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of Students in class : ");
        int number = input.nextInt();
        
        input.nextLine();
        Student[] totalStudents = new Student[number];
        
        for (int i = 0; i < totalStudents.length; i++) {
            
            System.out.print("Enter the Name of student "+(i+1)+" : ");
            String name = input.nextLine();            
            
            System.out.print("Enter the Email of student "+(i+1)+" : ");
            String email = input.nextLine();            
            
            System.out.print("Enter the Cnic of student "+(i+1)+" : ");
            String cnic = input.nextLine();
            
            System.out.print("Enter the number of adresses of student "+(i+1)+" : ");
            int adress = input.nextInt();
            
            input.nextLine();
            
            totalStudents[i] =new Student(name,cnic,new Adress[adress]);            
            totalStudents[i].setStudentEmail(email);
            
            for (int j = 0; j < totalStudents[i].getAdress().length; j++) {
                
                System.out.print("Enter the "+(j+1)+" Country Name of Student"+(i+1)+" :");
                String countryName = input.nextLine();                
                
                System.out.print("Enter the "+(j+1)+" City Name of Student"+(i+1)+" :");
                String cityName = input.nextLine();                
                
                System.out.print("Enter the "+(j+1)+" StreetAdress of Student"+(i+1)+" :");
                String streetAdress = input.nextLine();
                
                totalStudents[i].getAdress()[j] = new Adress(streetAdress,cityName,countryName);                
                
                System.out.print("Enter the "+(j+1)+" Country Code of Student"+(i+1)+" :");
                String countryCode = input.nextLine();                
                
                System.out.print("Enter the "+(j+1)+" City Code of Student"+(i+1)+" :");
                String cityCode = input.nextLine();                
                
                System.out.print("Enter the "+(j+1)+" Line Number of Student"+(i+1)+" :");
                String lineNumber = input.nextLine();
                
                totalStudents[i].getAdress()[j].setPhoneNumber(new PhoneNumber(countryCode,cityCode,lineNumber));
                
            }
                      
            System.out.print("Enter the number of courses of student "+(i+1)+" : ");
            int courses = input.nextInt();
            
            input.nextLine();
            totalStudents[i].setCourse(new Course[courses]);           
            
            for (int j = 0; j < totalStudents[i].getCourse().length; j++) {
                
                System.out.print("Enter the "+(j+1)+" Course Code of Student "+(i+1)+" : ");
                String courseCode = input.nextLine();
                
                System.out.print("Enter the "+(j+1)+" Course Title of Student "+(i+1)+" : ");
                String courseTitle = input.nextLine();
                
                totalStudents[i].getCourse()[j] = new Course(courseCode,courseTitle);
                
            }             
        }
        
        
        System.out.println();
        
        System.out.println("<<<<<<<<<<<<<< Student Information >>>>>>>>>>>>>");
        
        for (int i = 0; i < totalStudents.length; i++) {
            
            System.out.println();
            System.out.println("---- Student "+(i+1)+" Name :"+totalStudents[i].getStudentName());
            System.out.println("---- Student "+(i+1)+" CNIC :"+totalStudents[i].getStudentCnic());
            System.out.println("---- Student "+(i+1)+" Email :"+totalStudents[i].getStudentEmail());
            
            for (int j = 0; j < totalStudents[i].getAdress().length; j++) {
                System.out.println();
                System.out.println("<<<<<< Adress Number "+(j+1)+" details >>>>>>");
                System.out.println();
                System.out.println("---- Country Name of "+(i+1)+" Student : "+totalStudents[i].getAdress()[j].getCountryName());
                System.out.println("---- City Name of "+(i+1)+" Student: "+totalStudents[i].getAdress()[j].getCityName());
                System.out.println("---- Street Adress of "+(i+1)+" Student : "+totalStudents[i].getAdress()[j].getStreetAdress());
                System.out.println("---- Country Code of "+(i+1)+" Student : "+totalStudents[i].getAdress()[j].getPhoneNumber().getCountryCode());
                System.out.println("---- City Code of "+(i+1)+" Student : "+totalStudents[i].getAdress()[j].getPhoneNumber().getCityCode());
                System.out.println("---- Line Number of "+(i+1)+" Student : "+totalStudents[i].getAdress()[j].getPhoneNumber().getLineNumber());                
            }
            
            
            for (int j = 0; j < totalStudents[i].getCourse().length; j++) {
                System.out.println();
                System.out.println("<<<<<< Course Number "+(j+1)+" details >>>>>>");
                System.out.println();
                System.out.println("---- Course Code of Student "+(i+1)+" : "+totalStudents[i].getCourse()[j].getCourseCode());
                System.out.println("---- Course Title of Student "+(i+1)+" : "+totalStudents[i].getCourse()[j].getCourseTitle());
            }
            
        }
    }
}
