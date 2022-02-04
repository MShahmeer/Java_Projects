/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuessGameHeadJava;

/**
 *
 * @author Muhammad Shameer
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
                
        int guessp1 ;
        int guessp2 ;
        int guessp3 ;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        int targetNumber = (int) (Math.random() * 10);
        
        while(true){
           
            p1.guess();
            p2.guess();
            p3.guess();
            
            guessp1 = p1.number;
            System.out.println("Player one guessed = "+guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed = "+guessp2);
            guessp3 = p3.number;
            System.out.println("player three guessed = "+guessp3);
            
            if (guessp1 == targetNumber)
                p1isRight = true;
            if (guessp2 == targetNumber)
                p2isRight = true;
            if (guessp3 == targetNumber)
                p3isRight = true;
            
            if (p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner ");
                System.out.println("The Player One Got It Right ? "+p1isRight);
                System.out.println("The Palyer Two Got It Right ? "+p2isRight);
                System.out.println("The Player Three Got It Right ? "+p3isRight);
                
                
                System.out.println("THE GAME IS OVER ");
                break;                
            }
            else{
                System.out.println("The Player Will Have To Try Again");
            }
        }     
    }
}
