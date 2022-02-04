/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabAssignment;

/**
 *
 * @author shahmeer
 */
public class Autobiography extends Book implements Issuable {

    private String personName;

    public Autobiography(String personName, double bookPrice, Authors[] bookAuthors, String bookName) {
        super(bookPrice, bookAuthors, bookName);
        this.personName = personName;
    }

    public double computePersonLoyalty() {
        return (getBookPrice() / 100) * 10;
    }

    @Override
    public boolean issue() {
        boolean issue = false;
        if (getBookPrice() > 1000 && getBookAuthors().length >2) {
            issue = true;
        }
        else {
            System.out.println("Invalid Issue Operation");
        }
        return issue;
    }    

}
