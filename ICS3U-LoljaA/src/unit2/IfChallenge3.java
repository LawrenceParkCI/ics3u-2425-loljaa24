package unit2;
import java.util.Scanner;
/**
 * Description: This program is an interactive quiz about the capital cities of countries.
 * Date: Nov 13, 2024
 * @author Arti Lolja
 */
public class IfChallenge3 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//This is for the portfolio

		/*
    Write an interactive quiz. It should ask the user three 
    multiple-choice or true/false questions about something. 
    It must keep track of how many they get wrong, and print 
    out a "score" at the end.

    Sample:

    Are you ready for a quiz?  N
    Okay, here it comes!

    Q1) What is the capital of Alaska?
      1) Melbourne
      2) Anchorage
      3) Juneau

    > 3

    That's right!
		 */
		Scanner sc = new Scanner(System.in);
		// Declaring variables:
		String s1, s2;
		String a1, a2, a4, a5, a6;
		int a3;
		double quizPoints = 0;
		// Receiving name and opinion before starting quiz...
		System.out.print("Hey you! What is your name: ");
		s1 = sc.nextLine();
		System.out.println("Nice name!");
		System.out.print("\nDo you want to do a short quiz? ");
		s2 = sc.nextLine();
		if (s2.equalsIgnoreCase("Yes")) {
			System.out.println("\nOkay! The quiz is going to start now!"); }
		else {
			System.out.println("\nToo bad! The quiz is going to start now!"); }

		// FIRST QUESTION!!!
		System.out.println("\nThe first question is...");
		System.out.println("\nWhat is the capital of Australia?");
		System.out.println("A) Sydney");
		System.out.println("B) Melbourne");
		System.out.println("C) Canberra");
		System.out.println("D) Brisbane");
		System.out.print("Type in your answer here: ");
		a1 = sc.next();
		if (a1.equalsIgnoreCase("C") || a1.equalsIgnoreCase("C)") || a1.equalsIgnoreCase("Canberra")) {
			System.out.println("\nThat is correct, you gain a point!");
			quizPoints += 1; }
		else {
			System.out.println("\nYou got fooled there, you do not gain a mark for that."); }
			
		// SECOND QUESTION!!!
		System.out.println("\nThe second question is...");
		System.out.println("\nThe capital of Brazil is Rio de Janeiro");
		System.out.println("A) TRUE");
		System.out.println("B) FALSE");
		System.out.print("Type in your answer here: ");
		a2 = sc.next();
		if (a2.equalsIgnoreCase("B") || a2.equalsIgnoreCase("B)") || a2.equalsIgnoreCase("FALSE")) {
			System.out.println("\nThat is correct, you get a point!");
			quizPoints += 1; }
		else {
			System.out.println("\nHow did you not get that?? You are not getting a point"); }
		
		// THIRD QUESTION!!!
		System.out.println("\nThe third question is...");
		System.out.println("\nHow many capital cities does the Republic of South Africa have?");
		System.out.print("Type in your answer here (an integer): ");
		a3 = sc.nextInt();
		if (a3 == 3) {
			System.out.println("\nThat was hard! You get two points!");
			quizPoints += 2; }
		else {
			System.out.println("\nThat's okay. You get a point for effort. They have three capital cities.");
			quizPoints += 1; }
		
		// FOURTH QUESTION!!
		System.out.println("\nThe fourth question is...");
		System.out.println("\nWhat is the capital city of the canadian province that does not have provincial sales tax?");
		System.out.println("GENERATING...");
		Thread.sleep(1000);
		System.out.println("\n            .:..                 \r\n"
				+ "             %..=*-.              \r\n"
				+ "          ..%.     .=#=....       \r\n"
				+ "          .*..        ..:+*-....  \r\n"
				+ "         .+.              ....**-.\r\n"
				+ "        .+..                  .--.\r\n"
				+ "       .+:                  . .*. \r\n"
				+ "      .+:.                    *:. \r\n"
				+ "     .+-.                  ...=.  \r\n"
				+ "    .=-.                    .%.   \r\n"
				+ "   .-:.                    .-..   \r\n"
				+ "  .-:.                   ...#..   \r\n"
				+ " ..*.                     .*...   \r\n"
				+ " .-+.                    .-=...   \r\n"
				+ "  .-+.                   .*..     \r\n"
				+ "   .%.                  .+:       \r\n"
				+ "   .:=.                ..+.       \r\n"
				+ "    .#.                .*.        \r\n"
				+ "     .#.              .-=         \r\n"
				+ "     .-+.             .*.         \r\n"
				+ "      .*.            .*:          \r\n"
				+ "      ..*.          ..=.          \r\n"
				+ "        :=          .%..          \r\n"
				+ "       .*.         .::.           \r\n"
				+ "       :=.        ..%.            \r\n"
				+ "       .=*-..     .*.             \r\n"
				+ "           .:#*:. -=.             \r\n"
				+ "               ..:-               ");
		System.out.println("\nA) Vancouver");
		System.out.println("B) Regina");
		System.out.println("C) Calgary");
		System.out.println("D) Edmonton");
		System.out.println("E) None of the Above");
		System.out.print("Type your answer here: ");
		a4 = sc.next();
		if (a4.equalsIgnoreCase("D)") || a4.equalsIgnoreCase("D") || a4.equalsIgnoreCase("Edmonton")) {
			System.out.println("\nThat is correct! You gain a point");
			quizPoints += 1; }
		else {
			System.out.println("\nWomp womp. No points.");	}
		
		// FIFTH QUESTION
		System.out.println("\nThe fifth question is...");
		System.out.println("\nWhat are the capitals of the states in the USA that have the word \"Dakota\"");
		System.out.println("A) Bismarck");
		System.out.println("B) Pierre");
		System.out.println("C) Cheyenne");
		System.out.println("D) Helena");
		System.out.print("Type the two answers here VVV");
		System.out.print("\nYour first answer is: ");
		a5 = sc.next();
		System.out.print("Your second answer is: ");
		a6 = sc.next();
		if ((a5.equalsIgnoreCase("A)") || a5.equalsIgnoreCase("A") || a5.equalsIgnoreCase("Bismarck")) && (a6.equalsIgnoreCase("B)")) || a6.equalsIgnoreCase("B") || a6.equalsIgnoreCase("Pierre")) {
			System.out.println("\nWOW! You got it correct! You get two points.");
			quizPoints +=2; }
		else {
			System.out.println("\nEven if you got atleast 1 right, you still get zero points!"); }
		
		//CONCLUSION
		System.out.println("\nCongratulations on completing the quiz!");
		System.out.println("Your final score is: " + quizPoints + "/7.0");
		System.out.println("You got a grade of " + (Math.rint((quizPoints / 7)*100)) + "%.");
		if (quizPoints == 4) {
			System.out.println("\nGood job!!! You got a perfect score."); }
		else if (quizPoints == 3) {
			System.out.println("\nYou should be proud of yourself, you did better than 50% of people that took this quiz."); }
		else if (quizPoints == 2) {
			System.out.println("\nYou failed according to the american school system."); }
		else {
			System.out.println("\nHow????"); }
		System.out.println("\nHave a good day! Thank you for completing the quiz.");
		
		sc.close();
		}
		
	}