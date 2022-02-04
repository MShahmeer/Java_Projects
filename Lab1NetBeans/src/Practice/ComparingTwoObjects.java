/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author Muhammad Shameer
 */
public class ComparingTwoObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student = new Student(135,"Shahmeer");
        Student student2 = new Student(135,"Shahmeer");
        System.out.println("By Equals Method "+student.equals(student2));
        System.out.println("By (==) "+(student == student2));
        
    }
    
}
