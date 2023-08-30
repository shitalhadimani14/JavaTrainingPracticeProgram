package Demo;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		// int n = 18;
		trynumber(n);
	}

	public static void trynumber(int n) {
		try {
			checkEvenNumber(n);
			System.out.println(n + " is even");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	public static void checkEvenNumber(int number) {
		if (number % 2 != 0) {
			throw new IllegalArgumentException(number + " is odd");
		}
	}
}
