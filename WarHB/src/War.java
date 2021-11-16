/*
 * Hridaya Bijayananda, Satsuki Higginbotham
 * Due: 11/15/21
 * Description: A card game where the players swap and hold cards depending on the rank of their card, 
 * the player with all the cards at the end wins the game.
 */
import java.util.Scanner;

public class War
{
	static Scanner input;
	public static void main( String[ ] args )
	{
		input = new Scanner (System.in);
		Card card1;
		card1 = new Card ();
		card1.setRank(11);
		card1.setSuit(3);
		System.out.print ( card1.RANKS[card1.getRank()] + " of " );
		System.out.println( card1.SUITS[card1.getSuit()]);
		Card card2;
		card2 = new Card (1, 2);
		System.out.print ( card2.RANKS[card2.getRank()] + " of " );
		System.out.println( card2.SUITS[card2.getSuit()]);
		// int firstCard;
		// System.out.println (firstCard.RANKS [firstCard.getRank ()])	
	} // end of main
	
	/*
	 * public static void getCards (Card [ ] cards)
	
	{
		cards = new Card [52];
	} // end of getCards
	
	public static void getSuitDataMembersValue ( Card [ ] cards )
	{
		String suit; // the four French categories in a card deck
		int index;
		int i;
		for (index = 1; index < 4; index ++)
		{
			for (i = 1; i < 52; i++)
			{
				
			}
		}
	}
	*/
} // end of Class War
