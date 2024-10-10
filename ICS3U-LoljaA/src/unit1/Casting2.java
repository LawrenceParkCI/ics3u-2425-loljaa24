package unit1;
/**
* Description: This program is a more advanced lesson on casting
* Date: Oct 10, 2024
* @author Arti Lolja 
*/
public class Casting2 {
  /**
   * This is the entry point to the program.
   * @param args unused
   */
  public static void main(String[] args) {
    /*
    Char and int
    */
    char myChar = 'a';
    System.out.println(myChar);
    System.out.println(myChar + 1);

    char myChar2 = (char) (myChar + 1);

    System.out.println(myChar2);

    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
    
    // the variable myChar has a value of a and it is finding what myChar 2 is if 1 was added to myChar.
    // explicit casting happens in the line char myChar 2 = (char) (myChar + 1);
    // implicit casting happens in the line myChar + 1
    
    //Why do you think this happens?
    
    //This happens because it uses the ASCII values to calculate the myChar2 value
    
    //Investigate what is ASCII. What is it?
    
    // ASCII assigns numeric values to characters, (a = 98)
    
    //Can you find the number value for 'a'? Does it match with your findings above?

    // the number value for 'a' is 97. 
    System.out.println(myChar2);
    System.out.println(myChar2 - 1);
    System.out.println(myChar2);
    
    //create a new character myCharCap, and transform myChar into a capital 'A' and print it
    
    

    

  }
}