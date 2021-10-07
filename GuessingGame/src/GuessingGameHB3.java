/*
 * Hridaya Bijayananda
 * GuessingGameHB3
 * Due: 10/06/21
 * Description: User has to keeping guessing numbers until 
 * they match with the random number that is generated
 */
import java.util.Scanner;
import java.util.Random;

public class GuessingGameHB3 {
	static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int guess;	//User's guess
		Random randGen; //Random number generator
		
		randGen = new Random();
		int answer;	// Guessed random number
		answer = randGen.nextInt(20-10+1) + 10;
		System.out.println("The random number is " + answer);
		System.out.println("What is your guess?");
		guess = input.nextInt();
		
		while (guess != answer)
		{ 
			if (guess > answer)
			{
				System.out.println("Your guess is too high. Try again."); 
			}
			else
			{
				System.out.println("Your guess is too low. Try again.");
			}
			System.out.println("Enter another guess");
			guess = input.nextInt();
		}
		System.out.println("Your guess is correct.");
		System.out.println("the guess is " + guess);
		input.close();
	}
}
/*
 * Problems: When I first did the condition for the loop I put in == instead of !=
 * which made me keep questioning why it wasn't going through the loop
 * I originally forgot to indent after the brace on else.
 */	