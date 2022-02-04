/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumTask;

import java.util.EnumSet;

/**
 *
 * @author Muhammad Shameer
 */
public class EnumTask2Test {
    public static void main(String[] args) {
        System.out.println("<<<< ALL BOOKS IN MY LIST >>>>");
        for (Book books : Book.values()) {
            System.out.println(books+"  "+books.getTitle()+"  "+books.getCopyRightYear());
        }
        
        System.out.println("<<< BOOKS FROM GIVEN RANGE >>>>");
        for (Book books : EnumSet.range(Book.CHTP, Book.VBHTP)) {
            System.out.println(books+"  "+books.getTitle()+"  "+books.getCopyRightYear());
        }
    }
}
