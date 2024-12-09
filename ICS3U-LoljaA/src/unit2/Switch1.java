package unit2;
import java.util.Scanner;
/**
Description: This program teaches the programmer about the Switch command
Date: Nov 12, 2024
@author Arti Lolja
*/
public class Switch1 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("What number day is it?");
    int day = in.nextInt();

    switch(day) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("We don't have that day yet");
        break;
    }

    //Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result?
    //What do you think default means?
    /*
     * I think default is the equivalent of else for the switch code.
     */
    //What do you think break means? What happens when you remove a break?
    /*
     * I think the break is the equivalent of a closed curly brace. If I remove a break, it continues with the code below it.
     */

    //Create another program, this time asking what day it is (String), and printing out how many days until the weekend

  }
}