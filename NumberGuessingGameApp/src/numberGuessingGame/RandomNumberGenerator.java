package numberGuessingGame;

import java.util.Random;

public class RandomNumberGenerator {
	
	//Difficulty level instance variable
	private int difficulty;
	
	//Constructor
	public RandomNumberGenerator(int difficulty)
	{
		this.setDifficulty(difficulty);
	}

	//Get and set method for private instance variable
	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	//Random number generator
	Random rand = new Random();
	
	//Method to select difficulty of the game, and generates a random number according to the difficulty level.
	public int number()
	{
		int number = 0;
		if (getDifficulty() == 1)
		{
			number =rand.nextInt(6)+1;
		} else if (getDifficulty() == 2)
		{
			number = rand.nextInt(11)+1;
		} else if (getDifficulty() == 3)
		{
			number = rand.nextInt(21)+1;
		} else if (getDifficulty() == 4)
		{
			number = rand.nextInt(31)+1;
		} else if (getDifficulty() == 5)
		{
			number = rand.nextInt(51)+1;
		}
		return number;
	}


}
