/*
 * coder:Satsuki Higginbotham, Hridaya Bijayananda
 * Due: 11/30/21
 * Description: This class will have the playing cards with members for rank and suit
 */
public class CardG2 
{	
	//Array holing rank values
	public final String[] RANKS = {null,"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	//Array holding suit values
	public final String[] SUITS= {"clubs","diamonds","hearts","spades"};
	
	private int rank; // the card's rank
	private int suit; // the card's suit

	
	//Default Constructor
	public CardG2()
	{
		rank = 0;
		suit = 0;
	}
	
	//Constructor that takes rank and suit as an argument
	public CardG2(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	/* Satsuki Higginbotham, Hridaya Bijayananda
	* Description: comparing two cards by rank
	* Parameters: Card card2 - the card we are comparing the first card to.
	* return: int value- the higher ranked card
	*/
	public int compareTo(CardG2 card)
	{
		int value= 0; // The value of the compared cards
		int cardA = this.getRank(); // the first card
		int cardB= this.getRank(); // the second card
		if(cardA == cardB)
		{
			value = 0;
			//System.out.println("the cards are equal");
		}
		else if(cardA > cardB)
		{
			value = 1;
			//System.out.println("the first card is higher");
		}
		else if(cardA < cardB)
		{
			value = -1;
			//System.out.println("the second card is higher");
		}
		return value;
	}
	
	//Start of getters and setters
		public String[] getRanks() {
			return RANKS;
		}

		public String[] getSuits() {
			return SUITS;
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}

		public int getSuit() {
			return suit;
		}

		public void setSuit(int suit) {
			this.suit = suit;
		}
		
	//coder:Satsuki Higginbotham
	@Override
	public String toString() {
		return RANKS[rank] + " of " + SUITS[suit];
	}	
} // end of class CardG2