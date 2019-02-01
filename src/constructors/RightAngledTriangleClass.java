package constructors;

public class RightAngledTriangleClass {
	int number;

	public RightAngledTriangleClass(int number) {
		this.number = number;
	}

	public void printTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
