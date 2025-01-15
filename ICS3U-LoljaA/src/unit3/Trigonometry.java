package unit3;
import java.util.Scanner;
/**
 * Description: This is the ICS3U Final Project; an addition to MathPlus---utilizing trigonometric functions.
 * Date: Jan 7, 2025
 * @author Arti Lolja
 */
public class Trigonometry {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Necessary so the user will input necessary informatino to solve the equations.
		boolean restart = true; // Checker to see if the user has typed in the correct response, will repeat if not typed correctly.

		// narrowing down the user's options through if, if else, and else statements

		do { // Do-While loops are necessary so if the user types in an answer that is not an option it can repeat the question
			System.out.println("What trigonometric function do you want to use?");
			System.out.println("1. SOH CAH TOA\n2. SINE LAW\n3. COSINE LAW\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
			String choice = sc.next();
			// Choice for SOH CAH TOA to find the degree of an angle or to find side length
			if (choice.equalsIgnoreCase("1")) {
				System.out.println("\nThe Option SOH CAH TOA is chosen");
				System.out.println("Choose one of the options below:");
				do {
					System.out.println("\n1. SOH (Sin = Opposite/Hypotenuse)\n2. CAH (Cos = Adjacent/Hypotenuse)\n3. TOA (Tan = Opposite/Adjacent)\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
					choice = sc.next();
					// Choice to use SOH to find a side length or the degree of an angle
					if (choice.equals("1") || choice.equals("1.")) {
						System.out.println("\nOption \"SOH\" selected.");
						System.out.println("Are you finding an unknown side or an unknown angle?");
						do {
							System.out.println("\n1. SIDE\n2. ANGLE\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
							choice = sc.next();
							// Choice to find a side length using SOH
							if (choice.equals("1") || choice.equals("1.")) {
								System.out.println("\nOption \"SIDE\" selected.");
								System.out.println("State the angle first (numerical value between 0 and 1) then the opposite and then the hypotenuse.\nState a value of -1 for the unknown side");
								double [] SinSide = new double[3]; // Array with a length of three, angle is SinSide[0], Opposite is SinSide[1], Hypotenuse is SinSide[2].
								for (int i = 0; i < 3; i++) {
									SinSide[i] = sc.nextDouble();
								} double sum = SohCahToaSide(SinSide);
								if (SinSide[1] == -1) { // If the length of the opposite side has to be found.
									// The result below
									System.out.println("The length of the opposite is " + sum + ".");
									// Rounds to one decimal place
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
								if (SinSide[2] == -1) { // If the length of the hypotenuse has to be found.
									// The result below
									System.out.println("The length of the hypotenuse is " + sum + ".");
									// Rounds to one decimal place
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
							}
							// Choice to find the degree of an angle using SOH
							else if (choice.equals("2") || choice.equals("2.")) {
								System.out.println("\nOption \"ANGLE\" selected.");
								System.out.println("State the opposite first and then the hypotenuse: (NUMBERS ONLY)");
								double[] sinAngle = new double[2]; // Array with a length of two, sinAngle[0] is the opposite, sinAngle[1] is the hypotenuse,
								for (int i = 0; i < 2; i++) {
									sinAngle[i] = sc.nextDouble();
								}
								double sum = SohAngle(sinAngle);
								System.out.println("Your two angles are " + sum + "° and " + (90-sum) + "°.");
								// The result below
								// To find the other angle, subtract the found angle by 90
								System.out.println("Rounded, they are " + Math.rint(sum) + "° and " + Math.rint(90-sum) + "°.");
								restart = false;
							}
							else {
								System.out.println("UNKNOWN RESPONSE");
							}
						} while (restart == true);
					}
					// Choice to use CAH to find a side length or the degree of an angle
					else if (choice.equals("2") || choice.equals("2.")) {
						System.out.println("\nOption \"CAH\" selected.");
						System.out.println("Are you finding an unknown side or an unknown angle?");
						do {
							System.out.println("\n1. SIDE\n2. ANGLE\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
							choice = sc.next();
							// Choice to find the side length using CAH
							if (choice.equals("1") || choice.equals("1.")) {
								System.out.println("\nOption \"SIDE\" selected.");
								System.out.println("State the angle first (numerical value between 0 and 1) then the adjacent and then the hypotenuse.\nState a value of -1 for the unknown side");
								double [] CosSide = new double[3]; // Array with a length of three, angle is CosSide[0], Adjacent is CosSide[1], Hypotenuse is CosSide[2].
								for (int i = 0; i < 3; i++) {
									CosSide[i] = sc.nextDouble();
								} double sum = SohCahSide(CosSide);
								if (CosSide[1] == -1) { // If the side length of the adjacent has to be found
									// The result below.
									System.out.println("The length of the adjacent is " + sum + ".");
									// Rounds to one decimal place
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
								if (CosSide[2] == -1) { // If the side length of the hypotenuse has to be found
									// The result below
									System.out.println("The length of the hypotenuse is " + sum + ".");
									// Rounds to one decimal place
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
							}
							// Choice to find the degree of an angle using CAH
							else if (choice.equals("2") || choice.equals("2.")) {
								System.out.println("\nOption \"ANGLE\" selected.");
								System.out.println("State first the adjacent and then the hypotenuse:");
								double[] cosAngle = new double[2]; // Array with a length of two, cosAngle[0] is the adjacent, cosAngle[1] is the hypotenuse
								for (int i = 0; i < 2; i++) {
									cosAngle[i] = sc.nextDouble();
								}
								double sum = CahAngle(cosAngle);
								// The result below
								// To find the other angle, subtract the found angle by 90
								System.out.println("Your two angles are " + sum + "° and " + (90-sum) + "°.");
								System.out.println("Rounded, they are " + Math.round(sum) + "° and " + Math.round(90-sum) + "°.");
								restart = false;
							}
							else {
								System.out.println("UNKNOWN RESPONSE");
							}
						} while (restart == true);
					}
					// Choice to use TOA to find a side length or the degree of an angle
					else if (choice.equals("3") || choice.equals("3.")) {
						System.out.println("\nOption \"TOA\" selected.");
						System.out.println("Are you finding an unknown side or an unknown angle?");
						do {
							System.out.println("\n1. SIDE\n2. ANGLE\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
							choice = sc.next();
							// Choice to find a side length using TOA
							if (choice.equals("1") || choice.equals("1.")) {
								System.out.println("\nOption \"SIDE\" selected.");
								System.out.println("State the angle first (numerical value between 0 and 1) then the opposite and then the adjacent.\nState a value of -1 for the unknown side");
								double [] TanSide = new double[3]; // Array with a length of three, TanSide[0] is the angle, TanSide[1] is the opposite, and TanSide[2] is the adjacent
								for (int i = 0; i < 3; i++) {
									TanSide[i] = sc.nextDouble();
								} 
								double sum = ToaSide(TanSide);
								if (TanSide[1] == -1) { // If the side length of the opposite has to be found
									// The result below
									System.out.println("The length of the adjacent is " + sum + ".");
									// Rounds to one decimal place
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
								if (TanSide[2] == -1) { // If the side length of the hypotenuse has to be found
									// The result below
									System.out.println("The length of the hypotenuse is " + sum + ".");
									// Rounds to one decimal place
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
							}
							// If the degree of an angle has to be found using TOA
							else if (choice.equals("2") || choice.equals("2.")) {
								System.out.println("\nOption \"ANGLE\" selected.");
								System.out.println("State the opposite first and then the adjacent:");
								double[] tanAngle = new double[2];
								for (int i = 0; i < 2; i++) {
									tanAngle[i] = sc.nextDouble();
								}
								double sum = ToaAngle(tanAngle);
								// The result below
								// To find the other angle, subtract the found angle by 90
								System.out.println("Your two angles are " + sum + "° and " + (90-sum) + "°.");
								System.out.println("Rounded, they are " + Math.rint(sum) + "° and " + Math.rint(90-sum) + "°.");
								restart = false;
							}
							else {
								System.out.println("UNKNOWN RESPONSE");
							}
						} while (restart == true);
					}
					else {
						System.out.println("UNKNOWN RESPONSE");
					}
				} while (restart == true);
			}
			// Choice to use sine law to find the degree of an angle or a side length
			else if (choice.equals("2") || choice.equals("2.")) {
				do {
					System.out.println("\nOption \"SINE LAW\" selected.");
					do {
						restart = false;
						System.out.println("Type the four variables in order of (angle A, side A, angle B, side B), type -1 for the one unknown.");
						System.out.println("For angles, make sure it's numerical value is between 0 and 1.");
						double[] sineLaw = new double[4]; // Array with a length of four,  [0] is angle A, [1] is side A. [2] is angle B, [3] is side B
						for (int i = 0; i < 4; i++) {
							sineLaw[i] = sc.nextDouble();
						}
						double sum = SineLaw(sineLaw);
						// If the degree of an angle is being found
						if (sineLaw[0] == -1 || sineLaw[2] == -1) {
							// The results below
							System.out.println("The angle found is " + sum + "°");
							// Rounded to the nearest degree
							System.out.println("Rounded, it is " + Math.rint(sum) + "."); 
							restart = false;
						}
						// If a side length is being found
						if (sineLaw[1] == -1 || sineLaw[3] == -1) {
							// The results below
							System.out.println("The side found is " + sum + "°");
							// Rounded to the nearest degree
							System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
							restart = false;
						}
					} while (restart == true);
				} while (restart == true);
			}
			else if (choice.equals("3") || choice.equals("3.")) {
				// Choice to use the cosine law to find the degree of an angle or a side length
				System.out.println("Option \"COSINE LAW\" selected.");
				System.out.println("Type the six variables in order of (angle A, side A, angle B, side B, angle C, side C)");
				// Each variable has a case where they're not needed, hence the use of the -2 variable.
				System.out.println("Type in -1 for the unknown needed, type in -2 for the unknowns that are not needed to be found currently"); // While all of them are needed at some point, a few pieces are not necesssary
				System.out.println("For angles, make sure it's numerical value is between 0 and 1.");
				double[] cosineLaw = new double[6]; // Array with a length of 6 because six givens need to be filled in.
				for (int i = 0; i < 6; i++) {
					cosineLaw[i] = sc.nextDouble();
				}
				double sum = CosineLaw(cosineLaw);
				// If the degree of an angle has to be found
				if (cosineLaw[0] == -1 || cosineLaw[2] == -1 || cosineLaw[4] == -1) {
					System.out.println("The angle found is " + sum + "°");
					// Rounded to the nearest degree
					System.out.println("Rounded, it is " + Math.rint(sum) + ".");
					restart = false;
				} // If the length of a side has to be found
				if (cosineLaw [1] == -1|| cosineLaw[3] == -1|| cosineLaw[5] == -1) {
					System.out.println("The side found is " + sum + ".");
					// Rounded to one decimal place
					System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
					restart = false;
				}
				else {
					System.out.println("UNKNOWN RESPONSE"); 
				} 
			}
		} while (restart == true);
	}


	/**
	 * Description: Converts an angle from radians to degrees
	 * @param x => the angle in radians
	 * @return => the angle in degrees
	 */
	public static double RadtoDeg(double x) {
		return x * (180/Math.PI);
		/*
		 * Math.sin/cos/tan display results in radians, making this function necessary to display accurate results (in degrees)
		 * The formula is 180 / pi
		 */
	}
	/**
	 * Description: This method finds the way to solve for the two angles using SOH.
	 * @param x => the two side lengths
	 * @return => the first angle
	 */
	public static double SohAngle( double[] x ) {
		// If either of the side lengths are 0 a triangle can't exist
		if (x[0] == 0 || x[1] == 0) {
			return Double.NaN;
		}
		// In the unit circle, sin is between 0 and 1 from 0 degrees to 90 degrees.
		// If opposite divided by the hypotenuse does not get a number greater than 0 and less than 1, it is not a right triangle
		double y = (x[0] / x[1]);
		if (y < 0 && y > 1) {
			return Double.NaN;
		}
		else {
			return RadtoDeg(Math.asin(y));
		}
	}
	/**
	 * Description: This method finds the way to solve for the two angles using CAH.
	 * @param x => the two side lengths
	 * @return => the first angle
	 */
	public static double CahAngle( double[] x ) {
		// If either of the side lengths are 0 a triangle can't exist
		if (x[0] == 0 || x[1] == 0) {
			return Double.NaN;
		}
		double y = (x[0] / x[1]);
		// In the unit circle, cos is between 0 and 1 from 90 degrees to 0 degrees.
		// If adjacent divided by the hypotenuse does not get a number greater than 0 and less than 1, it is not a right triangle
		if (y < 0 && y > 1) {
			return Double.NaN;
		}
		else {
			return RadtoDeg(Math.acos(y));
		}
	}
	/**
	 * Description: This method finds the way to solve for the two angles using TOA.
	 * @param x => the two side lengths
	 * @return => the first angle
	 */
	public static double ToaAngle( double[] x ) {
		// If either of the side lengths are 0 a triangle can't exist
		if (x[0] <= 0 || x[1] <= 0) {
			return Double.NaN;
		}
		double y = (x[0] / x[1]);
		// In the unit circle, tan is between 0 and infinity from 90 degrees to 0 degrees.
		// If opposite divided by the adjacent does not get a number between greater than 0 and less than 1, it is not a right triangle
		if (y < 0) {
			return Double.NaN;
		}
		else {
			return RadtoDeg(Math.atan(y));
		}
	}
	/**
	 * Description: Finds a side length using SOH / CAH
	 * @param x => the known and unknown values of a triangle
	 * @return => the side length
	 */
	public static double SohCahSide( double[] x ) {
		// If the numerical value of the angle is not greater than 0 but less than 1, SOH and CAH can't be used to solve the question.
		if (x[0] < 0 && x[0] > 1) {
			return Double.NaN;
		}
		// If the opposite has to be found using SOH or if the adjacent has to be found using CAH
		if (x[1] == -1) {
			return x[0]*x[2];
		}
		// If the hypotenuse has to be found using SOH or CAH
		else if (x[2] == -1) {
			return x[1]/x[0];
		}
		else {
			return Double.NaN;
		}
	}
	/**
	 * Description: Finds a side length using TOA
	 * @param x => the known and unknown values of the triangle
	 * @return =. the side length
	 */
	public static double ToaSide( double[] x ) {
		// If the numerical value of the angle is less than 0, TOA can't be used to solve the question.
		if (x[0] < 0) {
			return Double.NaN;
		} // If the opposite has to be found using TOA
		if (x[1] == -1) {
			return x[0]*x[2];
		} // If the adjacent has to be found using TOA
		else if (x[2] == -1) {
			return x[1]/x[0];
		}
		else {
			return Double.NaN;
		}
	}
	
	/**
	 * Description: Uses sine law to find a side or an angle
	 * @param x => the known values of the triangle
	 * @return => the side length or the angle
	 */
	public static double SineLaw( double[] x ) {
		/*
		 * The formula for Sine Law is:
		 * Angle A		Angle B
		 * -------  =	-------
		 * Side A		Side B
		 */
		// A check to see if it is possible to use sine law with the numerical values of the angles given.
		if (!(x[0] > 0 && x[0] < 1 && x[0] == -1) || !(x[2] > 0 && x[2] < 1 && x[2] == -1)) {
			return Double.NaN;
		} // I
		else if (x[0] == -1) { // If angle A has to be found
			double y = ((x[1]/x[3])*x[2]);
			return RadtoDeg(Math.asin(y));
		}
		else if (x[1] == -1) { // If side A has to be found
			double y = ((x[3]/x[2])*x[0]);
			return y;
		}
		else if (x[2] == -1) { // If angle B has to be found
			double y = ((x[3]/x[1])*x[0]);
			return RadtoDeg(Math.asin(y));
		}
		else if (x[3] == -1) { // If side B has to be found
			double y = ((x[1]/x[0])*x[2]);
			return y;
		}
		else {
			return Double.NaN;
		}
	}

	/**
	 * Description: This method finds the way to solve for an unknown using cosine law.
	 * @param x => the variables used
	 * @return => the angle or side length found
	 */
	public static double CosineLaw( double[] x ) {
		/*
		 * The formula for cosine law is:
		 * Side C = √(Side A^2 + Side B^2-2 *Side A * Side B * cos AngleC)
		 * OR
		 * 		  		  (Side A^2 - Side B^2 - Side C^2)
		 * Cos^-1 Angle C*(------------------------------)
		 * 		  		  (		-2 * Side A * Side B	 )
		 */
		if (x[0] == -1 && !(x[0] == -2)) { // If Angle A has to be found
			double y = ((Math.pow(x[1], 2) - Math.pow(x[3], 2) - Math.pow(x[5], 2)) / (-2*x[3]*x[5]));
			return RadtoDeg(Math.acos(y));
		}
		if (x[1] == -1 && !(x[1] == -2)) { // If Side A has to be found
			double y = (Math.pow(x[3], 2) + Math.pow(x[5], 2) -2*x[3]*x[5]*x[0]);
			return Math.sqrt(y);
		}
		if (x[2] == -1 && !(x[2] == -2)) { // If Angle B has to be found
			double y = ((Math.pow(x[3], 2) - Math.pow(x[1], 2) - Math.pow(x[5], 2)) / (-2*x[1]*x[5]));
			return RadtoDeg(Math.acos(y));
		}
		if (x[3] == -1 && !(x[3] == -2)) { // If Side B has to be found
			double y = (Math.pow(x[1], 2) + Math.pow(x[5], 2) -2*x[1]*x[5]*x[2]);
			return Math.sqrt(y);
		}
		if (x[4] == -1 && !(x[4] == -2)) { // If Angle C has to be found
			double y = ((Math.pow(x[5], 2) - Math.pow(x[1], 2) - Math.pow(x[1], 2)) / (-2*x[1]*x[3]));
			return RadtoDeg(Math.acos(y));
		}
		if (x[5] == -1 && !(x[5] == -2)) { // If Side C has to be found
			double y =  (Math.pow(x[1], 2) + Math.pow(x[3], 2) -2*x[1]*x[3]*x[4]);
			return Math.sqrt(y);
		}
		else {
			return Double.NaN;
		}
	}
}
