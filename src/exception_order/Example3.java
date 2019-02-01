package exception_order;

public class Example3 {
	public static void main(String args[]) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}

// Finally is always executed irrespective of error handling 
// A try block can have multiple catch and a single finally block 
