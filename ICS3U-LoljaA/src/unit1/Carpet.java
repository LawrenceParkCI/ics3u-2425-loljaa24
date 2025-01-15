package unit1;

import java.util.Scanner;
/**
 * Description: This program states the cost of a carpet of any size
 * Date: Oct 8, 2024
 * @author Arti Lolja
 */
public class Carpet {
/**
 * This is the entry point to the program
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// declare variables
		double length, width, cost;
		double total;
		
		//receive user input
		System.out.println("State the length of your future carpet (m) and press <enter>: ");
		length = sc.nextDouble();
		
		System.out.println("State the width of your future carpet (m) and press <enter>: ");
		width = sc.nextDouble();
		
		System.out.println("State the cost of your carpet per sqm and press <enter>");
		cost = sc.nextDouble();
		
		//print output
		System.out.println("\nThe cost of your future carpet is: " + (total = cost*length*width) + " dollars.");
		sc.close();
		

	}

}
