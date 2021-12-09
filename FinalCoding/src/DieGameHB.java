/*
 * Hridaya Bijayananda
 */
import java.util.Scanner;

public class DieGameHB
{
	static Scanner input;
	public static void main( String[ ] args )
	{
		input = new Scanner (System.in);
		Die testDie = new Die ( );  	//Part 3
		System.out.println ( "Die Test: " + testDie.toString ( ) );  //Part 3

		int numDieSides = getDieSideInput ( );  //part 4

		Player[ ] players = new Player[ 3 ];	//part 6

		for ( int i = 0; i < players.length; i++ )	//part 6
		{
			players[ i ] = new Player ( );	//part 6
			Die die = new Die ( numDieSides );	//Part 3
			System.out.println ( "Die Test: " + die.toString ( ) );	//Part 3
			players[ i ].setDie ( die );	//part 6
			die.roll ( numDieSides );
// call the method that will roll the die and set the value, you also write the method	//part 5	
		
		}  //end loop to create players


		for ( int i = 0; i < players.length; i++ ) //part 7
		{
			printRollResult ( testDie );
// Call method printRollResult to output each players die result
		}

// Call method to declare winner  // part 9

	}  //end main

// Using this method stub.  Write a method to get the number of sides on the die	
	/*
	 * Description: The user will input the number of sides on a die
	 * Parameters: none
	 * Return type void
	 */
	public static int getDieSideInput( )					//part 4 whole method
	{
		int numSides;
		System.out.println ( "Enter the number of sides on a die" );
		numSides = input.nextInt( );
		System.out.println ( "The number of sides are " + numSides );
		return numSides;
	} // end of getDieSideInput
		
	public static void printRollResult( Die oneDie )  //part 7  whole method
	{
		System.out.println ( "You rolled a " + oneDie.getValue ( ) + " on a " + oneDie.getNumSides ( ) + " sided die" );
	} // end of printRollResult

// Write a method to find the player with the highest roll and output the number of the winner and their die value.

}//end of class
