package numberGuessingGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuessingGameApp {
	
	static boolean quit = false;
	
	public static void Game() throws InputMismatchException
	{
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter difficulty from 1 to 5: ");
			System.out.println("1: Guess number from 1 to 5");
			System.out.println("2: Guess number from 1 to 10");
			System.out.println("3: Guess number from 1 to 20");
			System.out.println("4: Guess number from 1 to 30");
			System.out.println("5: Guess number from 1 to 50");
			try {
				int difficulty = scan.nextInt();
				if (difficulty>=1 && difficulty<=5)
				{
					try {
						System.out.println("How many tries would you like?");
						int tries = scan.nextInt();
						
						RandomNumberGenerator game = new RandomNumberGenerator(difficulty);
						
						//num is the random number generated according to the difficulty level selected by the user
						int num = game.number();
						
						//For loop to guess the random number until the number of tries runs out.
						//If the guessed number is bigger than the correct number, the prompt will pop up to say the correct number is smaller, and vice versa.
						//If the guessed number is correct, the for loop will stop and the game finishes.
						for(int i=0; i<tries;i++)
						{
							System.out.println("Please enter your guess:");
							int guess = scan.nextInt();
							if (guess == num)
							{
								System.out.println("Your guess is correct!");
								quit = true;
								break;
							} else if (guess < num)
							{
								System.out.println("The number is bigger");
							} else if (guess > num)
							{
								System.out.println("The number is smaller");
							}
						}
						
						System.out.println("The correct number is: "+num);
					}
					catch (InputMismatchException e)
					{
						System.out.println("Invalid input! \n");
						scan.next();
					}
				} else {
					System.out.println("Invalid number \n");
				}
			}
			catch (InputMismatchException a)
			{
				System.out.println("Invalid difficulty. \n");
				scan.next();
			}
			
		} while(!quit);
	}
	
	public static void main(String[] args) {
		Game();

	}


}
