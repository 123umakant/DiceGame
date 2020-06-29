package com.jellyfish;

public class Board implements Runnable{
	
	Player player1;
	Player player2;
	Player player3;
	Player player4;
	
	Dice dice;

	Board() {

		player1 = new Player(1);
		player2 = new Player(2);
		player3 = new Player(3);
		player4 = new Player(4);

		dice = new Dice();
	}

	
	@Override
	public void run() {
		
		int counter=1;
		
		Player currentPlayer = player1; 
		int currentDice;

		boolean value = true;
		
		while (value) {

			if(counter>4) {
				counter =1;
			}
			
			if(counter==1)
			{
				currentPlayer = player1;
			}
			else if(counter ==2)
			{
				currentPlayer = player2;
				
			}
			else if(counter ==3)
			{
				currentPlayer =player3;
				
				
			}
			else {
				currentPlayer = player4;
			}
			
			
			currentDice = dice.throwDice();

			currentPlayer.updateScore(currentDice);
			
			if(currentPlayer.score >=100) {
				
	
					System.out.println("Player"+currentPlayer.id+" Winner Winner Chicken Dinner "+currentPlayer.score);
					
				
				break;
			}
			
			
			counter++;
			
			
		}

		
	}

}
