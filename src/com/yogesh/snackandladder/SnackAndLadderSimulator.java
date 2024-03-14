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
		System.out.println("Welcome To Snack and Ladder Simulator");
		System.out.println("Player Position :" + player_position );
	}
	
	public void playGame()
	{
		showPosition();
		
		final int RESTART_POSITION = 0;
		int die_No = 0;
		
		while(true) {
			
				int die ;
				int option ;				
				
				Random random = new Random();
				die = random.nextInt(6)+1;
				System.out.println("Die :" + die);
				
				die_No++ ;
				
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
								
				if(player_position >  WINNING_POSITION )
				{	
					player_position -= die ; 
				}
					
				if(player_position ==  WINNING_POSITION)
				{
					System.out.println("player position :" + player_position);
					System.out.println("***********************\n************************");
					System.out.println("No of Die :" + die_No);
					break ;
				}
				
				System.out.println("Player Position : " + player_position);
				System.out.println("...............");
		}
				
			
			
	}
	
	public static void main(String[] args) {
		
		SnackAndLadderSimulator snackandladdersimulator = new SnackAndLadderSimulator();
		snackandladdersimulator.playGame();
	}

}
