package exception_order;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Order order = new Order();
		try {
			order.run();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
