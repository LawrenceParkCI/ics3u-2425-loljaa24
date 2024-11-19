package unit2;
/**
 * Description: This program does a rolling dice competition between the computer and the user
 * Date: Nov 19, 2024
 * @author Arti Lolja
 */
public class DoubleDiceContest {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */
		
		// introduction
		System.out.println("Welcome to the dice competition!");
		System.out.println("The user's dice are being rolled...");
		Thread.sleep(1500);
		// roll user's dice
		int die1 = (int)((Math.random()*6)+1);
		int die2 = (int)((Math.random()*6)+1);
		// declare the user's score
		int totalUDice = die1 + die2;
		System.out.println("The user has a total dice score of: " + totalUDice);
		// computer's turn
		System.out.println("\nThe computer's dice are being rolled...");
		Thread.sleep(1500);
		// roll comp's dice
		int die3 = (int)((Math.random()*6)+1);
		int die4 = (int)((Math.random()*6)+1);
		// declare the computer's score
		int totalCDice = die3 + die4;
		System.out.println("The computer has a total dice score of: " + totalCDice);
		
		// declaring the winner
		Thread.sleep(1500);
		if (totalUDice > totalCDice) {
			System.out.println("\nThe winner of the dice competition is the user! Congrats!"); }
		else if (totalUDice == totalCDice) {
			System.out.println("\nThere is a tie! You are both winners in my heart."); }
		else {
			System.out.println("\nThe winner of the dice competition is the computer! Boohoo.");
		}
		
		
		

	}

}
