import java.util.Arrays;
/*
* Coder:Hridaya Bijayananda, Satsuki Higginbotham
* Due date:11/30/21
* Description: The deck of cards for a card game with an array of cards
*/
public class DeckG2 {
	
	private CardG2[ ] deck; // the array for the deck of cards
	int top; // top of deck
	int bottom; //Where the cards are
	int numCards; // number of cards in range

	/* 
	* Coder: Satsuki Higginbotham, Hridaya Bijayananda
	* Description: creating a deck of cards
	* Parameters:none
	*/
	public DeckG2() 
	{
		int r; // LCV
		int s; //LCV
		int cardNum = 0; // accumulator
		deck = new CardG2[52];
		for(r=1; r < 14; r++)
		{
			for(s=0; s < 4;s++)
			{
				CardG2 card1 = new CardG2(r,s); 
				deck[cardNum]= card1; 
				cardNum++;  
			}//end inner for loop
		}// end outer for loop
		this.numCards = 52;
		this.top = 0;
		this.bottom = 51;
	}// end constructor

	public DeckG2(int numCards) 
	{
		super();
		this.numCards = numCards;
		this.top = 0;
		this.bottom = 0;
		this.deck = new CardG2[numCards]; // taking in numCards as argument and getting a new array
	}
	
	/* 
	* Coder: Satsuki Higginbotham, Hridaya Bijayananda
	* Description: finding location of card in deck
	* Parameters:Card card- sending in the card to find in the deck
	* return: int location- the index of the card / the location
	*/
	public int findLocation(CardG2 card1)
	{
		int i; // LCV
		int location = 0; // location of the card
		CardG2 card2; // the card we are finding
		for(i=0;i<52;i++)
		{
			card2 = deck[i];
			if (card2.compareTo(card1) == 0)
			{
				location = i;
			} // end of if statement
		} // end of for loop
		return location;
	} // end of findLocation
	
	/*
	 * Description: This method shuffles the cards in the deck
	 * Parameter: Card5G2 deck [] - the array with the deck of cards
	 * return type void
	 * Coder: Hridaya Bijayananda, Satsuki Higginbotham
	 */ 
	public void shuffle ( )
	{
 		CardG2 temp; // the temporary value
		int i; // LCV + the first card being shuffled
		int j; // the second card being shuffled
		for (i = 0; i < 52; i++)
		{
			j = (int) (Math.random ( ) * 52);
			temp = deck [i];
			deck [i] = deck [j];
			deck [j] = temp;
		} // end of for loop
	} // end of shuffle
	
	/*
	 * Description: the cards in the deck will be sorted according to rank and suit
	 * Parameters: none
	 * return type void
	 * Coder: Hridaya Bijayananda
	 */
	public void sortCards ( CardG2 deck [ ] )
	{
		for (int i = 1; i < deck.length; ++i)
		{
         CardG2 card = deck[i];
         int j = i - 1;
         while (j >= 0 && deck[j].compareTo ( card ) > 0) 
         {
            deck[j + 1] = deck[j];
             j = j - 1;
         } // end of while loop
         deck[j + 1] = card;
		} // end of for loop
	} // end of sortCards
	
	/*
	 * Description: Splits the deck into two and returns a deck object
	 * Parameters:
	 * int start - the first set of cards
	 * int end - the second set of cards
	 * return deck object
	 * Coder: Hridaya Bijayananda, Satsuki Higginbotham
	 */
	public DeckG2 makeSubDeck(int start, int end) 
	{
		int i = 0;
		DeckG2 player1 = new DeckG2 (52);
		for(int index = start; index < end - start; index++)
		{
			//this.getDeck ( );
			player1.deck[i] = this.deck [index];
			i++;
		} // end of for loop
		player1.numCards = end - start;
		player1.top = 0;
		player1.bottom = end - start;
		return player1;
	} // end of makeSubDeck

	/*
	 * 
	 * Coder: Satsuki Higginbotham, Hridaya Bijayananda
	 * Description: takes a deck and it adds it to the bottom of the pile
	 * Parameters:
	 * DeckG2 middlePile - the middle pile 
	 * return type void
	 */
	public void addDeck (DeckG2 middlePile)
	{
		int size = middlePile.numCards;
		for(int i = 0; i< size; i++)
		{
			CardG2 card; // the popped card
			card = middlePile.popCard ( );
			this.addCard(card);
		}
	}
	/*
	 * Description: returns card thats on the top of the deck
	 * Parameters:none
	 * return type CardG2 - the top card will be returned
	 * Coder: Satsuki Higginbotham
	 */	
	public CardG2 popCard ()
	{
		CardG2 card; // the card getting swapped
		card = this.deck[top];
		this.deck[top] = null;
		numCards--;
		top++;
		if(top >= this.deck.length)
		{
			top = 0;
		} // end of if statement
		return card;
	} // end of popCard

	/* 
	 * Description:adding a card to the bottom of the pile 
	 * Parameters:
	 * CardG2 topCard - the card were adding to the bottom of the pile
	 * return type void
	 * Coder:Satsuki Higginbotham
	 */ 
	public void addCard(CardG2 topCard)
	{
		//System.out.println ("bottom is " + bottom); 
		deck[bottom] = topCard;
		numCards++;
		bottom++;
		if(bottom >= this.deck.length)
		{
			bottom = 0;
		} // end of if statement
		
	} // end of addCard
	
	/*
	 * Description: lets player know if pile is empty place in deck
	 * Parameters: none
	 * return: none
	 * Coder:Satsuki Higginbotham
	 */
	public boolean isEmpty()
	{
		boolean value; // the value of the statement
		if(numCards == 0)
		{
			value = true;
		} // end of if statement
		else
		{
			value = false;
		} // end of else
		return value;
	} // end of isEmpty

	// getters and setters below
	public CardG2[ ] getDeck( )
	{
		return deck;
	}

	public void setDeck( CardG2[ ] deck )
	{
		this.deck = deck;
	}

	@Override
	// Coder: Satsuki Higginbotham
	public String toString( )
	{
		return "Deck" + Arrays.toString(deck) + " \n top=" + top + ", bottom=" + bottom + ", numCards=" + numCards
				+ "]";
	}

} // end of class DeckG2
