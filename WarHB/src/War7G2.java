/*
 * Coder: Satsuki Higginbotham, Hridaya Bijayananda
 * War 7
 * Due 11/30/21
 * description: A card game where the players swap and hold cards depending on the rank of their card, 
 * the player with all the cards at the end wins the game.
 */
import java.util.Scanner;
public class War7G2 {
	static Scanner input;
	//coder:Satsuki Higginbotham, Hridaya Bijayananda
	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		CardG2 card1 = new CardG2(); //object of class CardG2
		card1.setRank(11); //setting value to the card's rank
		card1.setSuit(3);//setting value to the card's suit
		printCard(card1);//Method printing this card
		CardG2 card2 = new CardG2(1,2); //object of class CardG2
		printCard(card2); //Method printing this card
		System.out.println(card1.toString());//prints out card
		int answer = card1.compareTo(card2);//method compares the values of 2 cards
		System.out.println(answer);
		
		DeckG2 deck1 = new DeckG2(); // Object of class DeckG2
		System.out.println("Starting deck: \n" + deck1.toString());//prints out the entire deck
		int location = deck1.findLocation(card1); // Method sends back the location of the card in the deck
		System.out.println(location);
		deck1.shuffle ( );
		System.out.println("Shuffled deck: \n" + deck1);
		deck1.sortCards ( deck1.getDeck ( ) );
		System.out.println("Sorted deck: \n" + deck1);
		
		DeckG2 mainDeck = new DeckG2(); // Object of class DeckG2
		DeckG2 middlePile = new DeckG2(52); // Object of class DeckG2
		mainDeck.shuffle( );
		DeckG2 player1 = mainDeck.makeSubDeck(0, 26); // the first player's initial pile
		DeckG2 player2 = mainDeck.makeSubDeck(26, 52); // the second player's initial pile
		System.out.println("Player 1 subdeck: \n" + player1);
		System.out.println("Player 2 subdeck: \n" + player2);
		CardG2 player1Card = player1.popCard(); // Player 1's card
		CardG2 player2Card = player2.popCard(); // Player 2's card
		middlePile.addCard(player1Card);
		middlePile.addCard(player2Card);
		boolean done = false;
		
		while(!player1.isEmpty( ) && !player2.isEmpty ( ) && done == false)
		{
			
			player1Card = player1.popCard();
			player2Card = player2.popCard();
			middlePile.addCard(player1Card);
			middlePile.addCard(player2Card);
			if ( player1Card == null )
			{
				done = true;
				player2.addDeck ( middlePile );
			} // end of if statement
			if ( player2Card == null )
			{
				done = true;
				player1.addDeck ( middlePile );
			} // end of if statement
			
			int result = player1Card.compareTo ( player2Card );
			if(result > 0)
			{
				player1.addDeck(middlePile);
			} // end of if statement
			else if(result < 0)
			{
				player2.addDeck(middlePile);
			} // end of else if statement
			else if (result == 0)
			{
				;
			} // end of else if statement
			if ( player1.isEmpty( ) )
			{
				System.out.println("Player 2 won the game");
			} // end of if statement
			else
			{
				System.out.println("Player 1 won the game");
			} // end of else
		} // end of while loop
		
		deck1.sortCards ( deck1.getDeck ( ) );
		System.out.println("Final sorted deck: \n" + deck1);
	} // end of main
	
	/*
	 * Description: method prints the card
	 * Parameters: Card card - set values to the card and print out the name in array
	 * return type void
	 * Coder: Hridaya Bijayananda
	 */
	public static void printCard(CardG2 card)
	{
		System.out.print(card.RANKS[card.getRank()] + " of ");
		System.out.println(card.SUITS[card.getSuit()]);
	} // end of printCard
	
	 public static void printArray(CardG2 deck[])
	 {
		 for (int i = 0; i < deck.length; ++i)
		 {
	      	 System.out.print(deck[i] + " ");
		 } // end of for loop
	        System.out.println();
	 } // end of printArray
} // end of class War7G2

/*
 * Problems: We had a hard time managing both of our schedules so that we could work together. 
 * We were a little confused every now and then with the description of our task in the sheet given to us.
 * We had trouble with Part 5 and 6.
 * For Part 7, we didn't deal with the tie at first
 */
