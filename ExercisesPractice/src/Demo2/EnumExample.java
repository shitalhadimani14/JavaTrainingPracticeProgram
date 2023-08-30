package Demo2;

import java.time.YearMonth;
import java.util.Scanner;

public class EnumExample {

	public enum Month{JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AGUST,SEPTEMPER,OCROMBER,NOVEMBER,DECEMBER}

	public static void main(String[] args) {
		
		for(Month m : Month.values())
			System.out.println(m);
		
		int year=2023;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month : ");
		int month=sc.nextInt();
		
		YearMonth yearm=YearMonth.of(year, month);
		int daysInMonth=yearm.lengthOfMonth();
		
		System.out.println("Number of the days in "+yearm.getMonth()+" : "+daysInMonth);
	}

}
