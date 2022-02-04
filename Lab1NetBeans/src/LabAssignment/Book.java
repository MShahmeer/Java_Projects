/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabAssignment;

import EnumTask.Gender;

/**
 *
 * @author BASHARA LIAQAT
 */
public abstract class Book{
    private double bookPrice;
    private Authors bookAuthors[];
    private String bookName;

    public Book(double bookPrice, Authors[] bookAuthors, String bookName) {
        this.bookPrice = bookPrice;
        this.bookAuthors = bookAuthors;
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public Authors[] getBookAuthors() {
        return bookAuthors;
    }
    
    public double computeAuthorLoyalty(){
        double share = (getBookPrice()/100) * 30;
        for (int i = 0; i < bookAuthors.length; i++) {
            if (bookAuthors[i].getAuthorGender().equals(Gender.Female)) {
                share = share + 50;
            }
        }
        return share;
    }
}
