package Demo2;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, Character> map = new HashMap<>();

		// Adding elements to the Map
		// using standard put() method
		map.put("vishal", 'A');
		map.put("Shital", 'C');
		map.put("Harsha", 'D');
		map.put("Akshay", 'F');
		map.put("Amit", 'B');

		System.out.println("Original Hashmap is : " + map);

		Character ch = map.remove("Akshay");

		System.out.println("Removed value : " + ch);

		System.out.println("Updated Hashmap : " + map);

		// Print size and content of the Map
//		System.out.println("Size of map is:- " + map.size());
//
//		// Printing elements in object of Map
//		System.out.println(map);
//		
//		Collections.sort();
	}

}

//HashMap<String, String> map = new HashMap<String, String>();
//
//map.put("Amisha", "A");
//
//map.put("Ravi", "B");
//
//map.put("Gauri", "C");
//
//map.put("Pankaj", "D");
//
//for (Map.Entry m : map.entrySet()) {
//
//	System.out.println(m.getKey() + "---->" + m.getValue());
//
//}
//
//}
