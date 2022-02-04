/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandlingPractice;

import java.util.Scanner;

/**
 *
 * @author Muhammad Shameer
 */

public class CommandTest {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        args = new String[100];
        for (int i = 0; i < args.length; i++) {
            int id = input.nextInt();
            input.nextLine();
            String name = input.nextLine();
            boolean status = input.nextBoolean();
           // args[i] = new String[new User(id, name, status)];
        }
        
        
    }
}
