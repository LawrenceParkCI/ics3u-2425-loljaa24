package unit1;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 * Description: This program prints out a grocery receipt
 * Date: Oct 18, 2024
 * @author Arti Lolja
 */
public class GroceryShopping {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
	Scanner UPC = new Scanner(System.in);
	
	// Declaring Variables:
	String item1, item2;
	double cost1, cost2;
	int amount1, amount2;
	
	// Receiving user input for the first grocery item:
	System.out.println("/ / $$$ //  Mr. Lolja's Groceries  \\\\ $$$ \\ \\");
	System.out.println("_____________________________________________");
	System.out.print("\nWhat product are you purchasing? : ");
	item1 = UPC.next();
	System.out.print("How much does it cost? : ");
	cost1 = UPC.nextDouble();
	System.out.print("How much of this item are you buying? : ");
	amount1 = UPC.nextInt();
	System.out.println("Awesome!");
	
	// Receiving user input for the second grocery item:
	System.out.print("\nWhat other product are you purchasing?: ");
	item2 = UPC.next();
	System.out.print("How much does it cost? : ");
	cost2 = UPC.nextDouble();
	System.out.print("How much of this item are you buying? : ");
	amount2 = UPC.nextInt();
	System.out.println("Good!");
	
	// Starting to print out output:
	System.out.println("\nThis is your receipt:\n\n");
	System.out.format("%49s", "Mr. Lolja's Grocery");
	System.out.format("\n%49s", "___________________");

	// Formats:
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\nyyyy/MM/dd HH:mm:ss");  
	LocalDateTime now = LocalDateTime.now();  
	System.out.println(dtf.format(now));
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	// Declaring plenty of variables:
	double itemtotalcost1 = cost1*amount1, itemtotalcost2 = cost2*amount2;
	final double taxrate = 0.13;
	double subtotal = itemtotalcost1 + itemtotalcost2;
	double taxtotal = subtotal * taxrate;
	double finaltotal = subtotal + taxtotal;
	int finaltotal2 = (int)(Math.round(finaltotal));
	double nearestfive = Math.round(finaltotal/0.05)*0.05;

	// Receipt:
	System.out.println("____________________________________________________________________");
	System.out.format("%-15s| %-15s| %-15s| %-15s|", "| Item\t", "Price", "Quantity", "Total Price   ");
	System.out.println("\n|_______________|________________|________________|________________|");
	System.out.format("|%-15s| %15s| %15s| %15s|", item1, money.format(cost1), amount1, money.format(itemtotalcost1));
	System.out.format("\n|%-15s| %15s| %15s| %15s|", item2, money.format(cost2), amount2, money.format(itemtotalcost2));
	System.out.println("\n|_______________|________________|________________|________________|");
	System.out.format("%50s %16s", "Subtotal:", money.format(subtotal));
	System.out.format("\n%50s %16s", "Tax:", money.format(taxtotal));
	System.out.format("\n%50s %16s", "Total:", money.format(finaltotal));
	
	// End of output; saying goodbye to the customer.
	System.out.println("\n\nThis is approximately $" + finaltotal2 + ".");
	System.out.println("If you are paying with cash, that will be " + money.format(nearestfive) + ".");
	System.out.println("\nHave a good rest of your day!");
	System.out.println("Thank you for visiting Mr.Lolja's grocery!");
	System.out.println("\n/ / $$$ //  Mr. Lolja's Groceries  \\\\ $$$ \\ \\");
	
	UPC.close();
	}

}
