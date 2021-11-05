/*
 * Hridaya Bijayananda
 * Due: 11/01/21
 * Description: Mancala game. A game played by two people moving beads
 * around a board. The person with the most beads wins.
 * The player is asked what bins they want to choose.
 * 
 */
import java.util.Scanner;

public class MancalaHB7
{
	static final int NUMBINS = 14; // the number of bins
	static Scanner input;
	public static void main( String[ ] args )
	{
		input = new Scanner (System.in);
		int winner;
		int bin;
		makeSolidLine ( 57 );
		System.out.println();
		int[ ] beadArray; // the array for the beads in the board
		beadArray = new int[ NUMBINS ];
		// startingArray(beadArray);
		startingTestArray ( beadArray );
		// printArray(beadArray);
		showBoard ( beadArray );
		// gameOverCheck ( beadArray );
		winner = gameOverCheck (beadArray);
		if (winner == 0)
		{
			System.out.println("No one wins the game.");
		} // end of if statement
		else if (winner == 1)
		{
			System.out.println("Player 1 wins the game!");
		} // end of else
		else if (winner == 2)
		{
			System.out.println("Player 2 wins the game!");
		} // end of else 
		else {;}
		bin = getStartingBin ( beadArray, winner );
		System.out.println("The player chose the bin " + bin);
	} // end of main

	/*
	 * Description: Print out a line of stars 
	 * Parameters: numStars - number of stars 
	 * return type void
	 */
	public static void makeSolidLine( int numStars )
	{
		int starCount; // LCV - Loop control variable
		starCount = 0;
		while ( starCount < numStars )
		{
			System.out.print ( "*" );
			starCount++;
		} // end of while loop
	} // end of makeSolidLine

	/*
	 * Description: Print out sets of stars with 6 spaces in between 
	 * Parameters: none 
	 * return type void
	 */
	public static void makeDottedLine( )
	{
		int numSpaces; // LCV
		int numSets; // LCV
		numSets = 0;
		while ( numSets < 8 )
		{
			numSpaces = 0;
			System.out.print ( "*" );
			numSets++;
			while ( numSpaces < 6 )
			{
				System.out.print ( " " );
				numSpaces++;
			} // end of while loop
		} // end of while loop
		System.out.println ( "*" );
	} // end of makeDottedLine

	/*
	 * Description: The board is put in as an output 
	 * Parameters: int[ ] beadArray - the array for the beads in the board
	 * return type void
	 */
	public static void showBoard( int[ ] beadArray )
	{
		makeDottedLine ( );
		showTopRowNumbers ( );
		makeDottedLine ( );
		showTopBins ( beadArray );
		makeDottedLine ( );
		System.out.printf ( "*  13  *" );
		makeSolidLine ( 41 );
		System.out.printf ( "*  6   *" );
		System.out.println ( );
		makeDottedLine ( );
		showBottomRowNumbers ( );
		makeDottedLine ( );
		showBottomBins ( beadArray );
		makeDottedLine ( );
		makeSolidLine ( 57 );
		System.out.println ( );
	} // end of showBoard

	/*
	 * Description: The top row of numbers that will go on the board 
	 * Parameters: none 
	 * return type void
	 */
	public static void showTopRowNumbers( )
	{
		int topNum; // the numbers on the top row of the board
		topNum = 0;
		System.out.printf ( "*      " );
		while ( topNum < 6 )
		{
			System.out.printf ( "*%4d  ", topNum );
			topNum++;
		} // end of while loop
		System.out.printf ( "*      *" );
		System.out.println ( );
	} // end of showTopRowNumbers

	/*
	 * Description: The bottom row of numbers that will go on the board 
	 * Parameters: none 
	 * return type void
	 */
	public static void showBottomRowNumbers( )
	{
		int bottomNum; // the numbers on the bottom row of the board
		bottomNum = 12;
		System.out.printf ( "*      " );
		while ( bottomNum > 6 )
		{
			System.out.printf ( "*%4d  ", bottomNum );
			bottomNum--;
		} // end of while
		System.out.printf ( "*      *" );
		System.out.println ( );
	} // end of showBottomRowNumbers

	/*
	 * Description: The array with the values of 4 and 0. 
	 * Parameters: int[] beadArray - the array for the beads in the board 
	 * return type void
	 */
	public static void startingArray( int[ ] beadArray )
	{
		int index; // LCV
		for ( index = 0; index < NUMBINS; index++ )
		{
			beadArray[ index ] = 4;
		} // end of for loop
		beadArray[ 6 ] = 0;
		beadArray[ 13 ] = 0;
		System.out.println ( );
	} // end of startingArray

