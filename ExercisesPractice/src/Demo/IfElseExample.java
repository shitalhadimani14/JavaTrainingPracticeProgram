package Demo;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = scanner.next().charAt(0);

		if (ch == 'A') {
			System.out.println("Excellent");
		} else if (ch == 'B') {
			System.out.println("Good job!");
		} else if (ch == 'C') {
			System.out.println("Average job");
		} else if (ch == 'D') {
			System.out.println("Needs improvement");
		} else if (ch == 'D') {
			System.out.println("Failed");
		} else {
			System.out.println("Invalid grade");
		}

	}

}