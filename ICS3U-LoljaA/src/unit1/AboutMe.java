package unit1;
/**
 * Description: This program prints information about the author, Arti Lolja.
 * Date: Sept 20, 2024
 * @author Arti Lolja
 */
public class AboutMe {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		// This prints out information about me
		System.out.println("Hello, my name is Arti Lolja.");	
		System.out.println("Right now, I am in grade 11.");
		System.out.println("My teacher for the ICS3U course is Ms. Kemp.");
		System.out.println("The school I go to is Lawrence Park Collegiate Institute.");
		System.out.println("\"Go Panthers!\"");
		System.out.println("---------------------------------");
		// These next statements display my timetable on the week of September 23-27
		System.out.println("Week of September 23-27 Timetable");
		System.out.println("---------------------------------");
		// CHART VERSION OF TIMETABLE\
		System.out.println("\n____________________________________________________________________________________________________________________________________________");
		System.out.format("%-11s%-25s|%-25s|%-25s|%-25s|%-25s|", "|Periods", "|Monday (23rd)", "Tuesday (24th)", "Wednesday (25th)", "Thursday (26th)", "Friday (27th)");
		System.out.println("\n|__________|________________________|_________________________|_________________________|_________________________|_________________________|");
		System.out.format("%-11s|%-24s|%-25s|%-25s|%-25s|%-25s|", "|Period 1", "ICS3U-1", "BAF3M-3", "ICS3U-1", "BAF3M-3", "ICS3U-1");
		System.out.format("\n%-11s|%-24s|%-25s|%-25s|%-25s|%-25s|", "|", "09:00-10:15", "09:00-10:15", "09:55-10:55", "09:00-10:15", "09:00-10:15");
		System.out.println("\n|__________|________________________|_________________________|_________________________|_________________________|_________________________|");
		System.out.format("%-11s|%-24s|%-25s|%-25s|%-25s|%-25s|", "|Period 2", "BAF3M-3", "ICS3U-1", "BAF3M-3", "ICS3U-1", "BAF3M-3");
		System.out.format("\n%-11s|%-24s|%-25s|%-25s|%-25s|%-25s|", "|", "10:20-11:40", "10:20-11:40", "11:00-12:05", "10:20-11:40", "10:20-11:40");
		System.out.println("\n|__________|________________________|_________________________|_________________________|_________________________|_________________________|");
		System.out.format("%-11s|%-24s|%-25s|%-25s|%-25s|%-25s|", "|Lunch Hour", "Lunch Break", "Lunch Break", "Lunch Break", "Lunch Break", "Lunch Break");
		System.out.format("\n%-11s|%-24s|%-25s|%-25s|%-25s|%-25s|", "|", "11:40-12:40", "11:40-12:40", "12:05-13:05", "11:40-12:40", "11:40-12:40");
		System.out.println("\n|__________|________________________|_________________________|_________________________|_________________________|_________________________|");
		System.out.format("%-11s|%-24s|%-25s|%-25s|%-25s|%-25s|", "|Period 3", "MCR3U1-2", "SCH3U1-4", "MCR3U1-2", "SCH3U1-4", "MCR3U1-2");
		System.out.format("\n%-11s|%-24s|%-25s|%-25s|%-25s|%-25s|", "|", "12:40-13:55", "12:40-13:55", "13:05-14:10", "12:40-13:55", "12:40-13:55");
		System.out.println("\n|__________|________________________|_________________________|_________________________|_________________________|_________________________|");
		System.out.format("%-11s|%-24s|%-25s|%-25s|%-25s|%-25s|", "|Period 4", "SCH3U1-4", "MCR3U1-2", "SCH3U1-4", "MCR3U1-2", "SCH3U1-4");
		System.out.format("\n%-11s|%-24s|%-25s|%-25s|%-25s|%-25s|", "|", "14:00-15:15", "14:00-15:15", "14:15-15:15", "14:00-15:15", "14:00-15:15");
		System.out.println("\n|__________|________________________|_________________________|_________________________|_________________________|_________________________|");
	}

}
