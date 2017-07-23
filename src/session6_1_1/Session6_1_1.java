/*Problem Statement : Declare an integer array of size 10.
 * Initialize using for loop with 1 to 10, 
 * and print all even numbers from an array*/
package session6_1_1;

public class Session6_1_1 {
	public static void main(String[] args) {

		int[] even = new int[10]; // Declare integer array of size 10

		for (int i = 0; i < 10; i++) {
			even[i] = i; // assign 10 values to the array elements

			if (even[i] % 2 == 0) { // check if even number by checking for
									// remainder 0
				System.out.println(even[i]); // Print all the even numbers
			}
		}

	}

}
