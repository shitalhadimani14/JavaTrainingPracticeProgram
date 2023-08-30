package Presentation;

import java.util.function.Predicate;

public class PredicateString {

	public static void main(String[] args) {
		Predicate<String> p = s -> s.length() > 5;

		System.out.println(p.test("Java"));

	}

}
