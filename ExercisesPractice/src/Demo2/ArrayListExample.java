package Demo2;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		// create ArrayList
		ArrayList<Integer> lst = new ArrayList<Integer>();
		int sum = 0;
		lst.add(1);
		lst.add(2);
		lst.add(1);
		lst.add(1);

		for (int i : lst) {
			sum += i;
		}
		System.out.println("ArrayList: " + sum);
	}

}
