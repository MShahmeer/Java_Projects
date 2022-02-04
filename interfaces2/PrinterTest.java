package com.bitspedia.interfaces2;

public class PrinterTest {
    public static void main(String args[]){
    
        PdfDocument pdfDocument = new PdfDocument();
        WordDocument wordDocument = new WordDocument();
        
        Printer printer = new Printer();
        
        printer.doThePrinting(pdfDocument);
        printer.doThePrinting(wordDocument);
    }    
}
