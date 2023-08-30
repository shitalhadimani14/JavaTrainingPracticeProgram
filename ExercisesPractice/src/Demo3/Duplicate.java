package Demo3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,20,10,5,5,30,35,40,40);
		System.out.println("List of numbers: " + nums);
		
		// Remove duplicates
		List<Integer> distinctNumbers = nums.stream().distinct().collect(Collectors.toList());
		System.out.println("\nAfter removing duplicates from the list: " + distinctNumbers);
	}
}
