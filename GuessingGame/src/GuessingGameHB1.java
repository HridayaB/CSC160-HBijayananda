/*
 * Hridaya Bijayananda
 * GuessingGameHB1
 * Due: 09/30/21
 * Revision: 10/01/21
 * Description: User guessing 
 * computer generated number between 10 to 20
 */
import java.util.Scanner;
import java.util.Random;


public class GuessingGameHB1 {
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
		
		System.out.println("the guess is " + guess);
/*
 * Problems: I kept forgetting where to put 
 * spaces and where not to
 */
	
	}

}
