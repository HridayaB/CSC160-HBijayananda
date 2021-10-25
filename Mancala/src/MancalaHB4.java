/*
 * Hridaya Bijayananda
 * Due: 10/22/21
 * Description: Mancala game. A game played by two people moving beads
 * around a board. The person with the most beads wins.
 * There will be a mancala board with all the stars aligned.
 * 
 */
public class MancalaHB3
{
	public static void main( String[ ] args )
	{

		int numStars; // number of stars
		numStars = 57;
		makeSolidLine ( numStars );
		showBoard();
		

	} // end of main

	/*
	 * Description: Print out a line of stars 
	 * numStars - number of stars 
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
	 * parameters: none
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
		System.out.println ("*");
	} // end of makeDottedLine

	/*
	 * Description: The board is put in as an output
	 * parameters: none 
	 * return type void
	 */
	public static void showBoard( )
	{
		System.out.println ( );
		makeDottedLine ( );
		showTopRowNumbers( );
		System.out.println ( );
		makeDottedLine ( );
		makeDottedLine ( );
		makeDottedLine ( );
		System.out.printf ( "*  13  *");
		makeSolidLine ( 41 );
		System.out.printf ( "*  6   *");
		System.out.println ( );
		makeDottedLine ( );
		makeDottedLine ( );
		showBottomRowNumbers ( );
		System.out.println ( );
		makeDottedLine ( );
		makeDottedLine ( );
		makeDottedLine ( );
		makeSolidLine ( 57 );
	} // end of showBoard

	/*
	 * Description: The top row of numbers that will go on the board 
	 * parameters: none
	 * return type void
	 */
	public static void showTopRowNumbers( )
	{
		int topNum; // the numbers on the top row of the board
		topNum = 0;
		System.out.printf ( "*      ");
		while (topNum < 6)
		{
			System.out.printf ( "*%4d  ", topNum );
			topNum++;
		} // end of while loop
		System.out.printf ( "*      *" );
	} // end of showTopRowNumbers

	/*
	 * Description: The bottom row of numbers that will go on the board
	 * parameters: none 
	 * return type void
	 */
	public static void showBottomRowNumbers( )
	{
		int bottomNum; // the numbers on the bottom row of the board
		bottomNum = 12;
		System.out.printf ( "*      ");
		while (bottomNum > 6)
		{
			System.out.printf ( "*%4d  ", bottomNum );
			bottomNum--;
		} // end of while
		System.out.printf ( "*      *" );
	} // end of showBottomRowNumbers

} // end of class
/*
 * Problems: At first, I had trouble figuring out how to organize everything and deciding where everything needed to go.
 * I also had trouble getting the top numbers and bottom numbers in between the stars and not on a separate line.
 */
