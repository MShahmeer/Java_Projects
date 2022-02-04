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

public class DivisionTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Numerator: ");
        int numerator = input.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = input.nextInt();

        Division division = new Division(numerator, denominator);

        while (true) {
            try {
                division.divide();
                break;
            } catch (ArithmeticException e) {
                System.out.println("Denominator must not be zero");
            }
        }
        

    }
}
