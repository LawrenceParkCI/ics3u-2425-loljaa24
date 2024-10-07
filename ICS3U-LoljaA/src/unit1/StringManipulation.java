package unit1;

import java.util.Scanner;
/**
 * Description:
 * Date: Oct 7, 2024
 * @author Arti Lolja
 */
public class StringManipulation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//declare variables
		String sentence;
		
		//receive user input
		System.out.println("type in a sentence");
		sentence = sc.nextLine();
		
		//print output
		System.out.println("\nThe following has been printed:");
		System.out.println("\n" + sentence);
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
		System.out.println("The sentence is " + sentence.length() + " characters long");
		System.out.println("At index 5, the character displayed is: " + sentence.charAt(5));

	}

}
