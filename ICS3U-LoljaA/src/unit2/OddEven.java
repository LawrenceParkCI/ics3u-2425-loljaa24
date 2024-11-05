package unit2;

import java.util.Scanner;
/**
 * Description: This program determines whether an integer is even or odd
 * Date: Nov 4, 2024
 * @author Arti Lolja
 */
public class OddEven {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//declare variables
		int num;
		
		//input an integer
		System.out.print("Type in an integer: ");
		num = sc.nextInt();
		
		//print output
		if (num % 2 == 0) {
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number provided is odd.");
		}
		sc.close();
	}

}
