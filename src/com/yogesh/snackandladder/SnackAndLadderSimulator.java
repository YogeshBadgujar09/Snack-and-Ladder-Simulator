package com.yogesh.snackandladder;

public class SnackAndLadderSimulator {
	
	private int player_position = 0 ;
	
	public void showPosition()
	{
		System.out.println("player Position :" + player_position );
	}

	public static void main(String[] args) {
	
		System.out.println("Welcome To Snack and Ladder Simulator");
		
		SnackAndLadderSimulator snackandladdersimulator = new SnackAndLadderSimulator();
		 snackandladdersimulator.showPosition();
	}

}
