/*
 * Hridaya Bijayananda
 * Due: 10/19/21
 * Description: Mancala game. A game played by two people moving beads
 * around a board. The person with the most beads wins.
 * User will get stars as output depending on the number of stars they have.
 */
public class MancalaHB1 
{

	public static void main(String[] args) 
	{

		int numStars; // number of stars
		numStars = 3;
		makeSolidLine(numStars);
		System.out.println();
		makeSolidLine(10);

	} // end of main

	/*
	 * Description: Print out a line of stars numStars - number of stars return type
	 * void
	 */
	public static void makeSolidLine(int numStars) {
		int starCount; // LCV - Loop control variable
		starCount = 0;

		while (starCount < numStars) {
			System.out.print("*");
			starCount++;
		} // end of while loop

	} // end of makeSolidLine
} // end of class
/*
 * Problems: none
 */
