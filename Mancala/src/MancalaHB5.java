/*
 * Hridaya Bijayananda
 * Due: 10/26/21
 * Description: Mancala game. A game played by two people moving beads
 * around a board. The person with the most beads wins.
 * The values of the array is added onto the board.
 */
public class MancalaHB5
{
	static final int NUMBINS = 14; // the number of bins
	public static void main( String[ ] args )
	{
		makeSolidLine ( 57);
		int[ ] beadArray; // the array for the beads in the board
		beadArray = new int[ NUMBINS ];
		// startingArray(beadArray);
		startingTestArray ( beadArray );
		// printArray(beadArray);
		showBoard ( beadArray );
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
	 * Parameters: int[] beadArray  - the array for the beads in the board
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
		beadArray[ 0 ] = 10;
		beadArray[ 1 ] = 20;
		beadArray[ 2 ] = 3;
		beadArray[ 3 ] = 4;
		beadArray[ 4 ] = 50;
		beadArray[ 5 ] = 6;
		beadArray[ 6 ] = 20;
		beadArray[ 7 ] = 8;
		beadArray[ 8 ] = 50;
		beadArray[ 9 ] = 10;
		beadArray[ 10 ] = 59;
		beadArray[ 11 ] = 12;
		beadArray[ 12 ] = 13;
		beadArray[ 13 ] = 10;
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
		System.out.println();
	} // end of showTopBins

	/*
	 * Description: The value for the bottom bin 
	 * Parameter: int [ ] beadArray - the array for the beads in the board
	 * return type void
	 */
	public static void showBottomBins( int[ ] beadArray )
	{
		int index; // LCV
		for ( index = 13; index > 5 ; index-- )
		{
			System.out.printf ( "*%4d  ", beadArray[ index ] );
		} // end of for loop
		System.out.println ( "*" );
	} // end of ShowBottomBins
} // end of class
/*
 * Problems: I forgot to comment everything and had a few blank spaces.
 */
