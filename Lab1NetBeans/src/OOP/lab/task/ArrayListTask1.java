/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.lab.task;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.*;
public class ArrayListTask1 {
    
    public static void main(String [] args){
        
        ArrayList<String>student = new ArrayList<>();
        
        student.add("Ali");
        student.add("Ahmad");
        student.add("Umar");
        student.add("Talha");
       
        List<ArrayList> list = Arrays.asList(student);
        
        System.out.println("The list is :"+list);
        
        System.out.println("Size of the array list now : "+student.size());
        
        display(student);
        System.out.println("------------------------------------------");
        System.out.println();
        
        student.add("Tooba");
        student.add("Waheed");
        System.out.println("After Adding Tooba and Waheed");
        display(student);
        System.out.println("------------------------------------------");
        System.out.println();
        
        System.out.println("After removing Ali from list");
        student.remove("Ali");
        display(student);
        System.out.println("------------------------------------------");
        System.out.println();
                      
        System.out.println("Size of the array list now : "+student.size());
        
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
        student.add(0,"Hamza");
        System.out.println("After adding Hamza to the first Index of the ArrayList ");
        display(student);
        
        System.out.println("------------------------------------------");
        System.out.println();
        
        student.add(1,"Rizwan");
        System.out.println("After adding Rizwan to second index");
        display(student);        
        System.out.println("------------------------------------------");
        System.out.println();
        
        Collections.sort(student);
        System.out.println("----After sorting----");
        display(student);
        System.out.println("------------------------------------------");
        System.out.println();
        
        Collections.sort(student,Collections.reverseOrder());
        System.out.println("--Sorting in decending order--");
        display(student);
        System.out.println("------------------------------------------");
        System.out.println();
        
        student.remove(student.size()-1);
        System.out.println("--After removing the last element of the array--");
        display(student);
        System.out.println("------------------------------------------");
        System.out.println();
        
        System.out.println("The second element is : "+student.get(1));
        System.out.println("------------------------------------------");
        System.out.println();
        
        System.out.println("--After updating the first name--");
        student.set(0, "Muhammad Waleed");
        display(student);
        System.out.println("------------------------------------------");
        System.out.println();
        
        student.remove("Muhammad Waleed");
        System.out.println("--After removing first name--");
        display(student);
        System.out.println("------------------------------------------");
        System.out.println();
        
        student.removeAll(student);
        System.out.println("After removing all elements");
        display(student);
        System.out.println("------------------------------------------");
        System.out.println();
        
    }
    
    public static void display(ArrayList<String> student){
        for(String n : student){
            System.out.println(n);
        }
    }
}
