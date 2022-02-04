package com.bitspedia.enums;

public class Game{
	
	private String name;
	private GameStatus status;
	
	public void play(){		
		// write game logic here ... 
		// based on result, set the game status		
		status = GameStatus.WON;
	}
	
	public GameStatus getStatus(){
		return status;		
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;	
	}
	
}