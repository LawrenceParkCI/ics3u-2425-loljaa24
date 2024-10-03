package unit1;
/**
 * Description: This program teaches the programmer about floating point variables
 * Date: Oct 3, 2024
 * @author Arti Lolja
 */
import java.util.Scanner;

public class InputFP {
	/**
	 * This is the entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// declare variables
		double num1, num2;
		
		// receive user input
		System.out.println("Type in one floating point number");
		num1 = sc.nextDouble();
		System.out.println("Type in another floating point number");
		num2 = sc.nextDouble();
		
		// print the output
		System.out.println();
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
		sc.close();


	}

}
