package arrays;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		System.out.println("Enter the size");
		Scanner userInput = new Scanner(System.in);
		int size = userInput.nextInt();

		System.out.println("Enter the array elements ");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = userInput.nextInt();
		}

		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i : array) {
			System.out.println(i);
		}

		userInput.close();
	}
}
