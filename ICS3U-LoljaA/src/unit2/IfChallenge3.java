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
	 */
	public static void main(String[] args) {
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
		String a1, a2;
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
		System.out.println("\n The first question is...");
		System.out.println("\n What is the capital of Australia?");
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
		System.out.println("\n The second question is...");
		System.out.println("\n The capital of Brazil is Rio de Janeiro");
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
		System.out.println("\n The third question is...");
		System.out.println("\nHow many capital cities does the Republic of South Africa have?");
		System.out.print("Type in your answer here (an integer): ");
		a3 = sc.nextInt();
		if (a3 == 3) {
			System.out.println("\nThat was hard! You get two points!");
			quizPoints += 2; }
		else {
			System.out.println("\nThat's okay. You get a point for effort. They have three capital cities.");
			quizPoints += 1; }
		
		//CONCLUSION
		System.out.println("\nCongratulations on completing the quiz!");
		System.out.println("Your final score is: " + quizPoints + "/4.0");
		System.out.println("You got a grade of " + ((quizPoints / 4)*100) + "%.");
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