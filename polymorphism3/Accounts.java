package com.bitspedia.polymorphism3;

import com.bitspedia.inheritance3.Employee;

public class Accounts {

    public static final int companyAccountNumber = 548754;

    public void depositEarningsIntoBank(Employee employee){
        Bank bank = new Bank();
        bank.transferMoney(
                companyAccountNumber,
                employee.getBankAccountNumber(),
                employee.getEarnings());
    }
}