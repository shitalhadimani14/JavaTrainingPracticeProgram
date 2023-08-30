package Demo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		int i = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();

		// factorial using while loop
		while (i <= num) {
			fact = fact * i;
			i++; // increment i by 1
		}

		// printing the result
		System.out.println("\nFactorial of " + num + " is: " + fact);

	}

}
