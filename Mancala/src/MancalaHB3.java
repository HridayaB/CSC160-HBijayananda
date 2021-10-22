/*
 * Hridaya Bijayananda
 * Due: 10/22/21
 * Description: Mancala game. A game played by two people moving beads
 * around a board. The person with the most beads wins.
 * User will get stars as output depending on the number of stars they have.
 * There will be a spaced out line with stars on it.
 * There will be a mancala board with all the stars aligned.
 * 
 */
public class MancalaHB3
{

	public static void main( String[ ] args )
	{

		int numStars; // number of stars
		numStars = 3;
		makeSolidLine ( numStars );
		System.out.println ( );
		showBoard();
		

	} // end of main

	/*
	 * Description: Print out a line of stars numStars - number of stars return type void
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
	 * Description: Print out sets of stars with 6 spaces in between return type void
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
		System.out.println ("*");
	} // end of makeDottedLine

	/*
	 * Description: The board is put in as an output return type void
	 */
	public static void showBoard( )
	{
		int numStars; // number of stars
		numStars = 3;
		makeSolidLine ( numStars );
		System.out.println ( );
		makeSolidLine ( 57 );
		System.out.println ( );
		makeDottedLine ( );
	} // end of showBoard

	/*
	 * Description: The top row of numbers that will go on the board return type void
	 */
	public static void showTopRowNumbers( )
	{
		int topNum;
	} // end of showTopRowNumbers

	/*
	 * Description: The bottom row of numbers that will go on the board return type void
	 */
	public static void showBottomRowNumbers( )
	{
		int bottomNum;
	} // end of showBottomRowNumbers

} // end of class
/*
 * Problems: At first, I had trouble figuring out how to organize everything and deciding where everything needed to go
 */
