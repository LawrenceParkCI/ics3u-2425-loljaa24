package unit2;
import java.util.Scanner;
/**
 * Description: This is a challenge using if statements
 * Date: Nov , 2024
 * @author Arti Lolja
 */
public class IfChallenge {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*

    (IF)

    ask for the user's favourite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
		 */
		
		// challenge 1
		// declare variables
		int favNum;
		
		// receive input
		System.out.println("What is your favourite number?");
		favNum = in.nextInt();
		
		// print output
		if (favNum < 0) {
			System.out.println("You are gloomy and need to be more cheerful.");
		}
		if (favNum % 2 != 0) {
			System.out.println("You are really, really strange.");
		}
		
		if (favNum % 6 == 0) {
			System.out.println("You should really consider choosing 6 instead.");
		}
		else {
			System.out.println("You can keep being wholesome.");
		}
		if (favNum % 10 == 8) {
			System.out.println("You are too full...");
		}
		else if (favNum % 10 == 9) {
			System.out.println("Canada is a really nice country!");
		}
		else {
			System.out.println("Don't count on it.");
		}
	in.close();
	}
}