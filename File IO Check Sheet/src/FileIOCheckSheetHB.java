/*
 * Hridaya Bijayananda
 * Due: 12/02/21
 * Description: The Check Sheet for File IO
 */
import java.io.*;
import java.util.Scanner;

public class FileIOCheckSheetHB
{
	static File inFile;
	static Scanner fin;
	public static void main( String[ ] args ) throws IOException
	{
		inFile = new File( "D2lFile.txt" );
		fin = new Scanner ( inFile );
		
		if ( !inFile.exists ( ) )
		{
			System.out.println ( "file not found" );
			System.exit ( -1 );
		} // end of if statement
		
		float accountBalance; // the balance of the account
		long accountNumber; // the account number
		String accountName; // the person in the account's last name followed by the first name

		while ( fin.hasNext ( ))
		{
			accountBalance = fin.nextFloat ( );
			fin.nextLine ( );
			accountNumber = fin.nextLong ( );
			fin.nextLine ( );
			accountName = fin.nextLine ( );
			System.out.println ( accountBalance );
			System.out.println ( accountNumber );
			System.out.println ( accountName );
		} // end of while loop
		fin.close ( );
	} // end of main

} // end of class FileIOCheckSheetHB
/*
 * Problems: I had trouble when I was trying to read it at the end
 */
