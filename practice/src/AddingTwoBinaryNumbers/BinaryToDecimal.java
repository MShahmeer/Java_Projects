/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddingTwoBinaryNumbers;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.Scanner;
public class BinaryToDecimal {
    String FirstNumber;
    String SecondNumber;
    public static void main(String[] args){
        System.out.print("Enter the First Binary Number ");
        Scanner input = new Scanner(System.in);
        BinaryToDecimal b = new BinaryToDecimal();
        b.FirstNumber = input.nextLine();
        System.out.print("Enter the Second Binary Number ");
        Scanner nextinput = new Scanner(System.in);
        b.SecondNumber = nextinput.nextLine();
        AddMethod Ac =new AddMethod();
        Ac.add(b.FirstNumber, b.SecondNumber);
    }
    
    
}
