package unit1;

/**
 * Description: This teaches the programmer even more about casting
 * Date: Oct 15, 2024
 * @author Arti Lolja
 */
public class Casting3 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/* 
		 * Strings and Back Again
		 */
		//Recall:
		System.out.println("Part 1");
		System.out.println("1 + 2 + 3" + 4 + 5);
		//why did it print out this way?

		// it printed out this way because it printed out the characters in the quotations
		// for the stuff outside the quotations, it removed whitespace and symbols

		//Demonstrate casting a double value to a String in this way

		System.out.println("lalalala" + 5.0);

		//Demonstrate casting a boolean value to a String in this way
		
		System.out.println("lalalalala" + true);
		
		//Demonstrate casting a char value to a String in this way

		System.out.println("lalalallaa" + 'a');
		
		System.out.println("\nPart 2");
		//In order to change a String into an integer, we need another set of code

		String strNum = "-5";
		int myNum = Integer.parseInt(strNum);

		System.out.println(strNum + " x 2 = " + (myNum + myNum));

		/*Change strNum to the following values, and see if they work:
		 * "25.2" - doesnt work
		 * "23c" - doesnt work
		 * "2 3" - doesnt work
		 * "Lol23" - doesnt work
		 * "-5" - works
		 */
		//What can you say about how we can use the function, Integer.parseInt()?

		// the function only works if the variable strNum is an integer

		// What do you think the code to change a String to double would look like?

		String strNum2 = "-10.0";
		double myNum2 = Double.parseDouble(strNum2);
		System.out.println(myNum2 + " x 2 = " + (myNum2 + myNum2));
		
		//When do you think it might be necessary to change a string value into an integer value/double value?
		
		// it might be necessary to change a string value into an integer/double value when you have to do mathematical calculations with the string
		
	}
}