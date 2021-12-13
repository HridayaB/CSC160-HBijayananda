/*
 * Coder: Hridaya Bijayananda
 * Due: 11/13/21
 * Description: This class will make the board for the game
 */
public class BoardHB
{
	private int numLines; // the number of lines for making the board
	
	public BoardHB ( )
	{
		numLines = 0;
	} // end of default constructor

	public BoardHB ( int numLines )
	{
		super ( );
		this.numLines = numLines;
	} // end of constructor
	
	/*
	 * Description: laying out the board
	 * Parameter: int numLines - the number of lines for making the board
	 * return type void 
	 */
	public void makeSolidLine ( int numLines )
	{
		String spot = ".";
		for ( int lineCount = 0; lineCount < numLines; lineCount ++ )
		{
			System.out.print ( spot + " " );
		} // end of while loop
		System.out.println ( );
	} // end of makeSolidLine
	
	/*
	 * Description: making columns inside the board
	 * Parameter: int numLines - the number of lines for making the board
	 * return type void
	public void makeSolidRows (  )
	{
		int numLines = 0;
		if ( numLines == 0 )
		{
			System.out.print( "|" );
			for ( int numSpaces = 0; numSpaces < 7; numSpaces++ )
			{
				System.out.print( "   " );
				System.out.print( "|" );
			} // end of for loop
			System.out.println ( );
		} // end of for loop
	} // end of makeSolidRows
	*/
	
	/*
	 * Description: prints the board
	 * Parameter: none
	 * return type void
	 */
	public void printBoard ( )
	{
		makeSolidLine ( 9 );
		//makeSolidRows ( );
		makeSolidLine ( 9 );
		//makeSolidRows ( );
		makeSolidLine ( 9 );
		//makeSolidRows ( );
		makeSolidLine ( 9 );
	}
	
} // end of class BoardHB
