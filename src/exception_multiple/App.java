package exception_multiple;

import java.io.IOException;
import java.text.ParseException;

public class App {
	public static void main(String[] args) {
		Test test = new Test();
		test.setNumber(2);
		
		// test.setNumber(0);
		// test.setNumber(1);
		// test.setNumber(3);

		/* try {
			test.run();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (MyException e) {
			System.out.println(e.getMessage());
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		} */
		
		
		// Java 7 implementation
		try {
			test.run();
		} catch (IOException | MyException | ParseException e) {
			System.out.println(e.getMessage());
		} 
	}
}
