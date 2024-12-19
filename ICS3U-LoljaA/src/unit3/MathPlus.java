package unit3;

import java.util.Scanner;

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
		// distance method
		double d1 = distance(5, 4, 6, 7);
		System.out.println(d1);

		// hypotenuse method
		double h = hypotenuse(10.0, 5.5);
		System.out.println(h);

		// number of factors method
		int f = numOfFactors(48);
		System.out.println(f);

		// prime number method
		boolean p = isPrime(547);
		System.out.println(p);

		// sum of integers method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integers");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the " + n + " integers one by one.");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sum(arr);
		System.out.println(sum);

		// sum of doubles method
		System.out.println("Enter the number of doubles");
		int m = sc.nextInt();
		double[] arr2 = new double[m];
		System.out.println("Enter the " + m + " doubles one by one.");
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		double sum2 = sum(arr2);
		System.out.println(sum2);

		// min method
		System.out.println("Enter the number of doubles");
		int o = sc.nextInt();
		int[] arr3 = new int[m];
		System.out.println("Enter the " + o + " doubles one by one.");
		for (int i = 0; i < o; i++) {
			arr3[i] = sc.nextInt();
		}
		int sum3 = min(arr3);
		System.out.println(sum3);

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

	/**
	 * Description: Finds the total value of all of the integers in an array
	 * @param num1 =>the amount of numbers in an array
	 * @return => the sum of all of the integers in an array
	 */
	public static int sum( int[] num1 ) {
		int sum = 0;
		for (int i = 0; i < num1.length; i++) {
			sum = sum + num1[i];
		}
		return sum;
	}

	/**
	 * Description: Finds the total value of all of the doubles in an array
	 * @param num1 => the amount of numbers in an array
	 * @return => the sum of all of the doubles in an array
	 */
	public static double sum( double[] num1 ) {
		double sum2 = 0;
		for (int i = 0; i < num1.length; i++) {
			sum2 = sum2 + num1[i];
		}
		return sum2;
	}

	/**
	 * Description: Finds the minimum value of all of the integers in an array
	 * @param x => the amount of integers in an array
	 * @return => the smallest number in an array
	 */
	public static int min(int[] x) {
		int min = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[min] > x[i]) {
				min = i;
			}
		}
		return min;
	}
	
	
	
}