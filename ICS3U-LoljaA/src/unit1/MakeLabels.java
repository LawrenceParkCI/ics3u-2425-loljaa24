package unit1;
import java.util.Scanner;
/**
 * Description: This program teaches the programmer about scanner
 * Date: Oct 2, 2024
 * @author Arti Lolja
 */
public class MakeLabels {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String name;
		String subject;

		System.out.println("Type a subject and press <Enter>");
		subject = sc.nextLine();
		
		System.out.println("Type a name and press <Enter>");
		name = sc.nextLine();
		

		System.out.println("******************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();

	}

}
