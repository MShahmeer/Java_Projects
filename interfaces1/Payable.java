package com.bitspedia.interfaces1;

public interface Payable {

    double getPaymentAmount();

    default void m1(){
        System.out.println("m1 called ... ");
    }


}
