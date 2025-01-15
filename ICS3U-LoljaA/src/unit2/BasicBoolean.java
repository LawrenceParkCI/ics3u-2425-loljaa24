package unit2;
/**
* Description: This program teaches the programmer about boolean
* Date: Nov 4, 2024
* @author Arti Lolja
*/
public class BasicBoolean {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either true or false
    boolean isPurple = false;


    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int firstNum = 5;
    int secondNum = 10;
    double thirdNum = 5.5;

    //this prints out true because firstNum is less than secondNum
    System.out.println("1: " + (firstNum < secondNum)); 

    //this prints out false because firstNum is not greater than secondNum
    System.out.println("2: " + (firstNum > secondNum)); 

    //this prints out true because firstNum is greater than or equal to thirdNum if thirdNum is casted to an integer
    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
    //this prints out true because firstNum is less than or equal to thirdNum
    System.out.println("4: " + (firstNum <= thirdNum)); 

    /*Test out these boolean operators. Figure out the meaning
      * > means: greater than
      * < means: less than
      * <= means: less than or equal to
      * >= means: greater than or equal to
      * == means: equals
      * != means: does not equal
    */

  }
}