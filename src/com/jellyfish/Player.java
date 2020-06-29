package com.jellyfish;

public class Player {

	int id;
	int score;

	Player(int id) {
		this.id = id;
		this.score = 0;
	}

	public void updateScore(int currentDice) {
		score += currentDice;
		System.out.println("Player" + id + " : " + score);

	}

}
