/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sessional_2_tasks;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.ArrayList;
public class Batch {
    
    Section[] section;
    Courses courses = new Courses();
    public String programName;
    
    ArrayList<String> course = new ArrayList<>();
    
   public void schemeOfStudeies(){
    
       if(programName.equalsIgnoreCase("BSSE")){
            courses.courses.add("Multivariable Calsulus");
            courses.courses.add("Islamiyat(Hybrid)");
            courses.courses.add("Object Oriented Programming(Java)");
            courses.courses.add("Digital Logic Design");
            courses.courses.add("Discrete Structures"); 
       }
       else if(programName.equalsIgnoreCase("BSCS")){
            courses.courses.add("Programming Fundamentals");
            courses.courses.add("English");
            courses.courses.add("Physics Laws");
            courses.courses.add("Data Structures");
            courses.courses.add("Algorithims");
            courses.courses.add("Introduction to Information And Communication Technology");
       }
    }
}
