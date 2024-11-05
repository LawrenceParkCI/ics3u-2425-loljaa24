package unit2;

import java.util.Scanner;
/**
 * Description: This is the second if challenge.
 * Date: Nov 5, 2024
 * @author Arti Lolja
 */
public class IfChallenge2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//This is for the portfolio

		/*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
		 */

		//declare variables
		int num1, num2, num3;

		// receive input
		System.out.print("Type in three integers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		//print output
		if (num1 == 2) {
			System.out.println("The numbers are in order.");
		}
		else {
			System.out.println("The numbers are NOT in order.");
		}
	sc.close();
	}
}