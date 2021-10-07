/*
 * Hridaya Bijayananda
 * IfCheckingSheetHB
 * Due: 10/05/21
 * Description: Learning to use if statements in coding
 */
import java.util.Scanner;

public class IfCheckingSheetHB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numberOne;
		String numberTwo;
		System.out.println("Enter numberOne");
		numberOne = "one";
		System.out.println("Enter numberTwo");
		numberTwo = "two";
		
		
		if (numberOne < numberTwo) {
			System.out.println(numberTwo + "is higher");
		}
		else {
			if (numberOne > numberTwo) {
				System.out.println(numberOne + "is higher");
			}
		}
		
		String numberThree;
		System.out.println("Enter numberThree");
		numberThree = "three";
		if (numberOne > numberTwo && numberOne > numberThree) {
			System.out.println("The highest number is " + numberOne);
			if (numberTwo > numberThree) {
				System.out.println("The second highest number is " + numberTwo);
				System.out.println("The lowest number is " + numberThree);
			}
		}
	}
}
/*
* Problems: I had trouble with spaces and
* I started to over think during the string part
*/