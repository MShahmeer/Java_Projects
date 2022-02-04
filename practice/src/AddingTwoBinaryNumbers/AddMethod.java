/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddingTwoBinaryNumbers;

/**
 *
 * @author Muhammad Shameer
 */
public class AddMethod {
    int decimal;
    int nextDecimal;
    int add;
    public void add(String s1 , String s2){
        AddMethod Am = new AddMethod();
        Am.decimal = Integer.parseInt(s1,2);
        Am.nextDecimal = Integer.parseInt(s2,2);
        Am.add = Am.decimal + Am.nextDecimal;
        System.out.println("The Addition Of Given Two Binary Numbers In Decimal Is "+Am.add);
        
    }
    
}
