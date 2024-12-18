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
		double d1 = distance(5, 4, 6, 7);
		System.out.println(d1);
		double h = hypotenuse(10.0, 5.5);
		System.out.println(h);
		int f = numOfFactors(48);
		System.out.println(f);
		boolean p = isPrime(547);
		System.out.println(p);
	}

	/**
	 * Description: Finds out the distance between two points
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
	 * Description: Finds out the length of the hypotenuse of a right triangle.
	 * @param a => value of side A
	 * @param b => value of side B
	 * @return => the value of the hypotenuse
	 */
	public static double hypotenuse( double a, double b ) {
		double answer = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		return answer;
	}

	/**
	 * Description: Finds how many factors a number has.
	 * @param num1 => the value of the number
	 * @return => value of counter
	 */
	public static int numOfFactors( int num1 ) {
		int counter = 1;
		for (int i = 1; i < num1; i++) {
			if ((num1 % i) == 0) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Description: Determines whether a number is prime or not
	 * @param num1 => value of the number
	 * @return => whether the number is prime or not
	 */
	public static boolean isPrime( int num1) {
		int num2 = num1/2;
		for (int i= 2; i < num2; i++) {
			if ((num1 % i) == 0) {
				return false;
			}
		}
		return true;
	}
}