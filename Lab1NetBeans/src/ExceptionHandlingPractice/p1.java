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
public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter the Nominator: ");
            int n = input.nextInt();
            
            System.out.print("Enter the denominator: ");
            int d = input.nextInt();
            try{
                System.out.println("Your Required answer is: "+(n/d));
                break;
            }
            catch(ArithmeticException e){
                System.out.println("Enter the correct denominator");
            }
        }
    }
}