	/*
	 * Description: Printing the contents of the array in a line. 
	 * Parameters: int[] beadArray - the array for the beads in the board
	 * return type void
	 */
	public static void printArray( int[ ] beadArray )
	{
		int index; // LCV
		for ( index = 0; index < NUMBINS; index++ )
		{
			System.out.printf ( "%3d", beadArray[ index ] );
			if ( index == 6 )
			{
				System.out.printf ( "  |" );
			} // end of if statement
		} // end of for loop
		System.out.println ( );
	} // end of printArray

	/*
	 * Description: Test for the startingArray 
	 * Parameter: int[ ] beadArray - the array for the beads in the board 
	 * return type void
	 */
	public static void startingTestArray( int[ ] beadArray )
	{
		beadArray[ 0 ] = 4;
		beadArray[ 1 ] = 3;
		beadArray[ 2 ] = 2;
		beadArray[ 3 ] = 4;
		beadArray[ 4 ] = 2;
		beadArray[ 5 ] = 0;
		beadArray[ 6 ] = 8;
		beadArray[ 7 ] = 2;
		beadArray[ 8 ] = 3;
		beadArray[ 9 ] = 4;
		beadArray[ 10 ] = 10;
		beadArray[ 11 ] = 0;
		beadArray[ 12 ] = 3;
		beadArray[ 13 ] = 9;
	} // end of startingArrayTest

	/*
	 * Description: The value for the top bin 
	 * Parameter: int [ ] beadArray - the array for the beads in the board 
	 * return type void
	 */
	public static void showTopBins( int[ ] beadArray )
	{
		int index; // LCV
		System.out.printf ( "*      " );
		for ( index = 0; index < 6; index++ )
		{
			System.out.printf ( "*%4d  ", beadArray[ index ] );
		}
		System.out.printf ( "*      *" );
		System.out.println ( );
	} // end of showTopBins

	/*
	 * Description: The value for the bottom bin 
	 * Parameter: int [ ] beadArray - the array for the beads in the board
	 * return type void
	 */
	public static void showBottomBins( int[ ] beadArray )
	{
		int index; // LCV
		for ( index = 13; index > 5; index-- )
		{
			System.out.printf ( "*%4d  ", beadArray[ index ] );
		} // end of for loop
		System.out.println ( "*" );
	} // end of ShowBottomBins

	/*
	 * Description: Testing the ending and crowning the winner of the game. 
	 * Parameter: int [ ] beadArray - the array for the beads in the board 
	 * return type int - returns the number of the winner
	 */
	public static int gameOverCheck( int[ ] beadArray )
	{
		int index; // LCV
		int p1Points; // Player 1's points from the middle bins
		int p2Points; // Player 2's points from the middle bins
		int winner; // the winner of the game
		winner = -1;
		p1Points = 0;
		p2Points = 0;
		for ( index = 0; index < 6; index++ )
		{
			p1Points = p1Points + beadArray[ index ];
		}
		for ( index = 12; index > 6; index-- )
		{
			p2Points = p2Points + beadArray[ index ];
		}
		if ( p1Points == 0 || p2Points == 0 )
		{
			System.out.println ( "The game has ended!" );
			beadArray[ 13 ] = beadArray[ 13 ] + p1Points;
			beadArray[ 6 ] = beadArray[ 6 ] + p2Points;
			if ( beadArray [ 6 ] == beadArray [ 13 ] )
			{
				System.out.println ( "It is a tie." );
				winner = 0;
			} // end of if statement
			else if ( beadArray[ 6 ] > beadArray[ 13 ] )
			{
				System.out.println ( "Player 1 emptied their side!" );
				winner = 1;
			} // end of else
			else if ( beadArray[ 13 ] > beadArray[ 6 ] )
			{
				System.out.println ( "Player 2 emptied their side!" );
				winner = 2;
			} // end of else
		} // end of if statement
		return winner;
	} // end of gameOverCheck
	
	/*
	 * Description: The player gets to choose what bin they are starting in.
	 * Parameters: int[] beadArray - the array for the beads in the board
	 * int player - the player number
	 * return type int - return the bin number 
	 */
	public static int getStartingBin (int[] beadArray, int player)
	{
		
		int highBin; // the highest bin in the board for one player
		int lowBin; // the lowest bin in the board for one player
		int bin; // the bin in the array
		System.out.println("What player's turn is it?");
		player = input.nextInt();
		highBin = 5;
		lowBin = 0;
		if (player == 2)
		{
			highBin = 12;
			lowBin = 7;
		} // end of else
		else {;} // end of else
		System.out.println("What bin do you want to start in?");
		bin = input.nextInt( );
		while (bin > highBin || bin < lowBin || beadArray [bin] < 1)
		{
			System.out.println("The bin you choose has to have at least 1 bead in it. Choose again.");
			bin = input.nextInt( );
		} // end of while loop
		return bin;
	} // end of getStartingBin
} // end of class
/*
 * Problems: I had trouble trying to figure out if I got it right or wrong.
 */
