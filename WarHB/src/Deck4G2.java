import java.util.Arrays;

/*
 * Coder: Hridaya Bijayananda, Satsuki Higginbotham
 * Due: 11/18/21
 * Description: The deck of cards for the War game with an array of cards
 */

public class Deck4G2
{
	private Card4G2 deck [ ];
	//Card4G2 card1;
	
	public Deck4G2 ( )
	{
		deck = new Card4G2 [52];
		int r; // LCV
		int s; // LCV
		int cardNum = 0; // accumulator
		for (r = 1; r < 14; r++)
		{
			for (s = 0; s < 4; s++)
			{
				Card4G2 card1 = new Card4G2(r, s);
				deck [cardNum] = card1;
				cardNum++;
			} // end of for loop
		} // end of for loop
	} // end of constructor
	
	public Deck4G2 (int numCards)
	{
		numCards = 10; // number of cards
		this.deck = new Card4G2 [numCards];
	} // end of constructor
	/*
	public int searchCard (Card4G2 card )
	{
		int cardLocation = 0;
		int index;
		for (index = 0; index < 52; index++)
		{
			card = deck [index];
			if ( card.compareTo(card) == 0)
			{
				cardLocation = index;
			} // end of if statement
		} // end of for loop
		return cardLocation;
	} // end of searchCard
	*/
	// Accessors below
	public Card4G2[ ] getCards( )
	{
		return deck;
	}

	public void setCards( Card4G2[ ] deck )
	{
		this.deck = deck;
	}

	@Override
	public String toString( )
	{
		return Arrays.toString(deck);
	}

	
	
	
} // end of class Deck4G2
