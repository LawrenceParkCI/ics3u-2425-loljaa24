package unit2;
import java.util.Scanner;
/**
 Description: This is a second challenge using do-while and while loops.
 Date: Nov 26, 2024
 @author Arti Lolja
 */
public class LoopChallenge2 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
      Write a program to take the square root of a number typed in by 
      the user. Your program should use a loop to ensure that the number 
      they typed in is positive. If the number is negative, you should 
      print out some sort of warning and make them type it in again.

      You can get the square root of a number n with Math.sqrt(n). Make 
      sure you don't do this until the loop is done and you know for 
      sure you've got a positive number.

      Use the loop that you didn't use in LoopChallenge1
		 */
		Scanner sc = new Scanner(System.in);
		
		// declare variable
		double num = -1;
		
		// receive input
			while (num < 0) {
				System.out.print("Type in a positive number here: ");
				num = sc.nextDouble();
				System.out.println("IT HAS TO BE POSITIVE!!");
			}
		
		// print output
			System.out.println("The square root of the number you typed is: " + Math.sqrt(num) + ".");
		
			sc.close();
	}
}