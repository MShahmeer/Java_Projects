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
public class Practice1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,5,6,8,10,12};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the element to search : ");
        int i = input.nextInt();
        
        for (int j = 0; j < array.length; j++) {
            if (array[j]==i) {
                System.out.println("The element is present at index :"+j);
                break;
            }
            else if (j==array.length-1 && array[j]!=i){
                System.out.println("The element is not present in the given array");
            }
        }
        
    }
}
