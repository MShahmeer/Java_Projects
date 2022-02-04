/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandlingPractice;

/**
 *
 * @author Muhammad Shameer
 */
public class Division {
    private int numerator;
    private int denominator;

    public Division(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double divide() throws ArithmeticException{
        return numerator/denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    
    

    @Override
    public String toString() {
        return "Division{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }
    
    
}
