package unit1;
import java.util.Scanner;
/**
 * Description: This program teaches the programmer about strings
 * Date: Oct 3, 2024
 * @author Arti Lolja
 */
public class PlayingWithStrings {
/**
 * This is the entry point to the program
 * @param args
 */
	public static void main(String[] args) {
		String msg = "I am enjoying this class.";
		
		String msg1 = msg.toUpperCase();
		String msg2 = msg.toLowerCase();
		char letter = msg.charAt(6);
		
		System.out.println(msg);
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("Character at index 6 = " + letter);
		System.out.println("msg has " + msg.length() + " characters.");
				
	}

}
