package com.bitspedia.enums;

public class GameTest{
	
		public static void main(String args[]){
		Game game = new Game();
		game.play();
		GameStatus gameStatus = game.getStatus();
		
		if(gameStatus == GameStatus.WON){
			System.out.println("Congratulations, you won the game");			
			
		} else if(gameStatus == GameStatus.LOST){
			System.out.println("You LOST ... No worries. Try Again.");			
			
		} else if (gameStatus == GameStatus.CONTINUE ){
			System.out.println("Game is continue.");			
		}
	}	
}