package loops;

public class ForLoop {
	public static void main(String[] args) {
		System.out.println("Armstrong Number Check");
		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474
		int number = 9;
		int copyNumber = number;
		System.out.println("Given number is " + number);
		int remainder = 0;
		int sum = 0;
		int count = 0;

		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Len of the number is " + count);

		number = copyNumber;
		for (; number != 0;) {
			remainder = number % 10;
			number = number / 10;
			sum = (int) (sum + (Math.pow(remainder, count)));
			System.out.println(sum);
		}

		if (sum == copyNumber) {
			System.out.println(copyNumber + " : I am Armstrong! ");
		} else {
			System.out.println("Try again");
		}

	}

}
