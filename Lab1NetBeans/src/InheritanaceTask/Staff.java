/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanaceTask;

/**
 *
 * @author Muhammad Shameer
 */
public class Staff extends Person{
    private int pay;

    public Staff(int pay, String name, Adress adress) {
        super(name, adress);
        this.pay = pay;
    }

    public int getPay() {
        return pay;
    }
    
}
