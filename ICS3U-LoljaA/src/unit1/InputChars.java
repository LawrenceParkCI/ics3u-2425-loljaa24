package unit1;

import java.util.Scanner;
/**
 * Description: This program teaches the programmer about character variables
 * Date: Oct 3, 2024
 * @author Arti Lolja
 */
public class InputChars {
	/**
	 * This is the entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	// declare variables
	char ch1, ch2, ch3;
	
	//receive user input
	System.out.println("Type in any three characters on the keyboard");
	System.out.println("Press <Enter> after each.");
	ch1 = sc.nextLine().charAt(0);
	ch2 = sc.nextLine().charAt(0);
	ch3 = sc.nextLine().charAt(0);
	
	// print the output
	System.out.println();
	System.out.print("Together these 3 letters spell: " + (ch1 + ch2 + ch3));
	sc.close();

	}

}

