/*
 * Hridaya Bijayananda
 * GuessingGameHB4
 * Due: 10/07/21
 * Description: Points are introduced and user gets certain amount of points
 * depending on the times it takes them to guess the number.
 */
import java.util.Scanner;
import java.util.Random;

public class GuessingGameHB4 {
	static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int guess;	//User's guess
		int finalScore;	//User's score at the end
		int points; //Points in the game
		Random randGen; //Random number generator
		
		randGen = new Random();
		int answer;	// Guessed random number
		answer = randGen.nextInt(20-10+1) + 10;
		System.out.println("The random number is " + answer);
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
		System.out.println("Your guess is correct.");
		System.out.println("the guess is " + guess);
		finalScore = finalScore + points;
		System.out.println("Your score is " + finalScore);
		input.close();
	}
}
/*
 * Problems: I was having issues trying to stop points from going to negative numbers.
 */	