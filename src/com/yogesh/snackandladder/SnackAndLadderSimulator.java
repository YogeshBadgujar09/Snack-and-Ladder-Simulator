package com.yogesh.snackandladder;

import java.util.Random;

public class SnackAndLadderSimulator {
	
	private int player_position = 0 ; 
	private static final int NO_PLAY_CASE = 0 ;
	private static final int LADDER_CASE = 1 ;
	private static final int SNACK_CASE = 2 ;
	
	public void showPosition()
	{
		System.out.println("player Position :" + player_position );
	}
	
	public void playGame()
	{
		int die ;
		int option ;
		
		Random random = new Random();
		die = random.nextInt(6)+1;
		System.out.println("Die No :" + die);
		
		option = random.nextInt(3);
		
		switch(option)
		{
			case NO_PLAY_CASE :
				System.out.println("No PLAY");
			break ;
			
			case LADDER_CASE :
				System.out.println("LADDER");
				player_position += die ;
			break ;
			
			case SNACK_CASE :
				System.out.println("SNACK");
				player_position -= die ;
			break ;
		}
		
		
			int Starting_position = 0;
	
			if(player_position <= Starting_position ) {
				System.out.println("player position : " +  Starting_position );	
			}
			else {
				System.out.println("player position :" + player_position);
			}
	}
	
	public static void main(String[] args) {
	
		System.out.println("Welcome To Snack and Ladder Simulator");
		
		SnackAndLadderSimulator snackandladdersimulator = new SnackAndLadderSimulator();
		snackandladdersimulator.showPosition();
		snackandladdersimulator.playGame();
	}

}
