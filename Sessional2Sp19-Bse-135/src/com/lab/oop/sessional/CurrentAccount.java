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
public class CurrentAccount extends Account {
    private int minimumAmount;

    public CurrentAccount(int minimumAmount, String accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
        this.minimumAmount = minimumAmount;
    }

    public int getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(int minimumAmount) {
        this.minimumAmount = minimumAmount;
    }
    
    @Override
    public void dispalyInformation(){
        System.out.println("The Account Number is: "+getAccountNumber());
        System.out.println("The Account Name is: "+getAccountName());
        System.out.println("The balance is: "+getBalance());
    }
    
    @Override
    public void withDrawBalance(double amount){
        if (amount < getBalance()) {
            setBalance(amount - getBalance());
            if (getBalance() < 2000) {
                System.out.println("Minimum Balance could not be maintained");
            }
            
        }
        else{
            System.out.println("Take Your Cash");
        }
    }
    
}
