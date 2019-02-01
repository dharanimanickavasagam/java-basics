package generics;

import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	public String name = "elephant";
}

public class App {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("hey");
		list1.add("What doing");
		System.out.println((String) list1.get(0));

		// Generics
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("hi");
		list2.add("hello");
		System.out.println(list2.get(0));

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Dharu");
		map.put(2, "achu");

		String res = map.get(2);
		System.out.println(res);

		// Java 7 style
		ArrayList<Animal> animal = new ArrayList<>();
		Animal animal1 = new Animal();
		// the type is not expected here
		animal.add(animal1);

		System.out.println(animal.get((0)).name);

	}
}
