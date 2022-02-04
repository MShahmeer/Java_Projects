package com.bitspedia.interfaces2;

public class WordDocument implements Printable{
    
    @Override
    public void print() {
        System.out.println("Mechanism to print Word Document is defined here ");
        System.out.println("Word Document is printed .... ");
        
        // put all data into d that need to be printed ..
        // do formatting ...        
    }
}