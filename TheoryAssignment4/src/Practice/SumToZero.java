/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Scanner;

/**
 *
 * @author Muhammad Shameer
 */
public class SumToZero {
    
    public static void checkIfZero(int[] array){
        for (int i = 0; i < array.length; i++) {
            
            for (int j = i+1; j < array.length; j++) {
                
                for (int k = j+1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        printZeroInSet(array[i],array[j],array[k]);
                    }
                    
                }
                
            }
            
        }
        
    }
    
    public static void printZeroInSet(int first, int second, int third){
        System.out.println("[ "+first+","+second+","+third+" ]");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total elements in array: ");
        int total = input.nextInt();
        int[] array = new int[total];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Element "+(i+1)+": ");
            array[i] = input.nextInt();
        }
        
        System.out.print("Input Array: [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("]");
        
        System.out.println("OutPut: ");
        
        checkIfZero(array);
    }
    
}
