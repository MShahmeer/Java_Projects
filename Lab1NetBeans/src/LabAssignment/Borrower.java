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
public class Borrower implements Issuable {
    private int borrowerId;
    private String borrowerName;

    public Borrower(int borrowerId, String borrowerName) {
        this.borrowerId = borrowerId;
        this.borrowerName = borrowerName;
    }

    @Override
    public boolean issue() {
        System.out.println("ID: "+borrowerId);
        System.out.println("Name: "+borrowerName);
        
        return true;
    }
    
    
}
