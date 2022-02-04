/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.oop.sessional;

/**
 *
 * @author Muhammad Shameer
 */
import java.util.*;
public class SessionalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList <Account> account = new ArrayList<>();
        
        int i = 1;
        while(true){
            System.out.println("Enter 1 for saving account 2 for current Account 3 for EXIT");
            int choice = input.nextInt();
            input.nextLine();
            if(choice == 3){
                break;
            }
            System.out.print("Enter Account number: ");
            String accountNumber = input.nextLine();
            
            System.out.print("Enter the Account balance: ");
            double balance = input.nextDouble();
            Account obj;
            if (choice == 2) {
                obj = new CurrentAccount (2000,accountNumber,"Current Account",balance);
                account.add(obj);
            }
            else if(choice == 1){
                System.out.print("Enter annual Interest rate: ");
                double annualInterestRate = input.nextInt();
                
                obj = new SavingAccount(annualInterestRate,accountNumber,"Saving Account",balance);
                account.add(obj);
                
                obj.setBalance(balance + (balance * annualInterestRate)/12);
            }
            i++;
        }
        
        account.remove(account.size()-1);
        
        for (int j = 0; j < account.size(); j++) {
            account.get(j).dispalyInformation(); 
        }
    }
}
