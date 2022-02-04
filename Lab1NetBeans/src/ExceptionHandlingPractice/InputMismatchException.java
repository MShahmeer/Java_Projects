/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandlingPractice;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.Scanner;
public class InputMismatchException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[4];
        
        try{
            for (int i = 0; i<10; i++) {
                System.out.println("Enter "+ i +"element in array");
                array[i] = input.nextInt();
            }
        }
        catch(NullPointerException e){
            System.out.println("Empty");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exceeding elements");
        }
    }
            
}
