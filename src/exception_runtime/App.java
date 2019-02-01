package exception_runtime;

public class App {
	public static void main(String[] args) {
		String text = " ";
		
		
		try {
			System.out.println(text.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
