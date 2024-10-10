package unit1;
import java.util.Scanner;
/**
 * Description:
 * Date: Oct 9, 2024
 * @author 
 */
public class UsingMathMethods {
	/**
	 * This is the entry point of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("Part A");

		//Write code to ask the user for any real number to be input.
		System.out.println("Print any real number below and press <enter>");
		//Store their input into the num variable
		num = sc.nextDouble();

		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num, num));
		System.out.println(Math.pow(num, 3));

		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 * 
		 * 					num = 16.75		| num = 4.0		| num = -23.45
		 * 					-----------------------------------------------
		 * Math.round(num)		17			| 		4		|	-23
		 * Math.rint(num)		17.0		| 		4.0		|	-23.0
		 * Math.sqrt(num) 		4.092		|		2.0		|	NaN
		 * Math.abs(num)		16.75		|		4.0		|	23.45
		 * Math.pow(num, 2)		280.5625	|		16.0	|	549.90249999999999
		 * Math.pow(num, num)	3.1782E20	|		256.0	|	NaN
		 * Math.pow(num, 3)		4699.421	|		64.0	|	-12895.213624999999
		 * 
		 */

		//Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		
		// You can't square root negative numbers
		
		//Nan stands for Not a number!

		//In your own words describe what the following Math methods does
		/*
		 * round: Round to the nearest whole number and converts to int type
		 * rint: Rounds to the nearest whole number and maintains double type
		 * sqrt: Square roots number and maintains double type
		 * abs: Absolute Value the number (converts to positive) and maintains double type
		 * pow: multiplys the number by itself a certain amount of times (maintains double type)
		 */

		//The methods round, sqrt and abs only have one parameter (which is in the brackets).
		//Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.

		// the first parameter is the number, and the second parameter is the exponent

		System.out.println("Part B");
		//Ask the user for any real number and an integer to be input. Display the real number,
		double num2;
		
		System.out.println("\nType in two numbers to be input. 1st number is the base, 2nd number is the exponent:");
		num = sc.nextDouble();
		num2 = sc.nextDouble();
		
		//and its square root. Also determine and display the real number raised to the integer power.
		
		System.out.println(Math.sqrt(num));
		System.out.println(Math.pow(num, num2));
		
		//Use suitable headings, displaying the results across the screen.\
		//
		//Eg. If the real number 13.5 and the integer 2 are input, display
		//REAL NUMBER	SQUARE ROOT		RAISED TO POWER 2 <- display power here
		//   13.5		   3.6742			182.25

		System.out.println("If the real number " + num + " and the exponent " + num2 + " are input, it displays:");
		System.out.println("________________________________");
		System.out.println("|REAL NUMBER: " + num + "\t\t|");
		System.out.println("|_______________________________|");
		System.out.println("|SQUARE ROOT: " + Math.sqrt(num) + "|");
		System.out.println("|_______________________________|");
		System.out.println("|RAISED TO POWER " + num2 + ":" + " " + Math.pow(num, num2) + "\t|");
		System.out.println("|_______________________________|");

		//Write down the results produced by your program when the real number 7.8985 and
		//the integer 3 are input.
		
		//REAL NUMBER: 7.895
		// SQUARE ROOT: 2.8104270138183627
		// RAISED TO POWER 3: 492.75820832162503

		//Change your program so that instead of inputting an integer power, a real number
		//power can be input.
		//Write down the results produced by your program when the following are input:
		//a) the number 16 and the real number power 0.5
		//b) the number 8 and the real number power 0.33

		//a)								b)
		// REAL NUMBER:	 16					REAL NUMBER: 8
		// SQUARE ROOT:	 4					SQUARE ROOT:  2.8284271247461903
		// RAISED TO POWER 0.5:	4.0			RAISED TO POWER 0.33:B 1.9861849908740719

		//Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?

		// Yes, because the 2nd number is more precise that it gives a different result

		sc.close();
	}

}
