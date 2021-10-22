import java.util.Random;
import java.util.Scanner;

public class MethodsCheckingSheetHB
{
	static Scanner input;
	static Random randGen; //Random number generator
	public static void main( String[ ] args )
	{
		input = new Scanner(System.in);
		randGen = new Random ( );
		int quantity; //
		quantity = getQuantity();
		makeRandomTable (quantity);
		
	} // end of main

	public static void makeRandomTable ( int quantity)
	{
		
		int num; // LCV
		num = 0;
		int high; // range for random number
		int low; // range for random number
		high = 1003;
		low = 9;
		int answer;	// Guessed random number
		System.out.printf ( "%36s %n", "random table" );

		while ( num < quantity )
		{
			answer = randGen.nextInt ( high - low ) + low;
			num++;
			System.out.printf ( "%8d", answer );
			if ( num % 7 == 0 )
			{
				System.out.printf ( "%n" );
			}
		} // end of while loop
	} // end of makeRandomTable
	
	public static int getQuantity()
	{ 
		int quantity;
		System.out.println ( "Enter how many numbers you want" );
		quantity = input.nextInt ( );
		while ( quantity < 10 || quantity > 500)
		{
			System.out.println("The number has to be between 10 and 500. Enter another number.");
			quantity = input.nextInt ();
		} // end of while loop
		return(quantity);
	}
} // end of class
