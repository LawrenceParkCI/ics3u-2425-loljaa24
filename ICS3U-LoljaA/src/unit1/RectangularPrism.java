package unit1;

import java.util.Scanner;
/**
 * Description: This program calculates the area of a rectangle
 * Date: Oct 2, 2024
 * @author Arti Lolja
 */
public class RectangularPrism {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declare variables
		int length;
		int width;
		int depth;
		
		//get the user input
		System.out.println("VOLUME PROGRAM");
		System.out.print("Type in the length of the rectangular prism and press <Enter>: ");
		length = sc.nextInt();
		
		System.out.print("Type in the width of the rectangular prism and press <Enter>: ");
		width = sc.nextInt();
		
		System.out.print("Type in the depth of the rectangular prism and press <Enter>: ");
		depth = sc.nextInt();
		
		//calculate the volume
		int volume = length * width * depth;
		
		//print the output
		System.out.println("\nThe volume of your rectangular prism is " + volume);
		sc.close();

	}

}
