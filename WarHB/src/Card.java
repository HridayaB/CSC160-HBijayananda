/*
 * Hridaya Bijayananda
 * Due: 11/15/21
 * Description: This class will have the playing cards with members for rank and suit
 */
public class Card
{
	public final String [ ] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	public final String [ ] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Joker"};
	private String suit; // the four French categories in a card deck
	private String rank; // the rank of the card
	
	// constructors below
	public Card ( )
	{
		suit = " ";
		rank = " ";
	} // end of Card
	
	public Card( String suit, String rank )
	{
		super ( );
		this.suit = suit;
		this.rank = rank;
	} // end of Card
	// end of constructors
	
	// getters and setters below
	public String getSuit( )
	{
		return suit;
	}
	
	public void setSuit( String suit )
	{
		this.suit = suit;
	}
	
	public String getRank( )
	{
		return rank;
	}
	
	public void setRank( String rank )
	{
		this.rank = rank;
	}
	
} // end of Class Card
