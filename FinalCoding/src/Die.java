import java.util.Random;

/*
 * Hridaya Bijayananda
 */
public class Die
{
	private int numSides; // the number of sides on a die
	private int value; // the number on the die
	
	public Die ( )
	{
		numSides = 6;
		value = 0;
	} // end of default constructor

	public Die( int numSides )
	{
		super ( );
		this.numSides = numSides;
		this.value = 0;
	} // end of constructor

	/*
	 * Description: The user will input the number of sides on a die
	 * Parameters: none
	 * Return type void
	public void getDieSideInput ( int numSides )
	{
		System.out.println ( "Enter the number of sides on a die" );
		numSides = input.nextInt( );
		System.out.println ( "The number of sides are " + numSides );
	} // end of getDieSideInput
	*/
	
	/*
	 * Description: Rolling the die
	 * Parameters: int value - the number on the die
	 * return type void
	 */
	public void roll (int numSides)
	{
		Random randGen = new Random ( );
		int numRolled;
		numRolled = randGen.nextInt ( numSides - 1 + 1) + 1;
		value = numRolled;
	} // end of roll
	
// getters and setters below
	public int getNumSides( )
	{
		return numSides;
	}

	public void setNumSides( int numSides )
	{
		this.numSides = numSides;
	}

	public int getValue( )
	{
		return value;
	}

	public void setValue( int value )
	{
		this.value = value;
	}
	// end of getters and setters
	
	// toString below
	@Override
	public String toString( )
	{
		return "Die [numSides = " + numSides + ", value = " + value + "]";
	} // end of toString
	
	
} // end of class Die
