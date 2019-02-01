package class_getter_return;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter an integer number ");
		Scanner userInput1 = new Scanner(System.in);
		int number = userInput1.nextInt();
		
		FactorialClass fact = new FactorialClass();
		fact.setNumber(number);
		int res = fact.getFactorial();
		System.out.println("Factorial is " + res);
		userInput1.close();
	}
}
