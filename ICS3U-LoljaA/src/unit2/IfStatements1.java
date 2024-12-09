package unit2;
/**
* Description: This program is about if else statements
* Date: Nov 5, 2024
* @author Arti Lolja
*/
public class IfStatements1 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
  public static void main(String[] args) {
    int firstNum = 10;
    int secondNum = 30;

    System.out.println("Part 1: If");
    System.out.println("----------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGLUL");
    }    

    //What prints out? Why?
    // nothing prints out because firstNum is not greater than secondNum

    System.out.println("\nPart 2: If, Else");
    System.out.println("----------------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else {
      System.out.println("XQCL");
    }

    //What prints out? Why?
    // XQCL is printed out because firstNum is not greater than secondNum

    System.out.println("\nPart 3: If, Else if, Else");
    System.out.println("-------------------------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    } else {
      System.out.println("XQCL");
    }

    //What prints out? Why?
    //sykSHY is printed out because both firstNum and secondNum are even numbers

    System.out.println("\nPart 4: What's the difference?");
    System.out.println("------------------------------");
    System.out.println(1);
    if (firstNum < secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    } else {
      System.out.println("XQCL");
    }

    System.out.println(2);
    if (firstNum < secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    }

    if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    }

    if (!(firstNum < secondNum)) {
      System.out.println("XQCL");
    }

    //What prints out? Why?
    /*
     * 1
     * KEKW - 		-V
     * OMEGALUL - because firstNum is less than secondNum and its first condition
     * 2
     * KEKW			-V
     * OMEGALUL - because firstNum is less than secondNum
     * sykSHY 	- because firstNum and secondNum are even and prints out if it happens
     */
    //What is the difference between the first and second part?
    // the first part has if, else if, and else statements while the second part has only if statements
  }
}