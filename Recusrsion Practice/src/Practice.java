
public class Practice
{

	public static void main( String[ ] args )
	{
		int number = 5; // the beginning number
		countdown (number);
		System.out.println ( "Blast off!" );
	} // end of main 
	
	public static void countdown ( int number )
	{
		System.out.println( number );
		if (number > 1)
		{
			countdown (number - 1);
		} // end of if statement
	} // end of countdown
} // end of class Practice
