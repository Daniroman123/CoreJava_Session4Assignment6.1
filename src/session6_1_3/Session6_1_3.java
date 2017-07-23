/*PROBLEM STATEMENT:
Using two arrays, one to store the names of months and the other one to 
store the days in each month.
write a program to find the number of days in a given month.
 *  */

package session6_1_3;

import java.util.Scanner;

public class Session6_1_3 {
	public static void main(String[] args) {

		// Initialize string array of all months

		String[] total_months = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
				"OCTOBER", "NOVEMBER", "DECEMBER" };

		// Initialize corresponding number of days
		int[] no_of_days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the full name of any one month ");
		String month_raw = scanner.nextLine();
		// Filter out any mixed cases
		String month = month_raw.toUpperCase();
		scanner.close();
		// Correlate corresponding month to number of days and print
		for (int i = 0; i < total_months.length; i++) {
			if (total_months[i].equals(month)) {
				System.out.println("number of days in this month are :" + no_of_days[i]);
				break;
			} else {
				continue;
			}

		}

	}
}
