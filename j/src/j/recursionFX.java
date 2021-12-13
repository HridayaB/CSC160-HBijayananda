package j;
import java.util.Scanner;

public class recursionFX 
{
	public static void main(String[] args) 
	{
		int num1, num2, answer;
		System.out.println("Enter 2 numbers");
		num1 = 5;
		num2 = 4;
		answer = crazyF(num1, num2);
		System.out.println("\nanswer " + answer);
	}

	static int crazyF(int num1, int num2)
	{
		System.out.println ( "in crazyF with " + num1 + " and " + num2 );
		int value = 0;
		int a, b;
		if(num2 > 0)
		{
			a = crazyF(num1-1, num1-2);
			b = crazyF(num2-1, num2-2);
			value = a + b;
			System.out.println ( "value = " + value );
		}
		else if (num2 == 0)
		{
			value = num1;
		}
		return value;
	}
} 