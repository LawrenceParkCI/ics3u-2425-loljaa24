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
		Scanner sc = new Scanner(System.in);
		boolean restart = true; // Check to see if the user wants to repeat the program or not

		// narrowing down the user's options through if, if else, and else statements
		Math.asin(0.0956);

		do {
			System.out.println("What trigonometric function do you want to use?");
			System.out.println("1. SOH CAH TOA\n2. SINE LAW\n3. COSINE LAW\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
			String choice = sc.next();
			if (choice.equalsIgnoreCase("1")) {
				System.out.println("\nThe Option SOH CAH TOA is chosen");
				System.out.println("Choose one of the options below:");
				do {
					System.out.println("\n1. SOH (Sin = Opposite/Hypotenuse)\n2. CAH (Cos = Adjacent/Hypotenuse)\n3. TOA (Tan = Opposite/Adjacent)\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
					choice = sc.next();
					if (choice.equals("1") || choice.equals("1.")) {
						System.out.println("\nOption \"SOH\" selected.");
						System.out.println("Are you finding an unknown side or an unknown angle?");
						do {
							System.out.println("\n1. SIDE\n2. ANGLE\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
							choice = sc.next();
							if (choice.equals("1") || choice.equals("1.")) {
								System.out.println("\nOption \"SIDE\" selected.");
								System.out.println("State the angle first (numerical value between 0 and 1) then the opposite and then the hypotenuse.\nState a value of -1 for the unknown side");
								double [] SinSide = new double[3];
								for (int i = 0; i < 3; i++) {
									SinSide[i] = sc.nextDouble();
								} double sum = SohCahToaSide(SinSide);
								if (SinSide[1] == -1) {
									System.out.println("The length of the opposite is " + sum + ".");
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
								if (SinSide[2] == -1) {
									System.out.println("The length of the hypotenuse is " + sum + ".");
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
							}
							else if (choice.equals("2") || choice.equals("2.")) {
								System.out.println("\nOption \"ANGLE\" selected.");
								System.out.println("State the opposite first and then the hypotenuse: (NUMBERS ONLY)");
								double[] sinAngle = new double[2];
								for (int i = 0; i < 2; i++) {
									sinAngle[i] = sc.nextDouble();
								}
								double sum = SohAngle(sinAngle);
								System.out.println("Your two angles are " + sum + "° and " + (90-sum) + "°.");
								System.out.println("Rounded, they are " + Math.rint(sum) + "° and " + Math.rint(90-sum) + "°.");
								restart = false;
							}
							else {
								System.out.println("UNKNOWN RESPONSE");
							}
						} while (restart == true);
					}
					else if (choice.equals("2") || choice.equals("2.")) {
						System.out.println("\nOption \"CAH\" selected.");
						System.out.println("Are you finding an unknown side or an unknown angle?");
						do {
							System.out.println("\n1. SIDE\n2. ANGLE\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
							choice = sc.next();
							if (choice.equals("1") || choice.equals("1.")) {
								System.out.println("\nOption \"SIDE\" selected.");
								System.out.println("State the angle first (numerical value between 0 and 1) then the adjacent and then the hypotenuse.\nState a value of -1 for the unknown side");
								double [] CosSide = new double[3];
								for (int i = 0; i < 3; i++) {
									CosSide[i] = sc.nextDouble();
								} double sum = SohCahToaSide(CosSide);
								if (CosSide[1] == -1) {
									System.out.println("The length of the adjacent is " + sum + ".");
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
								if (CosSide[2] == -1) {
									System.out.println("The length of the hypotenuse is " + sum + ".");
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
							}
							else if (choice.equals("2") || choice.equals("2.")) {
								System.out.println("\nOption \"ANGLE\" selected.");
								System.out.println("State first the adjacent and then the hypotenuse:");
								double[] cosAngle = new double[2];
								for (int i = 0; i < 2; i++) {
									cosAngle[i] = sc.nextDouble();
								}
								double sum = CahAngle(cosAngle);
								System.out.println("Your two angles are " + sum + "° and " + (90-sum) + "°.");
								System.out.println("Rounded, they are " + Math.round(sum) + "° and " + Math.round(90-sum) + "°.");
								restart = false;
							}
							else {
								System.out.println("UNKNOWN RESPONSE");
							}
						} while (restart == true);
					}
					else if (choice.equals("3") || choice.equals("3.")) {
						System.out.println("\nOption \"TOA\" selected.");
						System.out.println("Are you finding an unknown side or an unknown angle?");
						do {
							System.out.println("\n1. SIDE\n2. ANGLE\n(TYPE IN THE NUMBER CORRELATED WITH THE OPTION)");
							choice = sc.next();
							if (choice.equals("1") || choice.equals("1.")) {
								System.out.println("\nOption \"SIDE\" selected.");
								System.out.println("State the angle first (numerical value between 0 and 1) then the opposite and then the adjacent.\nState a value of -1 for the unknown side");
								double [] CosSide = new double[3];
								for (int i = 0; i < 3; i++) {
									CosSide[i] = sc.nextDouble();
								} 
								double sum = SohCahToaSide(CosSide);
								if (CosSide[1] == -1) {
									System.out.println("The length of the adjacent is " + sum + ".");
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
								if (CosSide[2] == -1) {
									System.out.println("The length of the hypotenuse is " + sum + ".");
									System.out.println("Rounded, it is " + ((Math.rint((sum*10)))/10) + ".");
									restart = false;
								}
							}
							else if (choice.equals("2") || choice.equals("2.")) {
								System.out.println("\nOption \"ANGLE\" selected.");
								System.out.println("State the opposite first and then the adjacent:");
								double[] tanAngle = new double[2];
								for (int i = 0; i < 2; i++) {
									tanAngle[i] = sc.nextDouble();
								}
								double sum = ToaAngle(tanAngle);
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
			else if (choice.equals("2") || choice.equals("2.")) {
				do {
					System.out.println("\nOption \"SINE LAW\" selected.");
					do {
						System.out.println("Type the four knowns in order of (angle A, side A, angle B, side B), type -1 for the one unknown.");
						System.out.println("For angles, make sure it's numerical value is between 0 and 1.");
						double[] sineLaw = new double[4];
						for (int i = 0; i < 4; i++) {
							sineLaw[i] = sc.nextDouble();
						}
						double sum = SineLaw(sineLaw);
						if (sineLaw[0] == -1) {
							System.out.println("Is your angle greater than 90° or less than 90° (TYPE GREATER/LESS)");
							choice = sc.next();
							if (choice.equalsIgnoreCase("GREATER")) {
								System.out.println(sum);
							}
							else if (choice.equalsIgnoreCase("LESS")) {
								System.out.println(sum);
							}
						}
						if (sineLaw[1] == -1) {

						}
						if (sineLaw[2] == -1) {
							System.out.println("Is your angle greater than 90° or less than 90° (TYPE GREATER/LESS)");
							choice = sc.next();
							if (choice.equalsIgnoreCase("GREATER")) {

							}
							else if (choice.equalsIgnoreCase("LESS")) {

							}
						}
						if (sineLaw[3] == - 1) {

						}
					} while (restart == true);
				} while (restart == true);
			}
			else if (choice.equals("3") || choice.equals("3.")) {

			}
			else {
				System.out.println("UNKNOWN RESPONSE");
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
	}
	/**
	 * Description: This method finds the way to solve for the two angles using SOH.
	 * @param x => the two side lengths
	 * @return => the first angle
	 */
	public static double SohAngle( double[] x ) {
		if (x[0] == 0 || x[1] == 0) {
			return Double.NaN;
		}
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
		if (x[0] == 0 || x[1] == 0) {
			return Double.NaN;
		}
		double y = (x[0] / x[1]);
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
		if (x[0] <= 0 || x[1] <= 0) {
			return Double.NaN;
		}
		double y = (x[0] / x[1]);
		if (y < 0 && y > 1) {
			return Double.NaN;
		}
		else {
			return RadtoDeg(Math.atan(y));
		}
	}
	/**
	 * Description: Finds a side length using SOH / CAH / TOA
	 * @param x => the known values of a triangle
	 * @return => the side length
	 */
	public static double SohCahToaSide( double[] x ) {
		if (x[0] < 0 && x[0] > 1) {
			return Double.NaN;
		}
		if (x[1] == -1) {
			return x[0]*x[2];
		}
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
		if (!(x[0] > 0 && x[0] < 1 && x[0] == -1) || !(x[2] > 0 && x[2] < 1 && x[2] == -1)) {
			return Double.NaN;
		}
		if (x[0] == -1) {
			double y = ((x[1]/x[3])*x[2]);
			return RadtoDeg(Math.asin(y));
		}
		else if (x[1] == -1) {
			double y = ((x[3]/x[2])*x[0]);
			return y;
		}
		else if (x[2] == -1) {
			double y = ((x[3]/x[1])*x[0]);
			return RadtoDeg(Math.asin(y));
		}
		else if (x[3] == -1) {
			double y = ((x[1]/x[0])*x[2]);
			return y;
		}
		else {
			return Double.NaN;
		}
	}
}
