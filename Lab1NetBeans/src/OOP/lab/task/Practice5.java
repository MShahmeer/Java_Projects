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
public class Practice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element in the array : ");
        int number = input.nextInt();
        
        int[] array = new int[number];
        
        System.out.println("Enter the elements in array");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        
        System.out.print("Enter the number to remove : ");
        int remove = input.nextInt();
        
                
        System.out.println("The Elements after removing "+remove);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == remove) {
                continue;
            }else{
                System.out.println(array[i]);
            }
        }
        
    }
}
