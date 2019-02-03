package workout;

package workout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		System.out.println("Enter 0 to break userinput ");
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();

		while (input != 0) {
			arrayList.add(input);
			input = userInput.nextInt();
		}
		System.out.println("ArrayList is ");
		System.out.println(arrayList);
		for (int i : arrayList) {
			System.out.println(i);
		}
		// length of the array
		System.out.println("Size of the arraylist is " + arrayList.size());

		// Removing an array element
		System.out.println("Removing the first value " + arrayList.remove(0));
		System.out.println("ArrayList is ");
		for (int i : arrayList) {
			System.out.println(i);
		}

		System.out.println("Enter an element to look up ");
		input = userInput.nextInt();
		System.out.println("Element is present ?: " + arrayList.contains(input));

		// List is an interface, you cannot create a List
		List<String> values = new ArrayList<String>();
		userInput.close();
	}
}
