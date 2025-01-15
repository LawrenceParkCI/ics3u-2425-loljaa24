package unit1;

import java.util.Scanner;
/**
* Description: This program teaches the programmer about casting 
* Date: Oct 10, 2024
* @author Arti Lolja
*/
public class Casting {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
  public static void main(String[] args) {
    /*
    *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
    */

    System.out.println("Part 1");

    int intNum;
    intNum = 10;

    double doubleNum;
    
    //implicit casting
    doubleNum = intNum;

    //What type of data is printed here? Why?
    System.out.println(doubleNum);
    //The number 10.0 is being printed out because IntNum (10) is converted to a double (10.0).

    //can you explain what is happening in this code?
    doubleNum = doubleNum + 2.2;
    // 2.2 was added to doubleNum
    
    //explicit casting
    intNum = (int) doubleNum;

    //What type of data is printed here? Why?
    System.out.println(intNum);
    // The number 12 was printed out because doubleNum(12.2) was converted to an int (12), and the decimal places were cut off.

    /*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double
      // implicit: doublenum = intnum
      double to int
      //explicit: intnum = (int)doublenum
      int to long
      // implicit: longnum = intnum 
      long to int
      //explicit: intnum = (int)longnum

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
    	converting a smaller data type to a bigger data type is implicit 
        while converting a bigger data type to a smaller data type is explicit
    */
    
    System.out.println("Part 2");

    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
    
    Scanner in = new Scanner(System.in);
    double myNum;
   
    System.out.println("Give me decimal number up to the hundredth");
    myNum = in.nextDouble();
    
    System.out.print("Rounding down to the nearest tenth, it is: ");
    myNum = myNum * 10;
    myNum = Math.rint(myNum);
    myNum = myNum / 10;
    System.out.println(myNum);
    
    
    in.close();
  }
}