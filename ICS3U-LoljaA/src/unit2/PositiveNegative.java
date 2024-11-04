package unit2;

import java.util.Scanner;
/**
 * Description: This program determines whether an integer is positive/negative and if it's divisible by 7
 * Date: Nov 4, 2024
 * @author Arti Lolja
 */
public class PositiveNegative {
	/**
	 * This is the entry point tothe program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//declare variable
		int num;
		
		//receive input
		System.out.println("Type in an integer");
		num = sc.nextInt();
		
		//print 1st output
		if (num >= 0) {
			System.out.println("This integer is positiv.e");
		}
		else {
			System.out.println("This intege is negative.");
		}
		// print 2nd output
		if (num % 7 == 0) {
			System.out.println("This integer is divisble by 7.");
		}
		else {
			System.out.println("This integer is not divisble by 7.");
		}
		sc.close();
		
	}

}
