package Demo3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
	public static void main(String[] args) {

		List<String> lang = Arrays.asList("Java", "Python", "C", "React", "Angular");

		System.out.println("List of strings: " + lang);
		System.out.println();

		List<String> uppercaseStrings = lang.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Uppercase Strings: " + uppercaseStrings);
		
		List<String> lowercaseStrings = lang.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println("Lowercase Strings: " + lowercaseStrings);
	}
}
