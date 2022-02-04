package com.bitspedia.interfaces1;

public class Invoice implements  Payable {
    int noOfProducts;
    double unitPrice;

    @Override
    public double getPaymentAmount() {
        return unitPrice * noOfProducts;
    }

}