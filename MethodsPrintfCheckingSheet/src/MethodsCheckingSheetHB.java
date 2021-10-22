import java.util.Random;
import java.util.Scanner;

public class MethodsCheckingSheetHB 
{
	static Scanner input;
	public static void main(String[] args) 
	{
		makeRandomTable();
		
	} // end of main
	
	public static void makeRandomTable()
	{
		int num; // LCV
		int high; // range for random number
		int low; // range for random number
		int numValue; // LCV
		num = 0;
		high = 1003;
		low = 9;
		System.out.println("Enter how many numbers you want");
		numValue = input.nextInt();
		Random randGen; //Random number generator
		randGen = new Random();
		int answer;	// Guessed random number
		System.out.printf("%36s %n", "random table");
		
		while (num < numValue)
		{
			answer = randGen.nextInt(high-low) + low;
			num++;
			System.out.printf("%8d", answer);
			if (num % 7 == 0)
			{
				System.out.printf("%n");
			}
		} // end of while loop
	}
} // end of class
