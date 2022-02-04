package com.bitspedia.inheritance3;

public class Employee {
    private String name;
    private int bankAccountNumber;
    private int basicSalary;

    public Employee(String name, int basicSalary, int bankAccountNumber) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getEarnings() {
        return basicSalary;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

}