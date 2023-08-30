package Demo3;

import java.util.Arrays;
import java.util.List;

public class AverageList {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(2,2,2,2);
		System.out.println("List of numbers: " + num);

		// Calculate the average using streams

		double avg = num.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println("Average value of the numbers: " + avg);

	}

}
