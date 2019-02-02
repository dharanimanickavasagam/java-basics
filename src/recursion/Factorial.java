package recursion;

public class Factorial {
	int factorial = 1;

	int factorial(int no) {
		factorial = factorial * no;
		if (no != 1) {
			factorial(no - 1);
		}
		return factorial;
	}
}
