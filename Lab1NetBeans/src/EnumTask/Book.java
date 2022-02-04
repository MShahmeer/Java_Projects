/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumTask;

/**
 *
 * @author Muhammad Shameer
 */
public enum Book {
    JHTP("JAVA HOW TO PROGRAM","2010"),
    CHTP("C HOW TO PROGRAM","2011"),
    CPPHTP("C++ HOW TO PROGRAM","2012"),
    VBHTP("VISUAL BASIC HOW TO PROGRAM","2013");
    
    private final String title;
    private final String copyRightYear;
    
    private Book(String title,String copyRightYear){
        this.title = title;
        this.copyRightYear = copyRightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyRightYear() {
        return copyRightYear;
    }
}
