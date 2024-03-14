package com.yogesh.snackandladder;

import java.util.Random;

public class SnackAndLadderSimulator {
	
	private static int player_position = 0 ;
	private static final int NO_PLAY_CASE = 0 ;
	private static final int LADDER_CASE = 1 ;
	private static final int SNACK_CASE = 2 ;
	private static final int WINNING_POSITION = 100 ;
	
	
	public void showPosition()
	{
		System.out.println("Player Position :" + player_position + "\n" );
	}
	
	public void playGame()
	{
		showPosition();
		
		int player_position = 0 ; 
		final int RESTART_POSITION = 0;
		
		while(player_position != WINNING_POSITION ) {
			
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
						
	 						if(player_position < RESTART_POSITION ) {
	 							player_position = RESTART_POSITION ;
	 						}
	 					break ;
				}
				
				System.out.println("Player Position : " + player_position);
				System.out.println("...............");
		}
				
			
			
	}
	
	public static void main(String[] args) {
	
		System.out.println("Welcome To Snack and Ladder Simulator");
		
		SnackAndLadderSimulator snackandladdersimulator = new SnackAndLadderSimulator();
		snackandladdersimulator.playGame();
	}

}
