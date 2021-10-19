/*
 * Hridaya Bijayananda
 * GuessingGameHB7
 * Due: 10/11/21
 * Description: User will be able to play a guessing game where there is a random number that is generated which
 * the user will have to guess, the user will be able to decide their own range for each game that they play and 
 * the user is also not limited to one game at a time, meaning that the user will be able to play as many
 * times as they wish.
 */
import java.util.Scanner;
import java.util.Random;

public class GuessingGameHB7 {
	static Scanner input;
	public static void main(String[] args) 
	{
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
		int high; //The highest number that can be generated
		int low; // The lowest number that can be generated
		Random randGen; //Random number generator
		
		quit = 'n';
		play = 'y';
		user = play;
		totalPoints = 0;
		numGamesPlayed = 0;
		averagePerGame = 0;
		System.out.println("Enter the highest number in your range");
		high = input.nextInt();
		System.out.println("Enterthe lowest number in your range");
		low = input.nextInt();
		randGen = new Random();
		
		do 
		{
			int answer;	// Guessed random number
			answer = randGen.nextInt(high-low+1) + low;
			System.out.println("What is your guess?");
			guess = input.nextInt();
			points = 5;
			finalScore = 0;
			while (guess != answer)
			{ 
				if (guess > answer)
				{
					System.out.println("Your guess is too high. 1 point is deducted from score. Try again."); 
				}
				else
				{
					System.out.println("Your guess is too low. 1 point is deducted from score. Try again.");
				}
				points = points - 1;
				if (points == 0)
				{
					System.out.println("You are out of points, but you will have to continue guessing.");
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
			System.out.println("Do you want to continue playing (y/n)?");
			user = input.next().charAt(0);
			if (user == quit)
			{
				user = quit;
			}
		} while (user == play);
		averagePerGame = totalPoints / numGamesPlayed;
		System.out.println("The total amount of points you earned is " + totalPoints);
		System.out.println("The number of games you played is " + numGamesPlayed);
		System.out.println("" + averagePerGame + numGamesPlayed);	
		input.close();
	}
}
/*
 * Problems: I had problems trying to figure out how to put in the do-while loop.
 */	