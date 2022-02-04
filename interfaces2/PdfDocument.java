package com.bitspedia.interfaces2;

public class PdfDocument implements Printable  {
    
    String data;

    @Override
    public void print() {
        System.out.println("Mechaism to print PDF Document is define here ... ");
        System.out.println("PDF Document is printed ... ");
        // put all data into d that need to be printed ..
        // do formatting ...
    }
}