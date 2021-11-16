/*
 * Hridaya Bijayananda
 * Due: 11/15/21
 * Description: This class will have the playing cards with members for rank and suit
 */
public class Card
{
	public final String [ ] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	public final String [ ] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King"};
	private int suit; // the four French categories in a card deck
	private int rank; // the rank of the card
	
	// constructors below
	public Card ( )
	{
		suit = 0;
		rank = 0;
	} // end of Card
	
	public Card( int suit, int rank )
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
	
} // end of Class Card
