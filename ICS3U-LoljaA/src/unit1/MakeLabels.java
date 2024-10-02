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
		
		String subject;
		
		System.out.println("Type in the subject and press <Enter>");
		subject = sc.next();
		
		System.out.println("******************************");
		System.out.println("Tenzin");
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();

	}

}
