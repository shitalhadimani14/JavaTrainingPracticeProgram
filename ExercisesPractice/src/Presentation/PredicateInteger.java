package Presentation;

import java.util.function.Predicate;

public class PredicateInteger {

	public static void main(String[] args) {

		Predicate<Integer> p= I -> (I > 50);

		System.out.println(p.test(50));

	}

}
