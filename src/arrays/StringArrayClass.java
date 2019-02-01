package arrays;

import java.util.Scanner;

public class StringArrayClass {
	private static Scanner userInput;

	public static void main(String[] args) {
		System.out.println("Enter the number of students ");
		userInput = new Scanner(System.in);
		int number = userInput.nextInt();

		String[] students = new String[number];
		System.out.println("Enter the students names");

		for (int i = 0; i < students.length; i++) {
			students[i] = userInput.next();

		}

		System.out.println("Student names ");
		for (String i : students) {
			System.out.println(i);
		}

		// watch out
		// java allocates null as default to uninitialized strings and
		// zero to uninitalized variables of type integer

		int val = 0; // must init before you print
		System.out.println("Val is " + val);

		String str = "hi"; // init and use
		System.out.println("Text is " + str);

		str = " "; // init and use
		System.out.println("Text is " + str);

		str = "null"; // init and use
		System.out.println("Text is " + str);

		String[] text = new String[2];
		for (String texts : text) {
			System.out.println(texts);
		}
	}

}
