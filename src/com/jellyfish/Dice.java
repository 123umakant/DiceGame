
package com.jellyfish;

public class Dice {

	private int random_int;

	public int throwDice() {

		int upperBound = 6;

		int lowerBound = 1;

		random_int = (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);

		return random_int;

	}

}
