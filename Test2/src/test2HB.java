/*
 * Hridaya Bijayananda
 */
import java.util.Scanner;

public class test2HB 
{
static Scanner input;
	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		int number;
		char symbol;
		
		System.out.println("Enter your number");
		number = input.nextInt();
		if (number < 1 || number > 100)
		{
			System.out.println("Your number can only be between 1 and 100. Enter another number");
			number = input.nextInt();
		}
		System.out.println("Enter your symbol");
		symbol = input.next().charAt(0);
		
		while (number >= 1 && number <= 100)
		{
			System.out.print(symbol);
			number --;
		}
		input.close();
	}
}
