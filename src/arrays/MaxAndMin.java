package arrays;

import java.util.Scanner;

public class MaxAndMin {
	public static void main(String[] args) {
		System.out.println("Enter the size");
		Scanner userInput = new Scanner(System.in);
		int size = userInput.nextInt();

		System.out.println("Enter the array elements ");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = userInput.nextInt();
		}

		int min = array[0];
		int max = array[0];

		for (int i = 0; i < size; i++) {
			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Min is " + min);
		System.out.println("Max is " + max);

		userInput.close();
	}
}
