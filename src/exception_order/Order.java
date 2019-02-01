package exception_order;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Order {

	public void run() throws FileNotFoundException {
		FileReader reader = null;

		try {
			reader = new FileReader("C:/Users/Lakshmanan/workspace/cave_of_pgm/src/exception/myfile");
			int number = 8 / 0;
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("File not found");
		} catch (ArithmeticException e) {
			throw new ArithmeticException("IO Exception");
		}
		Scanner in = new Scanner(reader);
		while (in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		in.close();
	}
}
