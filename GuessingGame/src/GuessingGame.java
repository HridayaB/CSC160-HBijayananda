import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int guess;
		Random randGen;
		
		System.out.println("What is your guess?");
		guess = input.nextInt();
		
		randGen = new Random();
		int answer;
		answer = randGen.nextInt(20-10+1) + 10;
		System.out.println("The random number is " + answer);
		
		System.out.println("the guess is " + guess);
		
	
	}

}
