package unit1;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Description:
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
	
	//declare variables
	String item1, item2;
	double cost1, cost2;
	int amount1, amount2;
	
	// receive user input for first grocery item
	System.out.println("| | $$$ || \"Mr. Lolja's Groceries\" || $$$ | |");
	System.out.println("_____________________________________________");
	System.out.println("\nWhat product are you purchasing?");
	item1 = UPC.next();
	System.out.println("How much does it cost?");
	cost1 = UPC.nextDouble();
	System.out.println("How much of this item are you buying?");
	amount1 = UPC.nextInt();
	System.out.println("Awesome!");
	
	// receive user input for second grocery
	System.out.println("\nWhat other product are you purchasing?");
	item2 = UPC.next();
	System.out.println("How much does it cost?");
	cost2 = UPC.nextDouble();
	System.out.println("How much of this item are you buying?");
	amount2 = UPC.nextInt();
	System.out.println("Good!");
	
	// begin print output
	System.out.println("\nThis is your receipt:\n\n");
	System.out.format("%25s", "Mr. Lolja's Grocery");

	// formats
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	LocalDateTime now = LocalDateTime.now();  
	System.out.println(dtf.format(now));
	NumberFormat money = NumberFormat.getCurrencyInstance();
	NumberFormat percentage = NumberFormat.getPercentInstance();
	
	// declaring more variables
	double itemtotalcost1 = cost1*amount1, itemtotalcost2 = cost2*amount2;
	double taxrate = 0.13;
	double subtotal = itemtotalcost1 + itemtotalcost2;
	double taxtotal = subtotal * taxrate;
	double finaltotal = subtotal + taxtotal;
	
	System.out.format("%-10s| %-10s| %-10s| %-10s|", "|Item\t", "Price", "Quant.", "Total Price ");
	System.out.println("\n|___________|___________|___________|_____________|");
	System.out.format("|%-10s | %-10s| %-10s| %-10s  |", item1, money.format(cost1), amount1, money.format(itemtotalcost1));
	
	
	
	
	}

}
