package exception_examples;

public class Example1 {

	public static void main(String args[]) {
		Vote vote = new Vote();
		try {
			vote.validate(19);
			System.out.println("Will I execute ?");
			
			vote.validate(9);
			System.out.println("Will I execute ?");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("rest of the code...");
	}
}

class Vote {
	public void validate(int age) {
		if (age < 18)
			throw new ArithmeticException(age + " : Invalid age");
		else
			System.out.println(age + " : welcome to vote ");
	}
}