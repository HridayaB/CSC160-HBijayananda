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
		String word1 = "101";
		String word2;
		String sentence;
		String bigSentence;
		//System.out.println ("Enter your word.");
		//word1 = input.nextLine ( ) ;
		word1 = word1 + 1;
		System.out.println (word1);
		System.out.println (word1.length ( ));
		System.out.println ("Enter your sentence.");
		sentence = input.nextLine ( ) ;
		System.out.println (sentence);
		System.out.println (sentence.length ( ));
		bigSentence = sentence.concat(word1);
		System.out.println(bigSentence + word1);
		System.out.println (bigSentence.indexOf ( "cat" ));
		System.out.println ("Enter your second word.");
		word2 = input.nextLine ();
		if (word1.equals ( word2 ))
		{
			System.out.println ("word1 is equal to word2");
		} // end of if statement
		else
		{
			System.out.println ("word1 is different to word2");
		} // end of else
		if (word1.compareToIgnoreCase ( word2 ) >= 0)
		{
			System.out.println("word1 is greater than word2");
		} // end of if statement
		else
		{
			System.out.println("word1 is less than word2");
		} // end of else
		int Integer.parseInt (word1);
	}
	public static void parseInt( String word1 )
	{
		int Integer.parseInt (word1);
	}
	} // end of main
} // end of StringMethodsCheckSheetHB
