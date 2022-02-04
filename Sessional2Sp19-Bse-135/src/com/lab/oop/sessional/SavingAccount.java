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
public class SavingAccount extends Account {
    private double annualInterestRate;

    public SavingAccount(double annualInterestRate, String accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    @Override 
    public void dispalyInformation(){
        System.out.println("The Account Number is: "+getAccountNumber());
        System.out.println("The Account Name is: "+getAccountName());
        System.out.println("The balance is: "+getBalance());
    }
    
    @Override
    public void withDrawBalance(double amount){
        if (amount < getBalance()){
            System.out.println("Take your cash");
        }
        else{
            System.out.println("Not Enough Balance"); 
        }
    }
}
