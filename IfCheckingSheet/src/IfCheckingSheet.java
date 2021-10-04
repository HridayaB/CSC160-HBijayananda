import java.util.Scanner;

public class IfCheckingSheet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOne;
		int numberTwo;
		System.out.println("Enter numberOne");
		
		numberOne = input.nextInt();
		System.out.println("Enter numberTwo");
		numberTwo = input.nextInt();
		
		
		if (numberOne<numberTwo); {
			System.out.println("numberTwo is higher");

		}
		
		int numberThree;
		numberThree = input.nextInt();
		
		if (numberOne>numberTwo && numberOne>numberThree) {
			System.out.println("The highest number is " + numberOne);
			if (numberTwo>numberThree) {
				System.out.println("The second hoghest number is " + numberTwo);
			}
			else {
				System.out.println("The lowest number is " + numberThree);
			}
		}
		
	}	

}
