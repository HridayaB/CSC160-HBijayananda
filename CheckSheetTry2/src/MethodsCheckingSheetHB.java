/*
 * Hridaya Bijayananda
 * Due: 10/25/21
 * Description: Learning and practicing using methods and printf
 */

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
		int quantity; // the total amount of numbers in the table
		quantity = getQuantity();
		makeRandomTable (quantity);
		
	} // end of main

/*
 * Description: a table is created with random numbers, a new line is made every 7 numbers
 * Parameter: int quantity  
 * return type void
 */
	public static void makeRandomTable ( int quantity)
	{
		
		int num; // LCV
		num = 0;
		getRange();
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
	
/*
 * Description: getting the quantity for the table
 * Parameter: none
 * return type int
 */
	public static int getQuantity()
	{ 
		int quantity; //// the total amount of numbers in the table
		System.out.println ( "Enter how many numbers you want" );
		quantity = input.nextInt ( );
		while ( quantity < 10 || quantity > 500)
		{
			System.out.println("The number has to be between 10 and 500. Enter another number.");
			quantity = input.nextInt ();
		} // end of while loop
		return(quantity);
	}
	
/*
 * Description: getting the range for the random numbers on the table
 * Parameter: none
 * return type int
 */
	public static int getRange()
	{
		int high; // range for random number
		int low; // range for random number
		System.out.println("Enter the highest number");
		high = input.nextInt();
		System.out.println("Enter the lowest number");
		low = input.nextInt();
		if (low > high)
		{
			System.out.println("Low cannot be a bigger number than high, try again.");
			low = input.nextInt ( );
		} // end of if statement
		return (high +low);
	} // end of getRange
} // end of class

/*
 * Problems: I had trouble with the table at the beginning.
 */
