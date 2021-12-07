/*
 * Coder: Hridaya Bijayananda, Satsuki Higginbotham
 * Due: 11/17/21
 * Description: This class will have the playing cards with members for rank and suit
 */
public class Card4G2
{
	public final String [ ] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	public final String [ ] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private int suit; // the four French categories in a card deck
	private int rank; // the rank of the card
	
	/* 
	 * Coder: Satsuki Higginbotham, Hridaya Bijayananda
	 * Description: comparing two cards by rank
	 * Parameters:
	 * Card3G2 card2 - the second card
	 */
	public int compareTo(Card4G2 card2)
	{
		int returnValue = 0; // the value that gets returned after the cards are compared to one another
		int cardA = this.getRank( ); // the rank of the first card
		int cardB = card2.getRank ( ); // the rank of the second card
		if (cardA == cardB)
		{
			returnValue = 0; // the two cards are equal to each other
			System.out.println ( "The cards are equal." );
		} // end of if statement
		else if(cardA > cardB )
		{
			returnValue = 1; // the first card is higher
			System.out.println ( "The first card is higher." );
		} // end of else
		else if (cardA < cardB)
		{
			returnValue = -1; // the second card is higher
			System.out.println ( "The second card is higher." );
		} // end of else
		return returnValue;
	}
	
	// constructors below
	public Card4G2 ( )
	{
		suit = 0;
		rank = 0;
	} // end of Card
	
	public Card4G2( int suit, int rank )
	{
		super ( );
		this.suit = suit;
		this.rank = rank;
	} // end of Card
	// end of constructors
	
	// getters and setters below
	public String [ ] getRanks ( )
	{
		return RANKS;
	}
	
	public String [ ] getSuits ( )
	{
		return SUITS;
	}
	
	public int getSuit( )
	{
		return suit;
	}
	
	public void setSuit( int suit )
	{
		this.suit = suit;
	}
	
	public int getRank( )
	{
		return rank;
	}
	
	public void setRank( int rank )
	{
		this.rank = rank;
	}
	
	@Override
	// coder: Satsuki Higginbotham
	public String toString() 
	{
		return RANKS[rank] + " of " + SUITS[suit];
	} // end of toString
	
} // end of Class Card
