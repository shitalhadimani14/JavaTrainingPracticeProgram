package Demo;

import java.util.Scanner;

public class ReverseStringExample {

		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.print("Enter String: ");
			String str = sc.nextLine();
			String revString = "";

			for (int i = str.length() - 1; i >= 0; i--) {
				revString += str.charAt(i);
			}
			System.out.println("Original String: "+ revString);
			System.out.println("Reverse String: "+ revString);
		
		}

}
