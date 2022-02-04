/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Muhammad Shameer
 */
//import java.util.Scanner;
public class Task1Test {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        Date date = new Date(30,12,2020);
        Time time = new Time(60,60,24);
        
        date.tick();
        System.out.println(date);
        time.tick();
        System.out.println(time);
    }
}
