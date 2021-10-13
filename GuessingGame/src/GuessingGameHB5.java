/*
 * Hridaya Bijayananda
 * GuessingGameHB5
 * Due: 10/08/21
 * Description: The game can now be played multiple times until
 * specified that they want to quit, average of each game is recorded.
 */
import java.util.Scanner;
import java.util.Random;

public class GuessingGameHB5 {
	static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int guess; //User's guess
		int finalScore;	//User's score at the end
		int points; //Points in the game
		int numGamesPlayed; //Number of games played
		float averagePerGame; //Average per game
		int totalPoints; //Total amount of points
		int quit; //User's will to quit
		int user; //Represents the User's will
		int play; //User's will to play 	
		Random randGen; //Random number generator
		
		quit = 'n';
		play = 'y';
		user = play;
		totalPoints = 0;
		numGamesPlayed = 0;
		averagePerGame = 0;
		randGen = new Random();
		
		while (user == play)
		{
			int answer;	// Guessed random number
			answer = randGen.nextInt(20-10+1) + 10;
			System.out.println("What is your guess?");
			guess = input.nextInt();
			points = 5;
			finalScore = 0;
		
			while (guess != answer)
			{ 
				if (guess > answer)
				{
					System.out.println("Your guess is too high. "
						+ "1 point is deducted from score. Try again."); 
				}
				else
				{
					System.out.println("Your guess is too low. "
						+ "1 point is deducted from score. Try again.");
				}
				points = points - 1;
				if (points == 0)
				{
					System.out.println("You are out of points, but you will "
						+ "have to continue guessing.");
				}
				System.out.println("Enter another guess");
				guess = input.nextInt();
			}
			if (points <= 0)
			{
				points = 0;
			}
			System.out.println("Your guess is correct!");
			System.out.println("the guess is " + guess);
			finalScore = finalScore + points;
			System.out.println("Your score is " + finalScore);
			totalPoints = totalPoints + points;
			numGamesPlayed = numGamesPlayed + 1;
			averagePerGame = totalPoints / numGamesPlayed;
			System.out.println("Do you want to continue playing (y/n)?");
			user = input.next().charAt(0);
			if (user == quit)
			{
				user = quit;
				System.out.println("User wants to quit playing the game.");
			}
		}
		System.out.println("The total amount of points "
				+ "you earned is " + totalPoints);
		System.out.println("The number of games "
				+ "you played is " + numGamesPlayed);
		System.out.println("Your average for the games "
				+ "you played is " + averagePerGame);
		input.close();
	}
}
/*
 * Problems: I was having issues trying to organize everything so that it makes sense.
 * I also had problems trying to decide the variable for quit.
 * I initially forgot to take out the output where the it tells you the random number.
 */	