import java.util.Scanner;
public class check
{
	static Scanner input;
	public static void main( String[ ] args )
	{
		input = new Scanner(System.in);
		String card1 = "2";
		String card2 = "3";
		int winnercompareTo(card1, card2);
		System.out.println(winner);
	}
		
		/* Satsuki Higginbotham, Hridaya Bijayananda
		 * Description: comparing two cards by rank
		 * Parameters:
		 * Card3G2 card - the first card
		 * Card3G2 otherCard - the second card
		 */
		public static int compareTo(String card, String otherCard)
		{
			int winner;
			if(card.compareTo(otherCard) > 0 ) 
			{
				winner = Integer.parseInt ( card );
			}
			else
			{
				winner = Integer.parseInt ( otherCard );
			}
			return winner;
		}
}
