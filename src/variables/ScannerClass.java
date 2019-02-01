package variables;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		System.out.println("Enter an integer number ");
		Scanner userInput1 = new Scanner(System.in);
		// passing the scanner object to the standard input stream

		int number = userInput1.nextInt();
		System.out.println("What you entered is " + number);
		
		
		System.out.println("*******************************************");
		System.out.println("Enter a string ");
		Scanner userInput2 = new Scanner(System.in);
		String name = userInput2.next();
		System.out.println("Entered name is " + name);
		
		
		System.out.println("*******************************************");
		System.out.println("Enter a float ");
		Scanner userInput3 = new Scanner(System.in); 
		float interest = userInput3.nextFloat(); 
		System.out.println("Interest is " +interest);
		
		
		System.out.println("*******************************************");
		System.out.println("Enter a combination text");
		Scanner userInput4= new Scanner(System.in); 
		String line = userInput4.nextLine(); 
		System.out.println("Entered line is " +line);
		

		userInput1.close();
		userInput2.close();
		userInput3.close();
		userInput4.close();
	}
}
