import java.util.Random;
import java.util.Scanner;

public class MethodsCheckingSheetHB 
{
	static Scanner input;
	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		int num; // LCV
		num = 0;
		int high;
		int low;
		high = 1003;
		low = 9;
		Random randGen; //Random number generator
		randGen = new Random();
		int answer;	// Guessed random number
		System.out.printf("%63s %n", "random table");
		while (num < 70)
		{
			answer = randGen.nextInt(high-low) + low;
			num++;
			System.out.printf("%8d", answer);
			if (num % 7 == 0)
			{
				System.out.printf("%n");
			}
		} // end of while loop
		
	} // end of main
} // end of class
