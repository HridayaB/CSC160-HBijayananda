/*
 * Hridaya Bijayananda
 * Due: 10/08/21
 * Description: Learning to use loops better in coding
 */
import java.util.Scanner;
public class LoopCheckingSheetHB {
static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float amountBacteria; //The amount of bacteria
		float numSamples; //The number of samples
		float totalBacteria; //The total amount of bacteria
		int samplesCount; //The count of the samples
		System.out.println("Enter the number of samples");
		numSamples = input.nextInt();
		samplesCount = 0;
		totalBacteria = 0;
		System.out.println("The number of samples is " + numSamples);
		
		while (samplesCount < numSamples)
		{
			System.out.println("Enter the amount of bacteria");
			amountBacteria = input.nextInt();
			samplesCount = samplesCount + 1;
			System.out.println("The count of the number of the samples is " + samplesCount);
			totalBacteria = totalBacteria + amountBacteria;
			System.out.println("The total amount of bacteria is " + totalBacteria);
		}
		System.out.println("The total amount of bacteria is " + totalBacteria);
		input.close();
	}

}
/*
* Problems: I had trouble figuring out what I was going to put on the while condition.
*/