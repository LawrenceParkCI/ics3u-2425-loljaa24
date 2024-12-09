package unit2;
import java.util.Scanner;
/**
 Description: The flowchart to this sample program
 Date: Nov 26, 2024
 @author Arti Lolja
 */
public class FlowChartChallenge {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*Create a flow chart for this program. Add the Share link
    to your flowchart as a comment in this program.
    How would the flow chart of the do-while loop
     and while loop differ?
		 */

		// https://drive.google.com/file/d/1xh6uXsEcZbB2AY5CdoLgpIcjs8oLm1eo/view?usp=sharing
		
		/*
		 * A while loop checks for the condition at the beginning of the loop while,
		 * the do-while loop checks for the condition at the end of the loop
		 */
		
		Scanner sc = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = sc.nextLine();
		} while (!name.equals("Ms. Kemp"));

		System.out.println("You are welcome into the secret secret pogchamp club.");

		sc.close();

	}
}