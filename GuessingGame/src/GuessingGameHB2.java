/*
 * Hridaya Bijayananda
 * GuessingGameHB2
 * Due: 10/04/21
 * Description: User gets notified 
 * if the number they guessed was too high or too low
 */
import java.util.Scanner;
import java.util.Random;

public class GuessingGameHB2 {
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
		
		if (guess > answer) 
		{
			System.out.println("Your guess is too high");
		}
		else {	
			System.out.println("Your guess is too low");
		}
		System.out.println("the guess is " + guess);
	}
}
/*
 * Problems: No problems
 */	