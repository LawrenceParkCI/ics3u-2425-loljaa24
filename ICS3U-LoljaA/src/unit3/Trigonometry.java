package unit3;
import java.util.Scanner;
/**
 * Description: This is the ICS3U Final Project; an addition to MathPlus---utilizing trigonometric functions.
 * Date: Jan 7, 2025
 * @author Arti Lolja
 */
public class Trigonometry {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean restart = true; // Check to see if the user wants to repeat the program or not

		// narrowing down the user's options through if, if else, and else statements
		do {
			System.out.println("What trigonometric function do you want to use?");
			System.out.println("1. SOH CAH TOA\n2. SINE LAW\n3. COSINE LAW\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
			String choice = sc.next();
			if (choice.equalsIgnoreCase("1")) {
				System.out.println("\nThe Option SOH CAH TOA is chosen");
				System.out.println("Choose one of the options below:");
				do {
					System.out.println("\n1. SOH (Sin = Opposite/Hypotenuse)\n2. CAH (Cos = Adjacent/Hypotenuse)\n3. TOA (Tan = Opposite/Adjacent)\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
					choice = sc.next();
					if (choice.equals("1") || choice.equals("1.")) {
						System.out.println("\nOption \"SOH\" selected.");
						System.out.println("Are you finding an unknown side or an unknown angle?");
						do {
							System.out.println("\n1. SIDE\n2. ANGLE\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
							choice = sc.next();
							if (choice.equals("1") || choice.equals("1.")) {
								System.out.println("\nOption \"SIDE\" selected.");
								System.out.println("Are you finding the opposite or the hypotenuse?");
								do {
									System.out.println("\n1. OPPOSITE\n2. HYPOTENUSE\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
									choice = sc.next();
									if (choice.equals("1") || choice.equals("1.")) {
										
									}
									else if (choice.equals("2.") || choice.equals("2.")) {
										
									}
									else {
										System.out.println("UNKOWN RESPONSE");
									}
								} while (restart == true);
							}
							else if (choice.equals("2") || choice.equals("2.")) {
								
							}
							else {
								System.out.println("UNKNOWN RESPONSE");
							}
						} while (restart == true);
					}
					else if (choice.equals("2") || choice.equals("2.")) {
						System.out.println("\nOption \"CAH\" selected.");
						System.out.println("Are you finding an unknown side or an unknown angle?");
						do {
							System.out.println("\n1. SIDE\n2. ANGLE\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
							choice = sc.next();
							if (choice.equals("1") || choice.equals("1.")) {
								System.out.println("\nOption \"SIDE\" selected.");
								System.out.println("Are you finding the adjacent or the hypotenuse?");
								do {
									System.out.println("\n1. ADJACENT\n2. HYPOTENUSE\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
									choice = sc.next();
									if (choice.equals("1") || choice.equals("1.")) {
										
									}
									else if (choice.equals("2.") || choice.equals("2.")) {
										
									}
									else {
										System.out.println("UNKOWN RESPONSE");
									}
								} while (restart == true);
							}
							else if (choice.equals("2") || choice.equals("2.")) {

							}
							else {
								System.out.println("UNKNOWN RESPONSE");
							}
						} while (restart == true);
					}
					else if (choice.equals("3") || choice.equals("3.")) {
						System.out.println("\nOption \"TOA\" selected.");
						System.out.println("Are you finding an unknown side or an unknown angle?");
						do {
							System.out.println("\n1. SIDE\n2. ANGLE\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
							choice = sc.next();
							if (choice.equals("1") || choice.equals("1.")) {
								System.out.println("\nOption \"SIDE\" selected.");
								System.out.println("Are you finding the opposite or the adjacent?");
								do {
									System.out.println("\n1. OPPOSITE\n2. ADJACENT\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
									choice = sc.next();
									if (choice.equals("1") || choice.equals("1.")) {
										
									}
									else if (choice.equals("2.") || choice.equals("2.")) {
										
									}
									else {
										System.out.println("UNKOWN RESPONSE");
									}
								} while (restart == true);
							}
							else if (choice.equals("2") || choice.equals("2.")) {

							}
							else {
								System.out.println("UNKNOWN RESPONSE");
							}
						} while (restart == true);
					}
					else {
						System.out.println("UNKNOWN RESPONSE");
					}
				} while (restart == true);
			}
			else if (choice.equals("2") || choice.equals("2.")) {

			}
			else if (choice.equals("3") || choice.equals("3.")) {

			}
			else {
				System.out.println("UNKNOWN RESPONSE");
			}
		} while (restart == true);
	}
}
