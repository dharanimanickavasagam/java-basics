package final_demo;

public class Main {
	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		fc.number = 8;
		System.out.println(fc.number);

		// you cannot assign a number to PI
		// final is the way for defining CONSTANTS in java
	}
}
