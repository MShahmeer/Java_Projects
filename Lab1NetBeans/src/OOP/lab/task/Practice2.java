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
public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Number of Elements in array : ");
        int in = input.nextInt();
        
        int[] array = new int[in];
        System.out.println("Enter the number of element in array :");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt(); 
        }
               
        Arrays.sort(array);
        
        System.out.println("The second highest element in the array is : "+array[array.length -2]);
        
        int [] nextArray = Arrays.copyOf(array,in);
        for (int i = 0; i < nextArray.length; i++) {
            System.out.println("Element "+i+" : "+nextArray[i]);
        }
    }
}
