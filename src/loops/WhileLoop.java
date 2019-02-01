package loops;

public class WhileLoop {
	public static void main(String[] args) {
		int number = 5;
		int i = 1;
		int factorial = 1;
		while (i <= number) {
			factorial = factorial * i;
			i++;
		}
		System.out.println("Factorial of 5 is " + factorial);
		System.out.println("\n****************************************");
		System.out.println("Finding Fibonacci series \n------------------------ ");
		int first = 0;
		int second = 1;
		int step = 5;

		System.out.println(first);
		System.out.println(second);
		int sum = 0;

		while (step >= 0) {
			sum = first + second;
			System.out.println(sum);
			first = second;
			second = sum;
			step--;
		}
		
		System.out.println("\n****************************************");
		System.out.println("Counting digits in a number ");
		int myNumber = 123456789;
		System.out.println("Given number is " +myNumber);

		int count = 0;

		while (myNumber > 0) {
			myNumber = myNumber / 10;
			count++;
			System.out.println(count);
		}

		System.out.println("count is : " + count);
	}
}
