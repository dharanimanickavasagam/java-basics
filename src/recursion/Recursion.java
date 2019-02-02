package recursion;

import java.util.Scanner;

public class Recursion implements AutoCloseable {
	int factorial = 1;

	public static void main(String[] args) {
		System.out.println("Enter a number to find the factorial");

		try (Scanner userInput = new Scanner(System.in)) {
			int no = userInput.nextInt();
			Factorial fact = new Factorial();
			System.out.println("Factorial is " + fact.factorial(no));
		} catch (Exception e) {
			System.out.println("You must enter an integer");
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closed");
	}

}
