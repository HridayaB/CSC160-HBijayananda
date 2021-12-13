/*
 * Coder: Hridaya Bijayananda
 * Due: 12/13/21
 * Description: The MineSweeper game is an interactive game of chance where you are on a mine field,
 * covered with hidden mines that explode on contact. The goal of the game is to discover all the spaces
 * in the mine field that don't have the mines without making the mines explode.
 */

import java.util.Scanner;
import java.util.Random;

public class MineSweeperHB
{
	
	static Scanner input;
	public static void main( String[ ] args )
	{
		input = new Scanner (System.in);
		System.out.println ( "Welcome to the game of MineSweeper!" );
		printBoard ( );
		int [ ] [ ] locationArray = new int [ 3 ] [ 9 ]; // the array with the locations in the board
		startingTestArray ( locationArray );
		examineLocation ( locationArray, 3, 9 );
		input.close ( );
	} // end of main
	
	/*
	 * Description: laying out the board
	 * Parameter: int numLines - the number of lines for making the board
	 * return type void 
	 */
	public static void makeSolidLine ( int numLines )
	{
		String spot = ".";
		for ( int lineCount = 0; lineCount < numLines; lineCount ++ )
		{
			System.out.print ( spot + " " );
		} // end of while loop
		System.out.println ( );
	} // end of makeSolidLine
	
	/*
	 * Description: prints the board
	 * Parameter: none
	 * return type void
	 */
	public static void printBoard ( )
	{
		makeSolidLine ( 9 );
		makeSolidLine ( 9 );
		makeSolidLine ( 9 );
	} // end of printBoard
	
	/*
	 * Description: entering the location in the board
	 * Parameter: none
	 * return type void
	 */
	public static void enterLocation ( )
	{
		int row; // the rows in the board
		int column; // the columns in the board
		System.out.println ( "Enter the row you are choosing from." );
		row = input.nextInt ( );
		if ( row > 3 )
		{
			System.out.println ( "There are only 3 rows. Please try again." );
			row = input.nextInt ( );
		} // end of if statement
		else { ; }
		System.out.println ( "Enter the column you are choosing from." );
		column = input.nextInt ( );
		if ( column > 9 )
		{
			System.out.println ( "There are only 9 columns. Please try again." );
			column = input.nextInt ( );
		} // end of if statement
		else { ; }
		System.out.println ( "You chose the spot in row " + row + " and column " + column );
	} // end of enterLocation
	
	/*
	 * Description: examining the location chosen
	 * Parameters: 
	 * int [ ] [ ] locationArray - the array with the locations in the board
	 * int row - the rows in the board
	 * int column - the columns in the board
	 * return type void 
	 */
	public static void examineLocation ( int [ ] [ ] locationArray, int row, int column )
	{
		for ( row = 0; row < 3; row ++)
		{
			for (column = 0; column < 9; column ++)
			{
				enterLocation ( );
				// startingArray ( locationArray );
				startingTestArray ( locationArray );
				if ( locationArray [ row ] [ column ] == 10 )
				{
					System.out.println ( "*" );
					System.out.println ( "Game Over :(" );
				} // end of if statement
				if ( locationArray [ row ] [ column ] > 0 && locationArray [ row ] [ column ] < 10)
				{
					System.out.println ( "." );
				} // end of if statement
				else if ( locationArray [ row ] [ column ] == 11)
				{
					examineLocation ( locationArray, 3, 9 );
				} // end of else if statement
			} // end of inner for loop
		} // end of outer for loop
		System.out.println ( "You have completed the game :)!!!");
	} // end of examineLocation
	
	/*
	 * Description: starting the array locationArray
	 * Parameter:
	 * int [ ] [ ] locationArray - the array with the locations in the board
	 * return type void
	 */
	public static void startingArray ( int [ ] [ ] locationArray )
	{
		Random randGen = new Random ( );
		int i; // LCV
		int j; // LCV
		for ( i = 0; i < 3; i ++ )
		{
			for ( j = 0; j < 9; j ++ )
			{
				locationArray [ i ] [ j ] = randGen.nextInt( 11 - 1 + 1 ) + 1;
			} // end of inner for loop
		} // end of outer for loop
	} // end of startingArray
	
	/*
	 * Description: used for testing the locationArray
	 * Parameter:
	 * int [ ] [ ] locationArray - the array with the locations in the board
	 * return type void
	 */
	public static void startingTestArray ( int [ ] [ ] locationArray )
	{
		locationArray [ 0 ] [ 0 ] = 1;
		locationArray [ 0 ] [ 1 ] = 2;
		locationArray [ 0 ] [ 2 ] = 3;
		locationArray [ 0 ] [ 3 ] = 4;
		locationArray [ 0 ] [ 4 ] = 5;
		locationArray [ 0 ] [ 5 ] = 6;
		locationArray [ 0 ] [ 6 ] = 7;
		locationArray [ 0 ] [ 7 ] = 8;
		locationArray [ 0 ] [ 8 ] = 9;
		locationArray [ 1 ] [ 0 ] = 10;
		locationArray [ 1 ] [ 1 ] = 11;
		locationArray [ 1 ] [ 2 ] = 1;
		locationArray [ 1 ] [ 3 ] = 2;
		locationArray [ 1 ] [ 4 ] = 3;
		locationArray [ 1 ] [ 5 ] = 4;
		locationArray [ 1 ] [ 6 ] = 5;
		locationArray [ 1 ] [ 7 ] = 6;
		locationArray [ 1 ] [ 8 ] = 7;
		locationArray [ 2 ] [ 0 ] = 8;
		locationArray [ 2 ] [ 1 ] = 9;
		locationArray [ 2 ] [ 2 ] = 10;
		locationArray [ 2 ] [ 3 ] = 11;
		locationArray [ 2 ] [ 4 ] = 1;
		locationArray [ 2 ] [ 5 ] = 2;
		locationArray [ 2 ] [ 6 ] = 3;
		locationArray [ 2 ] [ 7 ] = 4;
		locationArray [ 2 ] [ 8 ] = 5;
	} // end of startingTestArray
	
} // end of class MineSweeperHB

/*
 * Problems: 
 * I didn't need a board
 * It was my first time coding 2ns dimensional arrays, so I had trouble figuring it out
 * I had trouble to make it run through the for loops in the method examineLocation properly
 * For some reason, I couldn't get the values I set on startingTestArray to translate on examineLocation
 */
