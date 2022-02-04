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
import java.math.BigInteger;
import java.util.*;
public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to check even odd : ");
        int number = input.nextInt();
        
        
        System.out.println((number & 1)==0 ? "Even" : "Odd");
        boolean b =BigInteger.valueOf(number).isProbablePrime(number);
        
        if (b==true) {
            System.out.println("yes it is prime");
        } else {
            System.out.println("Not Prime");
        }
        
    }
}
