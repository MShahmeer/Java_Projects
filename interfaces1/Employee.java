package com.bitspedia.interfaces1;

public class Employee implements Payable {

    double salary;

    @Override
    public double getPaymentAmount() {
        return salary;
    }

}