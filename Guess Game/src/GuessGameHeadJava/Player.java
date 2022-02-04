/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuessGameHeadJava;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.Scanner;
public class Player {
    public int number;
    public void guess(){
        System.out.print("Enter the number between 0 and 9 ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
    }
    
}
