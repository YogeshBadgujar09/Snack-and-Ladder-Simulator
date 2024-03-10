package com.yogesh.snackandladder;

import java.util.Random;

public class SnackAndLadderSimulator {
	
	private int player_position = 0 ;
	
	public void showPosition()
	{
		System.out.println("player Position :" + player_position );
	}
	
	public void playGame()
	{
		Random random = new Random();
		int die = random.nextInt(6)+1;
		
		System.out.println("Die No :" + die);
	}
	
	public static void main(String[] args) {
	
		System.out.println("Welcome To Snack and Ladder Simulator");
		
		SnackAndLadderSimulator snackandladdersimulator = new SnackAndLadderSimulator();
		snackandladdersimulator.showPosition();
		snackandladdersimulator.playGame();
	}

}
