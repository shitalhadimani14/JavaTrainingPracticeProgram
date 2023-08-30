package Demo;

import java.util.Scanner;

public class Fact {

	public class Factorial {

		public static void factor(int num) {
			int fact = 1;
			int a = 1;

			while (a <= num) {
				fact = fact * a;
				a++; // increment a by 1

			}
			System.out.println("\nFactorial of " + num + " is: " + fact);
		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			// accepting a number from the user
			System.out.println("Enter a number ");
			int num = sc.nextInt();
			factor(num);

		}
	}
}
