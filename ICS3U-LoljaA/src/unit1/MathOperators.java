package unit1;
/**
 * Description: This program teaches the programmer about how to use Math Operators in java
 * Date: Oct 1, 2024
 * @author 342855897
 */
public class MathOperators {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
        Pre: Kind of Math, but not really
        What do you notice is happening?
		 */

		System.out.println("Butter" + "fly");
		System.out.println("1 + 2 + 3 + 4 + 5");
		System.out.println(1 + 2 + 3 + 4 + 5);
		System.out.println(1 + 2 + "3 + 4 + 5");
		System.out.println("1 + 2 + 3" + 4 + 5);
		System.out.println("The numbers or characters in quotes are written in full while everything else is added together");

		//Why do you think the last two outputs act so differently?

		System.out.println("\nI think the last two outputs act differently because the quotations are wonky");

		//Summary: What are two possible roles of the + operator?

		System.out.println("\nThe two possible roles of the + operator are adding numbers and merging two strings into one");

		System.out.println("\nPart 1"); 
		/*
		 * Figure out what is the meaning of each operator. Use print statements
        to verify your answer and explain.
		 */

		System.out.println("+ means: adding numbers together and merging quotes");

		System.out.println("- means: subtracting numbers");

		System.out.println("* means: multiplying numbers together");

		System.out.println("/ means: dividngs numbers together\n");

		//Print the following expression: (3 + 2) * 5
		System.out.println( (3 + 2) * 5);
		//Print the following expression: 3 + 2 * 5
		System.out.println(3 + 2 * 5);
		//Was this expected? Why or why not?
		System.out.println("This was expected because java follows BEDMAS");
		
        System.out.println("\nPart 2 - Calculate Using Operators");
        
        // Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit
        System.out.println(45 * (9.0/5.0) + 32 + "°F");
        // Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
		System.out.println((900 - 32) * (5.0/9.0) + "°C");

		
        System.out.println("\nPart 3");
       // Figure out what is the meaning of % as a math operator. Use print statements to check your answer.

		System.out.println("\nI think % means: the remainder of integer division");

	}

}
