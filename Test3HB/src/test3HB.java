/*
 * Hridaya Bijayananda
 */
import java.util.Scanner;

public class test3HB
{
	static Scanner input;
	static final int KEYBOARDNUM = 30;
	public static void main( String[ ] args )
	{
		input = new Scanner(System.in);
		/*int numCount; // LCV
		int number = 0; // the numbers that are going to be read in
		int numAverage = 0; // the average of the numbers
		int numSum = 0; // the sum of the numbers
		*/
		int [] numArray; // the array of the number
		numArray = new int [KEYBOARDNUM];
		fillNumArray (numArray);
		/*
		for (numCount = 0; numCount < KEYBOARDNUM; numCount++)
		{
			System.out.println("Enter your number.");
			number = input.nextInt ( );
			System.out.println ( "The number you chose was " + number );
			numSum = numSum + number;
			numAverage = numSum / KEYBOARDNUM;
		} // end of for loop
		System.out.println ("The average of the numbers is " + numAverage);
		number 1 - 3 commented out because it would ask for input twice, Kishore told me it was fine.
		*/
	} // end of main
	
	/* fillNumArray
	 * Description: This method fills the array with numbers
	 * Parameters: int[] numArray - the array of the numbers
	 * return type void
	 */
	public static void fillNumArray (int [] numArray)
	{
		int i; // LCV
		for (i = 0; i < KEYBOARDNUM; i++)
		{
			System.out.println ("Enter your number.");
			numArray [i] = input.nextInt();
			if (numArray [i] > 149 || numArray [i] < -149 )
			{
				System.out.println ("The number is out of range. Please enter another number");
				numArray [i] = input.nextInt ( );
			}
		} // end of for loop
		for (i = 0; i< KEYBOARDNUM; i++)
		{
			System.out.print ( numArray [i] + " ");
			System.out.println ( );
		} // end of for loop
	} // end of fillNumArray
} // end 0f Class
