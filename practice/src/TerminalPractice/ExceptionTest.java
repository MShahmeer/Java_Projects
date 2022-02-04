/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TerminalPractice;

/**
 *
 * @author Muhammad Shameer
 */
public class ExceptionTest {

    public static void main(String[] args) {
        try {
            System.out.println("Welcome to Java");
            int[] a = new int[10];
            a[10] = 1;
            System.out.println("Welcome to Python");
        } catch (Exception ex) {
            System.out.println("There is an exception");
    }
    System.out.println("Bye.");
    }
}
