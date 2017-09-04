/**
* An object that lists all the different ways to get a collection positive integers adding up
* to n given a positive integer
* @version
* cs4050 Fall 2017 Project 1
* @author
* Misikir A. Mehari
*/

import java.util.*;

public class Proj1 {
	static Scanner input = new Scanner(System.in);
	static int count = -1;

	public static int get_n_from_console() {
		System.out.print("Enter a positve integer greater than 0: ");
		int n = input.nextInt();

		if (n <= 0) {
			System.out.println("Error! you entered an invalid number");
			System.exit(1);
		}
		return n;
	}

	public static void possible_sums_of_n(int n) {
		possible_sums_of_n(n, n, "");
	}

	public static void possible_sums_of_n(int n, int sum, String sum_possibilities) {
		if (n == 0) {
			count++;
			System.out.println(sum_possibilities.substring(2));
			return;
		}

		for (int i = Math.min(sum, n); i >= 1; i--) {
			possible_sums_of_n(n - i, i, sum_possibilities + " + " + i);
		}
	}

	public static void main(String[] args) {

		int n_input = get_n_from_console();

		System.out.print("\n");

		possible_sums_of_n(n_input);

		System.out.println("\nThe number of possibilties that add up to be " +
		n_input + " are: "+count);
	}

}
