package loops;

import java.util.Scanner;

public class SwitchClass {
	public static void main(String[] args) {

		System.out.println("Enter your choice");
		Scanner userInput2 = new Scanner(System.in);
		int choice = userInput2.nextInt();

		System.out.println("Enter a number to begin");
		Scanner userInput1 = new Scanner(System.in);
		int number = userInput1.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Frequency of each digit in the entered number");
			int frequency[] = new int[10];
			int temp;

			while (number != 0) {
				temp = number % 10;
				number = number / 10;
				frequency[temp]++;
			}

			System.out.println("Freq of numbers are ");
			for (int i = 0; i < 10; i++) {
				if (frequency[i] != 0) {
					System.out.println("Freqency of " + i + "is " + frequency[i]);
				}
			}
			break;

		case 2:
			System.out.println("Finding factors of a number ");
			System.out.print("The factors are ");
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					System.out.print(i + " ");
				}
			}
			break;

		case 3:
			System.out.println("Enter the value of number2");
			Scanner userInput3 = new Scanner(System.in);
			int num1 = number;
			int num2 = userInput3.nextInt();
			System.out.println("Numbers are " + num1 + " " + num2);
			userInput3.close();
			int i;
			int min = (num1 < num2) ? num1 : num2;
			int max = (num1 > num2) ? num1 : num2;

			int hcf = 1;
			int lcm = 1;
			for (i = 1; i <= min; i++) {
				if ((num1 % i == 0) && (num2 % i == 0)) {
					hcf = i;
				}
			}

			i = max;
			while (true) {
				if ((i % num1 == 0) && (i % num2 == 0)) {
					lcm = i;
					break;
				}
				i++;
			}

			System.out.println("HCF is " + hcf);
			System.out.println("LCM is " + lcm);
			break;

		case 4:
			System.out.println("Perfect number check");
			int sum = 0;
			for (i = 1; i < number; i++) {
				if (number % i == 0) {
					sum = sum + i;
				}
			}
			if (sum == number) {
				System.out.println(number + " is a Perfect Number");
			} else {
				System.out.println(number + " is Not a Perfect Number");

			}
			break;

		default:
			System.out.println("Sorry ! ");
		}

		userInput1.close();
		userInput2.close();

	}
}
