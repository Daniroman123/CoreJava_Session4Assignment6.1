
/*Problem Statement:
Declare and initialize an integer array of size 10. 
Fill it with only prime numbers.
Create another integer array of size 10 and copy the values of the first array 
into second array in the reverse order and print them. */
package session6_1_2;

import java.util.Scanner;

public class Session6_1_2 {
	public static void main(String[] args) {

		int[] prime = new int[10]; // Declare integer array of size 10

		for (int i = 0; i < prime.length; i++) {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter the " + i + "th element which is to be inserted in array of 10 elements");
			int number = scanner.nextInt();

			int flag = 0;

			// checking the condition of prime

			for (int x = 2; x <= number / 2; x++) {
				if (number % x == 0) {
					System.out.println("This is not a prime number, try again");
					i = i - 1;
					flag = 1;
					break;

				}
			}
			if (flag == 0) {
				System.out.println("The is a prime number has been added to the array");
				prime[i] = number;
			}

		}

		// Printing the array of prime numbers that user has entered
		System.out.println("\n\nThe numbers that you have entered are ");
		for (int i = 0; i < 10; i++) {
			System.out.print(prime[i] + ", ");
		}

		// Copying prime number array in to another array in reverse order
		System.out.println("\nThe array in reverse order is ");
		int[] reverse_prime = new int[10];
		for (int i = 0; i < 10; i++) {
			reverse_prime[i] = prime[10 - i - 1];
			System.out.print(reverse_prime[i] + ", ");
		}

	}
}
