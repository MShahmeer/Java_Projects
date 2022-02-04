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
public class Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int [100];
        
        //System.out.println((int)(Math.random() *101));
        
        for (int i = 0; i < array.length; i++) {
            array[i] =(int)(Math.random() *101);
        }
        
        System.out.println("-----Elements are-----");
        for (int b : array) {
            System.out.println(b);
        }
    }
}
