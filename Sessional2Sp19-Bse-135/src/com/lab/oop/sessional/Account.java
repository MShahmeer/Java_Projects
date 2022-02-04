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
public abstract class Account {
    private String accountNumber;
    private String accountName;
    private double balance;

    public Account(String accountNumber, String accountName, double balance) {
       // this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public abstract void withDrawBalance(double amount);
    public abstract void dispalyInformation();
}

