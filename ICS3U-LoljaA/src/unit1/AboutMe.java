package unit1;
/**
 * Description: This program prints information about the author, Arti Lolja.
 * Date: Sept 20, 2024
 * Author: @author Arti Lolja
 */
public class AboutMe {

	public static void main(String[] args) {
		// This prints out information about me
		System.out.println("Hello, my name is Arti Lolja.");	
		System.out.println("Right now, I am in grade 11.");
		System.out.println("My teacher for the ICS3U course is Ms. Kemp.");
		System.out.println("The school I go to is Lawrence Park Collegiate Institute.");
		System.out.println("\"Go Panthers!\"");
		System.out.println("---------------------");
		// These next statements display information about my timetable on Day 1 LRegular schedule
		System.out.println("Week of September 23-27 Timetable");
		System.out.println("---------------------------------");
		System.out.format("\nDay 1 (Monday, Friday): \t%-7sICS3U- %7s", "Period 1:", "09:00-10:15");
		System.out.format("\n\t%33sBAF3M- %-12s", "Period 2:", "10:20-11:40");
		System.out.format("\n\t%37s11:40-12:40", "Lunch Break-\t");
		System.out.format("\n\t%33sMCR3U- %-12s", "Period 3:", "12:40-13:55");
		System.out.format("\n\t%33sSCH3U- %-11s","Period 4:", "14:00-15:15");
		System.out.println("\n--------------------------------------------------------------");
		// These next statements display information about my timetable on Day 1 Late start schedule
		System.out.format("\nDay 1 (Wednesday Late Start): %11sICS3U- %7s", "Period 1:", "09:55-10:55");
		System.out.format("\n%41sBAF3M- %10s", "Period 2:", "11:00-12:05");
		System.out.format("\n\t%37s12:05-13:05", "Lunch Break-\t");
		System.out.format("\n%41sMCR3U- %10s", "Period 3:", "13:05-14:10");
		System.out.format("\n%41sSCH3U- %10s", "Period 4:", "14:15-15:15");
		System.out.println("\n--------------------------------------------------------------");
		// These next statements display information about my timetable on Day 2 Regular Schedule
		System.out.format("\nDay 2 (Tuesday, Thursday): %14sBAF3M- %7s", "Period 1:", "09:00-10:15");
		System.out.format("\n%41sICS3U- %10s", "Period 2:", "10:20-11:40");
		System.out.format("\n\t%37s11:40-12:40", "Lunch Break-\t");
		System.out.format("\n%41sSCH3U- %10s", "Period 3:", "12:40-13:55");
		System.out.format("\n%41sMCR3U- %10s", "Period 4:", "14:00-15:15");
		// CHART VERSION OF TIMETABLE\
		System.out.println("\n_________________________________________________________________________________________________________________________________");
		System.out.format("%-25s|%-25s|%-25s|%-25s|%-25s|", "|Monday (23rd)", "Tuesday (24th)", "Wednesday (25th)", "Thursday (26th)", "Friday (27th)");
		System.out.println("\n|________________________|_________________________|_________________________|_________________________|_________________________|");
		System.out.format("%-25s|%-25s|%-25s|%-25s|%-25s|", "|ICS3U-1", "BAF3M-3", "ICS3U-1", "BAF3M-3", "ICS3U-1");
		System.out.format("\n%-25s|%-25s|%-25s|%-25s|%-25s|", "|9:00-10:15", "9:00-10:15", "9:55-10:55", "9:00-10:15", "9:00-10:15");

	}

}
