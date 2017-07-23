/*PROBLEM STATEMENT: 
Using the same arrays, write a program to find the number of days from 
January 1 up to the given date (which is given as Month Day Year combination)*/

package session6_1_4;

import java.util.Scanner;

public class Session6_1_4 {
	public static void main(String[] args) {

		// Initializing number of months in a String array

		String[] total_months = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };

		// Initializing number of days.

		int[] no_of_days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum = 0;

		// Scanner to take input of a given date from user

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the date in MMM-DD-YYYY format (Example.: APR-29-2017)");
		String input_date = scanner.nextLine();
		// seperate different data from the date
		String[] date1 = input_date.split("-");
		scanner.close();
		// convert string to integer
		int DayCount = Integer.parseInt(date1[1]);
		// filter out mixed case characters
		String month = date1[0].toUpperCase();
		// Calculation of number of days
		for (int i = 0; i < 12; i++) {
			if (total_months[i].equals(month)) {
				for (int p = 0; p < i; p++) {
					sum = sum + no_of_days[p];
				}
			}
		}
		sum = sum + DayCount;

		System.out.println("Number of days from JAN-01-2017 to " + input_date.toUpperCase() + " is " + sum);

	}
}
