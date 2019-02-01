package class_getter_return;

public class FactorialClass {
	int number;
	int factorial = 1;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
