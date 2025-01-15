package unit1;
/**
 * Description: This program calculates the net pay
 * Date: Oct 7, 2024
 * @author Arti Lolja
 */
public class NetPay {
	/**
	 * This is the entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		//declare variables
		double netPay;
		int hours = 40;
		double wage = 5.00;
		double insurance = 2.00;
		double tax = 0.22;

		// print output
		System.out.println("The net pay is " + (netPay = (hours*wage-insurance) - tax*(hours*wage-insurance)) + " dollars");



	}

}
