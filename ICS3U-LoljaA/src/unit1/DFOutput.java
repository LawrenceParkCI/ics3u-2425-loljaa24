package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Description: This program teaches the programmer about DecimalFormat
 * Date: Oct 17, 2024
 * @author Arti Lolja
 */
public class DFOutput {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Run the following program with a cost of 10.00.
		//What value is displayed in the output = 11.3

		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);

		System.out.println("The cost of your item with tax is " + money.format(total));


		//Change the above print statement on line 23 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?

		// the output is 11.30 because the the DecimalFormat money has a format of two decimal places.

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?

		// The output is different because the format was changed to include a dollar sign

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?

		// The output is $11.3 because the format changed to $0.##, the ## is the same as .00 except it does not display trailing zeros from the final output

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 11.865
		//Run the program again with the cost of 10.50, what is happening?

		// The output rounds to two decimal places

		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?

		// The output is $139505.28

		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.

		// The output is $139,505.28 because commas are added to the decimal format.

		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		// The value printed for the TAX_RATE is 0.13

		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the tax rate displayed differently?

		// the tax rate is displayed differently because the variable TAX_RATE is using the percent decimal format.

		sc.close();
	}

}
