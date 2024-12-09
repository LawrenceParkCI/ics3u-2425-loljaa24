package unit1;
/**
 * Description: This program guides the programmer as of how to create variable
 * Date: Sept 30, 2024
 * @author Arti Lolja
 */
public class CreatingVariables {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		// Warmup: print your name
		System.out.println("Arti Lolja");
		// Warmup: print the calculation for the area of a square with side length 25
		int x = 25;
		System.out.println("\n The area of the square with a side length of 25 is " + x*x);
		// Key Question: what if the value I want to use needs to change?
		System.out.println("\nIf the value you want to use needs to change, just do int x = diffnum");
		/*
		Variables
		- A variable is a place in memory that you can tell your computer to set aside when you make a program.
		- This location can be used to store a piece of information.
		- You can give this location a name
		- You can change the information that the location holds.
		- You can recall the value of this memory location later and use in different parts of your program

		 */
		System.out.println("\nPart 1");
		// what do you notice is being printed out?
		int myNum;
		myNum = 10;
		System.out.print("myNum = ");
		System.out.println(myNum);
		myNum = 20;
		System.out.println("myNum is now " + myNum);
		// Why do the two codes print out different things?
		System.out.println("\n the two codes print out different things because myNum is a different number and the wording is different.");
		System.out.println("\n Part 2 - Creating a Variable");
		/*
		A variable be:
		*declared* (Necessary) - you're telling the computer that you need to keep a value, and the computer will create a space in memory for it

		ie.
		int myNum; //you are declaring a variable called myNum that stores an int type of data

		*initialized*(Necessary) - in order to use the variable, you first need to give it an initial value. Otherwise, the computer won't be able to do something with the variable

		myNum = 10; //initializes the value of myNum to 10, so I can use it in other ways

		*assigned* - similar to initialize, that you're setting the value of the variable to another value

		myNum = 20; //I've changed the value of myNum

		Once your variable has been given a value, it can then be *referenced* - that is, it can be used by its name
		*/
		// Declare and initalize an int variable called myAge that stores your age.
		int myAge = 16;
		// Print it out in a sentence (Hint: remember how we combined text and numbers in a print statement)
		System.out.println("Arti is " + myAge);
		// Assign it a new value, that is 10 more than the original value
		myAge = myAge + 10;
		// Print it out in a new sentence (Hint: remember how we combined text and numbers in a print statement)
		System.out.println("In 10 years, Arti is " + myAge);



	}

}
