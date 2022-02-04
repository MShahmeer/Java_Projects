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
import EnumTask.Gender;
public class Authors {
    private String authorName;
    private Gender authorGender;

    public Authors() {
    }

    public Authors(String authorName, Gender authorGender) {
        this.authorName = authorName;
        this.authorGender = authorGender;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Gender getAuthorGender() {
        return authorGender;
    }

    public void setAuthorGender(Gender authorGender) {
        this.authorGender = authorGender;
    }

}

