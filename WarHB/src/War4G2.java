/*
 * Hridaya Bijayananda, Satsuki Higginbotham
 * Due: 11/17/21
 * Description: A card game where the players swap and hold cards depending on the rank of their card, 
 * the player with all the cards at the end wins the game.
 */
import java.util.Scanner;

public class War4G2
{
	static Scanner input;
	public static void main( String[ ] args )
	{
		input = new Scanner (System.in);
		// Coder: Satsuki Higginbotham, Hridaya Bijayananda
		Card4G2 card1; // the card for the default constructor
		card1 = new Card4G2 ();
		Deck4G2 deck1 = new Deck4G2();
		card1.setRank(11);
		card1.setSuit(3);
		printCards (card1);
		Card4G2 card2; // the card for the auto-generated constructor
		card2 = new Card4G2 (1, 2);
		printCards (card2);
		System.out.println(card1.toString());
		int returnValue = card1.compareTo(card2);
		System.out.println(returnValue);
		System.out.println(deck1.toString());
	} // end of main
	
	/*
	 * Description: Printing out the cards
	 * Parameters:
	 * Card3G2 card - the card that is passed in
	 * return type void
	 * Coder: Hridaya Bijayananda
	 */
	public static void printCards (Card4G2 card)
	{
		System.out.print ( card.RANKS[card.getRank()] + " of " );
		System.out.println( card.SUITS[card.getSuit()]);
	}// end of printCards

} // end of Class War
