/*
 * Hridaya Bijayananda
 */
import java.util.Scanner;

public class StringMethodsCheckSheetHB
{
	static Scanner input;
	public static void main( String[ ] args )
	{
		input = new Scanner (System.in);
		String word;
		String word1 = "World";
		String bigSentence;
		System.out.println ("Enter your word or sentence.");
		word = input.nextLine ( ) ;
		System.out.println (word);
		System.out.println (word.length ( ));
		bigSentence = word.concat(word1);
		System.out.println(bigSentence + word1);
	}

}
