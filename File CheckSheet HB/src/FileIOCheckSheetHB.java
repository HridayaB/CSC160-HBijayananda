/*
 * Hridaya Bijayananda
 * Due: 12/02/21
 * Description: The Check Sheet for File IO
 */
import java.io.*;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.Scanner;

public class FileIOCheckSheetHB
{
	static File inFile;
	static Scanner fin;
	static java.io.File outFile;
	stativ PrintWriter fout;
	
	public static void main( String[ ] args ) throws IOException
	{
		inFile = new File( "D2lFile.txt" );
		outFile = new File ( "OutputFile.txt" );
		fin = new Scanner ( inFile );
		fout = new PrintWriter ( outFile );
		
		if ( !inFile.exists ( ) )
		{
			fout.println ( "file not found" );
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
			fout.println ( accountBalance );
			fout.println ( accountNumber );
			fout.println ( accountName );
		} // end of while loop
		fin.close ( );
	} // end of main

} // end of class FileIOCheckSheetHB
/*
 * Problems: I had trouble when I was trying to read it at the end
 */