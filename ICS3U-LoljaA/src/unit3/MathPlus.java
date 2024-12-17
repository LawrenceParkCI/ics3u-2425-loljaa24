package unit3;
/**
 * Description: This program is about creating different methods
 * Date: Dec 17, 2024
 * @author Arti Lolja
 */
public class MathPlus {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {

	}

	/**
	 * @param x1 => point 1 on x axis
	 * @param y1 => point 1 on y axis
	 * @param x2 => point 2 on x axis
	 * @param y2 => point 2 on y axis
	 * @return => the distance between the two points
	 */
	public static double distance( int x1, int y1, int x2, int y2 )	{
		double answer = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return answer;
	}

	/**
	 * @param a => value of side A
	 * @param b => value of side B
	 * @return => the value of the hypotenuse
	 */
	public static double hypotenuse( double a, double b ) {
		double answer = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		return answer;
	}

	/**
	 * @param num1 => the value of the number
	 * @return => value of counter
	 */
	public static int numOfFactors( int num1) {
		int num2 = num1/2;
		int counter = 0;
		for (int i = 0; i < num2; i++) {
			if ((num1 % i) == 0) {
				counter += 2;
			}
		}
		return counter;
	}

	/**
	 * @param num1 => value of the number
	 * @return => whether the number is prime or not
	 */
	public static boolean isPrime( int num1) {
		int num2 = num1/2;
		for (int i= 1; i < num2; i++) {
			if ((num1 % i) == 0) {
				return false;
			}
		}
		return true;
	}
}