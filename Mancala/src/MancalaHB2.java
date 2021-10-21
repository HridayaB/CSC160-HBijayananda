/*
 * Hridaya Bijayananda
 * Due: 10/20/21
 * Description: Mancala game. A game played by two people moving beads
 * around a board. The person with the most beads wins.
 * User will get stars as output depending on the number of stars they have.
 */
public class MancalaHB2 
{

	public static void main(String[] args) 
	{

		int numStars; // number of stars
		numStars = 3;
		makeSolidLine(numStars);
		System.out.println();
		makeSolidLine(10);
		System.out.println();
		makeDottedLine();

	} // end of main

/*
* Description: Print out a line of stars 
*numStars - number of stars 
* return type void
*/
	public static void makeSolidLine(int numStars) 
	{
		int starCount; // LCV - Loop control variable
		starCount = 0;

		while (starCount < numStars) 
		{
			System.out.print("*");
			starCount++;
		} // end of while loop

	} // end of makeSolidLine
	
/*
 * Description: Print out sets of stars with 6 spaces in between
 * return type void
 */
	public static void makeDottedLine()
	{
		int numSpaces; // LCV
		int numSets; // LCV
		numSets = 0;
		
		while (numSets < 8) 
		{
			numSpaces = 0;
			System.out.print("*");
			numSets++;
			while (numSpaces < 6)
			{
				System.out.print(" ");
				numSpaces++;
			} // end of while loop
		} // end of while loop
		System.out.println();
	} // end of makeDottedLine
	
} // end of class
/*
 * Problems: At first, I had trouble figuring out how to organize everything and deciding where
 * everything needed to go  
 */
