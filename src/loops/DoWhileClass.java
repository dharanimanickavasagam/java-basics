package loops;

import java.util.Scanner;

public class DoWhileClass {
	public static void main(String[] args) {

		System.out.println("Enter a number to check for  strong number ");
		Scanner userInput = new Scanner(System.in);
		int number = userInput.nextInt();
		userInput.close();
		int copyNumber = number;
		int sum = 0;
		int temp = 0;
		int factorial = 1;

		do {
			temp = number % 10;
			for (int i = 1; i <= temp; i++) {
				factorial = factorial * i;
			}
			System.out.println("Fact " + factorial);
			sum = sum + factorial;
			number = number / 10;
			System.out.println("Sum is " + sum);
			factorial =1;
		} while (number != 0);
		
		
	
		if (copyNumber == sum) {
			System.out.println("STRONG ");
		} else {
			System.out.println("WEAK HA HA");
		}

	}
}
