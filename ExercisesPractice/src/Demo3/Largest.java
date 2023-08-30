package Demo3;

import java.util.Arrays;
import java.util.List;

public class Largest {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 12, 3, 4, 3, 13, 17, 2);
		System.out.println("List of numbers: " + nums);

		int secondSmallest = nums.stream().distinct().sorted().skip(1).findFirst().orElse(null);

		int secondLargest = nums.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1).findFirst()
								.orElse(null);

		System.out.println("Second smallest element: " + secondSmallest);
		System.out.println("Second largest element: " + secondLargest);
	}
}