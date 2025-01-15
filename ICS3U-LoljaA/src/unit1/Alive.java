package unit1;

import java.util.Scanner;
/**
 * Description: this program calculates the number of days ones been alive and the number of hours one has slept
 * Date; Oct 7, 2024
 * @author Arti Lolja
 */
public class Alive {
	/**
	 * This is the entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//declare variables
		int byear, bmonth, bday;
		int cyear, cmonth, cday;
		int tdays, shours;

		// receive user input
		System.out.println("Enter your birthdate (YYYY/MM/DD) and press <enter> each time you write a number:");
		byear = sc.nextInt();
		bmonth = sc.nextInt();
		bday = sc.nextInt();


		System.out.println("Enter today's date and press <enter> each time you write a number");
		cyear = sc.nextInt();
		cmonth = sc.nextInt();
		cday = sc.nextInt();

		//print output
		System.out.println("\nYou have been alive for " + (tdays = ((cyear - byear)*365) + ((cmonth - bmonth)*30) + (cday - bday)) + " day(s).");
		System.out.println("You have been asleep for around " + (shours = tdays*8) + " hours.");
		sc.close();
	}

}
