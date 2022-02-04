/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.lab.terminal;

import java.util.Scanner;

/**
 *
 * @author Muhammad Shameer
 */
public class TerminalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pId = 0;
        String pName = null;
        double price= 0.0;
        
        int cId =0;
        String cName =null;
        String cGender =null;
        String cEmail =null;
        String cMemberShip =null;
        String cContact =null;
        String cAdress =null;
        String y =null;
        
        
        do {
            System.out.println("Enter Products");
            System.out.print("Enter Name: ");
            pName = input.nextLine();
            
            System.out.print("Enter Id: ");
            pId = input.nextInt();
            
            System.out.print("Enter Price: ");
            price = input.nextDouble();
            
            DataBase.addProduct(cId, cName, price);
            
            System.out.print("Enter y to exit: ");
            y =input.nextLine();
            
        } while (y.equalsIgnoreCase(y));
        
        do {
            System.out.println("Enter Customers");
            System.out.print("Enter Name: ");
            cName = input.nextLine();
            
            System.out.print("Enter Id: ");
            cId = input.nextInt();
            input.nextLine();
            System.out.print("Enter Gender:");
            cGender = input.nextLine();
            
            System.out.print("Enter Email: ");
            cEmail = input.nextLine();
            
            System.out.print("Enter Adress: ");
            cAdress = input.nextLine();
            
            System.out.print("Enter Contact: ");
            cContact = input.nextLine();
            
            System.out.print("Enter MemberShip: ");
            cMemberShip = input.nextLine();
            
            
            
            System.out.println("Enter y to exit");
            y = input.nextLine();
            
            
        } while (y.equalsIgnoreCase(y));
        
        
        
    }
}
